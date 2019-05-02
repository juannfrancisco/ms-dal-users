package cl.zenta.example.advocate.controllers;


import cl.zenta.example.advocate.entities.User;
import cl.zenta.example.advocate.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserServices services;


    @RequestMapping(method = RequestMethod.POST)
    public void signUp( @RequestBody User user ){
        services.signUp( user );
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(){
        return services.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public User findById(@PathVariable("id") Long id){
        return services.findById(id);
    }

}
