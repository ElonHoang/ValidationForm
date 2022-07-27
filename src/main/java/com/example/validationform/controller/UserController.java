package com.example.validationform.controller;

import com.example.validationform.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/get")
    public String goToIndex(Model model){
        model.addAttribute("user",new User());
        return "form";
    }
    @PostMapping("/post")
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult rs){
        if(rs.hasErrors()){
            return "form";
        }
        return "form";
    }
}
