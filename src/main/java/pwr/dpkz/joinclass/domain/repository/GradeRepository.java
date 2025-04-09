package pwr.dpkz.joinclass.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pwr.dpkz.joinclass.domain.model.Grade;

import java.util.List;
import java.util.UUID;

public interface GradeRepository extends JpaRepository<Grade, UUID> {
    List<Grade> findByGradedById(UUID graderId);
}
