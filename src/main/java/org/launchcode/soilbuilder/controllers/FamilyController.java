package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.FamilyRepository;
import org.launchcode.soilbuilder.models.Family;
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
@RequestMapping("family")
public class FamilyController {

    @Autowired
    private FamilyRepository familyRepository;

    @GetMapping
    public String displayAllFamilies(Model model) {
        model.addAttribute("title", "All Families");
        model.addAttribute("families", familyRepository.findAll());
        return "family/index";
    }

    @GetMapping("create")
    public String renderCreateFamilyForm(Model model) {
        model.addAttribute("title", "Create Family");
        model.addAttribute("family", new Family());
        return "family/create";
    }

    @PostMapping("create")
    public String processCreateFamilyForm(@ModelAttribute @Valid Family newFamily, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Family");
            model.addAttribute(new Family());
            return "family/create";
        }
        familyRepository.save(newFamily);
        return "redirect:";
    }
}
