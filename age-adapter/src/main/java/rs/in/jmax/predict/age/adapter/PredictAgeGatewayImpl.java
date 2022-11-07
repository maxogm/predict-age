package rs.in.jmax.predict.age.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.in.jmax.predict.service.PredictAge;
import rs.in.jmax.predict.service.PredictAgeGateway;

@Service
@RequiredArgsConstructor
public class PredictAgeGatewayImpl implements PredictAgeGateway {

    private final PredictAgeClient predictAgeClient;

    @Override
    public PredictAge predictAge(String name) {
        return AgeResponseMapper.INSTANCE.toDomain(predictAgeClient.predict(name));
    }

}