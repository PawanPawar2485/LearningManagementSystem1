package in.lms.service;

import in.lms.entity.EntityLayer;
import in.lms.repository.RepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceLayer {

    @Autowired
    private RepositoryLayer repositoryLayer;

    // Save entity
    public EntityLayer save(EntityLayer entity) {
        return repositoryLayer.save(entity);
    }

    // Find by email
    public Optional<EntityLayer> findByEmail(String email) {
        return Optional.empty();
    }
}
