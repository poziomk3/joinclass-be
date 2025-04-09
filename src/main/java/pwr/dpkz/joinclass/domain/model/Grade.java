package pwr.dpkz.joinclass.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {

    @Id
    @GeneratedValue
    private UUID id;

    private Float score;
    private String feedback;
    private Instant gradedAt;
    private String fileUrl;

    @ManyToOne
    @JoinColumn(name = "grader_id")
    private GoogleUser gradedBy;
}
