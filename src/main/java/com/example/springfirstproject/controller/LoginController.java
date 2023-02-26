package com.example.springfirstproject.controller;

import com.example.springfirstproject.model.Role;
import com.example.springfirstproject.model.User;
import com.example.springfirstproject.responsitory.RoleResponsitory;
import com.example.springfirstproject.responsitory.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
@Autowired
    UserRespository userRespository;
@Autowired
    RoleResponsitory roleResponsitory;
@GetMapping("/login")
    public String login(){
    return "login";
}
@GetMapping("/register")
    public  String registerGet(){
    return "register";
}
@PostMapping("/register")
    public String registerPost(@ModelAttribute("user")User user, HttpServletRequest request)throws ServletException {
    String password=user.getPassword();
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    List<Role> roles=new ArrayList<>();
    roles.add(roleResponsitory.findById(2).get());
    user.setRoles(roles);
    userRespository.save(user);
    request.login(user.getEmail(),password);
    return "redirect:/";
}
}
