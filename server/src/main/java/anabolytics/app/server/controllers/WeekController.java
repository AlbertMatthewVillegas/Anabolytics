package anabolytics.app.server.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anabolytics.app.server.dtos.WeekRequest;
import anabolytics.app.server.dtos.WeekResponse;
import anabolytics.app.server.services.WeekService;

@RestController
@RequestMapping("/weeks")
public class WeekController {

    private final WeekService weekService;

    public WeekController(WeekService weekService) {
        this.weekService = weekService;
    }

    @PostMapping
    public ResponseEntity<WeekResponse> createWeek(@RequestBody WeekRequest request) {
        WeekResponse response = weekService.createWeek(request);
        return ResponseEntity.status(201).body(response);
    }
}
