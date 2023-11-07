package com.example.microcervice1.Camel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Camelcontroller {


    @GetMapping("/amal-repo")
    public String findUserById() {
        // Implement
        return  "AMAL XAVIOUR THE proprietor OF TESTING MAVENS DEALING WITH HIGH END PROFFESIONALS NAMED AS AKHIL,JISMY,SANDRAA,GAYATRI,AMAL PS ,ELIZEBETH,ARUN,ALEN,UNNI";
    }


}