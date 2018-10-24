package cl.zenta.example.advocate.repositories;

import cl.zenta.example.advocate.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{
}
