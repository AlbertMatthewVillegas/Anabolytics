package anabolytics.app.server.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anabolytics.app.server.entities.MuscleEntity;
import anabolytics.app.server.repositories.MuscleRepository;

@RestController
@RequestMapping("/muscles")
public class MuscleController {

    private final MuscleRepository muscleRepository;

    public MuscleController(MuscleRepository muscleRepository) {
        this.muscleRepository = muscleRepository;
    }

    @GetMapping
    public List<MuscleEntity> getAllMuscles() {
        return muscleRepository.findAll();
    }
}
