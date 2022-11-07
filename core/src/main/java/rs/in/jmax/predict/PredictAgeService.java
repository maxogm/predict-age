package rs.in.jmax.predict;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PredictAgeService {

    private final PredictAgeGateway predictAgeGateway;

    public PredictAge predictAge(String name) {
        return predictAgeGateway.predictAge(name);
    }

}