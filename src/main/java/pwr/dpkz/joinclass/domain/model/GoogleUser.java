package pwr.dpkz.joinclass.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoogleUser {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String googleId;

    private String profileImageUrl;
    private Instant lastLogin;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Room> ownedRooms = new ArrayList<>();

    @ManyToMany(mappedBy = "students")
    private List<Room> joinedRooms = new ArrayList<>();

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Submission> submissions = new ArrayList<>();

    @OneToMany(mappedBy = "gradedBy", cascade = CascadeType.ALL)
    private List<Grade> givenGrades = new ArrayList<>();
}
