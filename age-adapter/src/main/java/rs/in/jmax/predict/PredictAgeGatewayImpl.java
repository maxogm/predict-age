package rs.in.jmax.predict;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PredictAgeGatewayImpl implements PredictAgeGateway {

    private final PredictAgeClient predictAgeClient;

    @Override
    public PredictAge predictAge(String name) {
        return AgeResponseMapper.INSTANCE.toDomain(predictAgeClient.predict(name));
    }

}