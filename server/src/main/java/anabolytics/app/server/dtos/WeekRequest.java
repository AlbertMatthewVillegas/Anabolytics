package anabolytics.app.server.dtos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
public class WeekRequest {

    @Getter
    @Setter
    @NoArgsConstructor
    public class DayOfTheWeek {
        private short day;
        private List<Session> sessions;

        public DayOfTheWeek(short day, List<Session> sessions) {
            this.day = day;
            this.sessions = sessions;
        }
    }

    
    @Getter
    @Setter
    @NoArgsConstructor
    public class Session {
        private List<Muscle> muscles;

        public Session(List<Muscle> muscles) {
            this.muscles = muscles;
        }
    }

    @Getter 
    @Setter
    @NoArgsConstructor 
    public class Muscle {
        private String muscleType;
        private String muscleGroup;

        public Muscle(String muscleType, String muscleGroup) {
            this.muscleType = muscleType;
            this.muscleGroup = muscleGroup;
        }
        
    }

    private List<DayOfTheWeek> daysDayOfTheWeek;

    public WeekRequest(List<DayOfTheWeek> daysDayOfTheWeek) {
        this.daysDayOfTheWeek = daysDayOfTheWeek;
    }
}



