package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.SpreadRepository;
import org.launchcode.soilbuilder.models.Spread;
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
@RequestMapping("spread")
public class SpreadController {

    @Autowired
    private SpreadRepository spreadRepository;

    @GetMapping
    public String displayAllSpreads(Model model) {
        model.addAttribute("title", "All Spreads");
        model.addAttribute("spreads", spreadRepository.findAll());
        return "spread/index";
    }

    @GetMapping("create")
    public String renderCreateSpreadForm(Model model) {
        model.addAttribute("title", "Create Spread");
        model.addAttribute("spread", new Spread());
        return "spread/create";
    }

    @PostMapping("create")
    public String processCreateSpreadForm(@ModelAttribute @Valid Spread newSpread, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Spread");
            model.addAttribute(new Spread());
            return "spread/create";
        }
        spreadRepository.save(newSpread);
        return "redirect:";
    }
}
