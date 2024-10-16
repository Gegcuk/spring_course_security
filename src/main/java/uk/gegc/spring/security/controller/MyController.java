package uk.gegc.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @GetMapping("/")
    public String getInfoOfAllEmployees(){
        return "all-employee-info-view";
    }

    @GetMapping("/hr-info")
    public String getInfoOnlyForHR(){
        return "view-for-HR";
    }

    @GetMapping("/manager-info")
    public String getInfoOnlyForManagers(){
        return "view-for-managers";
    }

}
