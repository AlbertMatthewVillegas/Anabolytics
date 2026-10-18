package anabolytics.app.server.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "muscles")
@Getter
@Setter
@NoArgsConstructor
public class MuscleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID muscleId;

    private String muscleType;

    private String muscleGroup;
}
