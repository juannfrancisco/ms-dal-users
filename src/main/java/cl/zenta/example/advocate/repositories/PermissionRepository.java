package cl.zenta.example.advocate.repositories;

import cl.zenta.example.advocate.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
