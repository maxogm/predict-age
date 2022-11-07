package rs.in.jmax.predict.service;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PredictAge {

    private String name;
    private Integer age;

}
