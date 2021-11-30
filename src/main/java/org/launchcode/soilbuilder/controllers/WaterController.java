package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.WaterRepository;
import org.launchcode.soilbuilder.models.Water;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("water")
public class WaterController {

    @Autowired
    private WaterRepository waterRepository;

    @GetMapping
    public String displayAllWaters(Model model) {
        model.addAttribute("title", "All Waters");
        model.addAttribute("waters", waterRepository.findAll());
        return "water/index";
    }

    @GetMapping("create")
    public String renderCreateWaterForm(Model model) {
        model.addAttribute("title", "Create Water");
        model.addAttribute("water", new Water());
        return "water/create";
    }

    @PostMapping("create")
    public String processCreateWaterForm(@ModelAttribute @Valid Water newWater, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Water");
            model.addAttribute(new Water());
            return "water/create";
        }
        waterRepository.save(newWater);
        return "redirect:";
    }
}
