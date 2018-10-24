package cl.zenta.example.advocate.services;

import cl.zenta.example.advocate.entities.User;
import cl.zenta.example.advocate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;


    @Autowired
    private BCryptPasswordEncoder encoder;

    /**
     *
     * @param user
     */
    public void signUp(User user){
        user.setPassword( encoder.encode(user.getPassword()) );
        repository.save(user);
    }


    /**
     *
     * @return
     */
    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        return repository.findById(id).get();
    }
}
