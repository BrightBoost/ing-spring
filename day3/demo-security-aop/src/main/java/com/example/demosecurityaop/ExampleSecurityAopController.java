package com.example.demosecurityaop;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleSecurityAopController {

    public List<String> list = new ArrayList<>(Arrays.asList("maaike", "user", "tripti", "samuel"));

    @Secured("ROLE_USER")
    @GetMapping("hi-user")
    public String sayHiUser() {
        //show get username from context
        return "Hi user";
    }

    @Secured("ROLE_USER")
    @PostFilter("filterObject == authentication.name")
    @GetMapping("getuser")
    public List<String> getUser() {
        System.out.println(list);
        return list;
    }

    @Secured("ROLE_ADMIN")
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("hi-admin")
    public String sayHiAdmin() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        //show get username from context
        return "Hi " + username;
    }

    @GetMapping("hi-open")
    public String sayHiOpen() {
        //show get username from context
        return "Hi open";
    }


}
