package cl.zenta.example.advocate.controllers;

import cl.zenta.example.advocate.entities.Role;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok().build();
    }
}
