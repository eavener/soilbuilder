package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.LightRepository;
import org.launchcode.soilbuilder.models.Light;
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
@RequestMapping("light")
public class LightController {

    @Autowired
    private LightRepository lightRepository;

    @GetMapping
    public String displayAllLights(Model model) {
        model.addAttribute("title", "All Lights");
        model.addAttribute("lights", lightRepository.findAll());
        return "light/index";
    }

    @GetMapping("create")
    public String renderCreateLightForm(Model model) {
        model.addAttribute("title", "Create Light");
        model.addAttribute("light", new Light());
        return "light/create";
    }

    @PostMapping("create")
    public String processCreateLightForm(@ModelAttribute @Valid Light newLight, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Light");
            model.addAttribute(new Light());
            return "light/create";
        }
        lightRepository.save(newLight);
        return "redirect:";
    }
}
