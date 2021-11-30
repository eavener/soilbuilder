package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.SoilTestRepository;
import org.launchcode.soilbuilder.models.SoilTest;
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
@RequestMapping("soil-tests")
public class SoilTestController {

    @Autowired
    private SoilTestRepository soilTestRepository;

    @GetMapping
    public String displayAllSoilTests(Model model) {
        model.addAttribute("title", "All Soil Tests");
        model.addAttribute("soilTests", soilTestRepository.findAll());
        return "soil-tests/index";
    }

    @GetMapping("create")
    public String renderCreateSoilTestsForm(Model model) {
        model.addAttribute("title", "Create Soil Test");
        model.addAttribute("soilTest", new SoilTest());
        return "soil-tests/create";
    }

    @PostMapping("create")
    public String processCreateSoilTestsForm(@ModelAttribute @Valid SoilTest newSoilTest, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Soil Test");
            model.addAttribute(new SoilTest());
            return "soil-tests/create";
        }
        soilTestRepository.save(newSoilTest);
        return "redirect:";
    }

}
