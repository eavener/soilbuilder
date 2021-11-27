package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.SeedRepository;
import org.launchcode.soilbuilder.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("seeds")
public class SeedController {

    @Autowired
    private SeedRepository seedRepository;

    @GetMapping
    public String displayAllSeeds(Model model) {
        model.addAttribute("title", "All Seeds");
        model.addAttribute("seeds", seedRepository.findAll());
        return "seeds/index";
    }

    @GetMapping("create")
    public String renderCreateSeedForm(Model model) {
        model.addAttribute("title", "Create Seed");
        model.addAttribute("seed", new Seed());
        model.addAttribute("suns", LightNeeds.values());
        model.addAttribute("waters", WaterNeeds.values());
        model.addAttribute("heights", Heights.values());
        model.addAttribute("widths", Spreads.values());
        model.addAttribute("families", Family.values());
        model.addAttribute("nativities", Nativity.values());
        return "seeds/create";
    }

    @PostMapping("create")
    public String processCreateSeedForm(@ModelAttribute @Valid Seed newSeed, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Seed");
            model.addAttribute(new Seed());
            return "seeds/create";
        }
        seedRepository.save(newSeed);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteSeedForm(Model model) {
        model.addAttribute("title", "Delete Seeds");
        model.addAttribute("seeds", seedRepository.findAll());
        return "seeds/delete";
    }

    @PostMapping("delete")
    public String processDeleteSeedForm(@RequestParam(required = false) int[] seedIds) {
        if (seedIds != null) {
            for (int id : seedIds) {
                seedRepository.deleteById(id);
            }
        }
        return "redirect:";
    }
}
