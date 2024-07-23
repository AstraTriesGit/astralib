package org.astralib.members.controllers;

import org.astralib.members.models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping(path = "/")
    public static String helloWorld() {
        return "Damn, this shit up.";
    }
}
