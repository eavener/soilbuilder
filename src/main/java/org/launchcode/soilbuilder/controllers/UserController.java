package org.launchcode.soilbuilder.controllers;


import org.launchcode.soilbuilder.data.UserRepository;
import org.launchcode.soilbuilder.models.Seed;
import org.launchcode.soilbuilder.models.User;
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
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(@ModelAttribute @Valid User newUser, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add User");
            model.addAttribute(new User());
            return "user/add";
        }
        userRepository.save(newUser);
        return "redirect:";
    }
}
