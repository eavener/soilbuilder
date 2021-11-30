package org.launchcode.soilbuilder.controllers;

import org.launchcode.soilbuilder.data.*;
import org.launchcode.soilbuilder.models.*;
import org.launchcode.soilbuilder.models.dto.SeedTagDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("seeds")
public class SeedController {

    @Autowired
    private SeedRepository seedRepository;

    @Autowired
    private FamilyRepository familyRepository;

    @Autowired
    private HeightRepository heightRepository;

    @Autowired
    private LightRepository lightRepository;

    @Autowired
    private SpreadRepository spreadRepository;

    @Autowired
    private WaterRepository waterRepository;

    @Autowired
    private TagRepository tagRepository;

    @GetMapping
    public String displayAllSeeds(@RequestParam(required = false) Integer familyId, Model model) {
        if (familyId == null) {
            model.addAttribute("title", "All Seeds");
            model.addAttribute("seeds", seedRepository.findAll());
        } else {
            Optional<Family> result = familyRepository.findById(familyId);
            if (result.isEmpty()) {
                model.addAttribute("title", "Invalid Family ID: " + familyId);
            } else {
                Family family = result.get();
                model.addAttribute("title", "Seeds in family: " + family.getName());
                model.addAttribute("events", family.getSeeds());
            }
        }
        return "seeds/index";
    }

    @GetMapping("create")
    public String renderCreateSeedForm(Model model) {
        model.addAttribute("title", "Create Seed");
        model.addAttribute("seed", new Seed());
        model.addAttribute("family", familyRepository.findAll());
        model.addAttribute("light", lightRepository.findAll());
        model.addAttribute("height", heightRepository.findAll());
        model.addAttribute("spread", spreadRepository.findAll());
        model.addAttribute("water", waterRepository.findAll());
        model.addAttribute("tag", tagRepository.findAll());

        return "seeds/create";
    }

    @PostMapping("create")
    public String processCreateSeedForm(@ModelAttribute @Valid Seed newSeed, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Seed");
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

    @GetMapping("detail")
    public String displaySeedDetails(@RequestParam Integer seedId, Model model) {
        Optional<Seed> result = seedRepository.findById(seedId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Event ID: " + seedId);
        } else {
            Seed seed = result.get();
            model.addAttribute("title", seed.getCommonName() + " Details");
            model.addAttribute("seed", seed);
            model.addAttribute("tags", seed.getTags());
        }
        return "seeds/detail";
    }

    @GetMapping("add-tag")
    public String displayAddTagForm(@RequestParam Integer seedId, Model model) {
        Optional<Seed> result = seedRepository.findById(seedId);
        Seed seed = result.get();
        model.addAttribute("title", "Add tag to: " + seed.getCommonName());
        model.addAttribute("tags", tagRepository.findAll());
        SeedTagDTO seedTag = new SeedTagDTO();
        seedTag.setSeed(seed);
        model.addAttribute("seedTag", seedTag);
        return "seeds/add-tag.html";
    }

    @PostMapping("add-tag")
    public String processAddTagForm(@ModelAttribute @Valid SeedTagDTO seedTag, Errors errors, Model model){
        if (!errors.hasErrors()) {
            Seed seed = seedTag.getSeed();
            Tag tag = seedTag.getTag();
            if (!seed.getTags().contains(tag)){
                seed.addTag(tag);
                seedRepository.save(seed);
            }
            return "redirect:detail?eventId= " + seed.getId();
        }
        return "redirect:add-tag";
    }
}