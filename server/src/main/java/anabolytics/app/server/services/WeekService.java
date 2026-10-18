package anabolytics.app.server.services;

import org.springframework.stereotype.Service;

import anabolytics.app.server.dtos.WeekRequest;
import anabolytics.app.server.dtos.WeekResponse;
import anabolytics.app.server.repositories.DayRepository;
import anabolytics.app.server.repositories.MuscleRepository;
import anabolytics.app.server.repositories.SessionRepository;
import anabolytics.app.server.repositories.WeekRepository;
import jakarta.transaction.Transactional;

@Service
public class WeekService {

    private final WeekRepository weekRepository;
    private final DayRepository dayRepository;
    private final SessionRepository sessionRepository;
    private final MuscleRepository muscleRepository;

    public WeekService(
            WeekRepository weekRepository,
            DayRepository dayRepository,
            SessionRepository sessionRepository,
            MuscleRepository muscleRepository) {
        this.weekRepository = weekRepository;
        this.dayRepository = dayRepository;
        this.sessionRepository = sessionRepository;
        this.muscleRepository = muscleRepository;
    }

    @Transactional 
    public WeekResponse createWeek(WeekRequest request) {
        
        return new WeekResponse();
    }
}
