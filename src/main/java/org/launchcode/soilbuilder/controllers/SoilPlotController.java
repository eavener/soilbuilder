package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.LightRepository;
import org.launchcode.soilbuilder.data.SoilPlotRepository;
import org.launchcode.soilbuilder.data.WaterRepository;
import org.launchcode.soilbuilder.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("soil-plots")
public class SoilPlotController {

    @Autowired
    private SoilPlotRepository soilPlotRepository;

    @Autowired
    private LightRepository lightRepository;

    @Autowired
    private WaterRepository waterRepository;

    @GetMapping
    public String displayAllSoilPlots(Model model) {
        model.addAttribute("title", "All Soil Plots");
        model.addAttribute("soilPlots", soilPlotRepository.findAll());
        return "soil-plots/index";
    }

    @GetMapping("create")
    public String renderCreateSoilPlotsForm(Model model) {
        model.addAttribute("title", "Create Soil Plot");
        model.addAttribute("soilPlot", new SoilPlot());
        model.addAttribute("lights", lightRepository.findAll());
        model.addAttribute("waters", waterRepository.findAll());

        return "soil-plots/create";
    }

    @PostMapping("create")
    public String processCreateSoilPlotsForm(@ModelAttribute @Valid SoilPlot newSoilPlot, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Soil Plot");
            model.addAttribute(new SoilPlot());
            return "soil-plots/create";
        }
        soilPlotRepository.save(newSoilPlot);
        return "redirect:";
    }
}
