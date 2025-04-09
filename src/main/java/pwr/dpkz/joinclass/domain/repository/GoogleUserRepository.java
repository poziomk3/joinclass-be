package pwr.dpkz.joinclass.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pwr.dpkz.joinclass.domain.model.GoogleUser;

import java.util.Optional;
import java.util.UUID;

public interface GoogleUserRepository extends JpaRepository<GoogleUser, UUID> {
    Optional<GoogleUser> findByEmail(String email);
}
