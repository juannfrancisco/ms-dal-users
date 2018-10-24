package cl.zenta.example.advocate.services;

import cl.zenta.example.advocate.entities.Role;
import cl.zenta.example.advocate.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServices {

    @Autowired
    private RoleRepository repository;


    @Autowired
    private BCryptPasswordEncoder encoder;

    /**
     *
     * @param object
     */
    public void save(Role object){
        repository.save(object);
    }


    /**
     *
     * @return
     */
    public List<Role> findAll(){
        return repository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Role findById(Long id){
        return repository.findById(id).get();
    }
}
