package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.HeightRepository;
import org.launchcode.soilbuilder.models.Height;
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
@RequestMapping("height")
public class HeightController {

    @Autowired
    private HeightRepository heightRepository;

    @GetMapping
    public String displayAllHeights(Model model) {
        model.addAttribute("title", "All Heights");
        model.addAttribute("heights", heightRepository.findAll());
        return "height/index";
    }

    @GetMapping("create")
    public String renderCreateHeightForm(Model model) {
        model.addAttribute("title", "Create Height");
        model.addAttribute("height", new Height());
        return "height/create";
    }

    @PostMapping("create")
    public String processCreateHeightForm(@ModelAttribute @Valid Height newHeight, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Height");
            model.addAttribute(new Height());
            return "height/create";
        }
        heightRepository.save(newHeight);
        return "redirect:";
    }
}
