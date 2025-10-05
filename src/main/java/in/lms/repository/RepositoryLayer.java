package in.lms.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import in.lms.entity.EntityLayer;

import java.util.Optional;

public interface RepositoryLayer extends JpaRepository<EntityLayer, Long> {
    Optional<EntityLayer> findByEmail(String email);
}
