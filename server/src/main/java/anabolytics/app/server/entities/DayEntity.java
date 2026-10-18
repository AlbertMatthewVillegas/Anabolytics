package anabolytics.app.server.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CheckConstraint;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
    name = "days",  check = @CheckConstraint(
    name = "chk_days_day_of_week",
    constraint = "day_of_week BETWEEN 1 AND 7")
)
@Getter 
@Setter
@NoArgsConstructor
public class DayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID dayId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "week_id", nullable = false)
    private WeekEntity week;

    @Column(name = "day_of_week", nullable = false)
    private short dayOfWeek;

    @OneToMany(mappedBy = "day", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SessionEntity> sessions = new ArrayList<>();

    public DayEntity(WeekEntity week, short dayOfWeek, List<SessionEntity> sessions) {
        this.week = week;
        this.dayOfWeek = dayOfWeek;
        this.sessions = sessions;
    }


    
}
