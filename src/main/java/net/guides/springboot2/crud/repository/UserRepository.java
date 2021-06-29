package net.guides.springboot2.crud.repository;

import net.guides.springboot2.crud.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String userame);
}
