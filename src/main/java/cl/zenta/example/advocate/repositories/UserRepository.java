package cl.zenta.example.advocate.repositories;

import cl.zenta.example.advocate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
