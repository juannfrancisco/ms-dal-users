package cl.zenta.example.advocate.controllers;

import cl.zenta.example.advocate.entities.Role;
import cl.zenta.example.advocate.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

    @Autowired
    private RoleServices services;

    @RequestMapping(method = RequestMethod.POST)
    public void save( @RequestBody Role object ){
        services.save( object );
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Role> findAll(){
        return services.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Role findById(@PathVariable("id") Long id){
        return services.findById(id);
    }
}
