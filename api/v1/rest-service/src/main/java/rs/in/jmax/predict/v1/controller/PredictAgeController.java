package rs.in.jmax.predict.v1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rs.in.jmax.predict.service.PredictAge;
import rs.in.jmax.predict.service.PredictAgeService;

@RestController
@RequiredArgsConstructor
public class PredictAgeController {

    private final PredictAgeService predictAgeService;

    @GetMapping(path = "/predict")
    public PredictAge predict(@RequestParam(value = "name") String name) {
        return predictAgeService.predictAge(name);
    }

}