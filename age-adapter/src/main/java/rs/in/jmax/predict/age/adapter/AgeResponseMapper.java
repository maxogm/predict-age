package rs.in.jmax.predict.age.adapter;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import rs.in.jmax.predict.service.PredictAge;

@Mapper
public interface AgeResponseMapper {

    AgeResponseMapper INSTANCE = Mappers.getMapper(AgeResponseMapper.class);

    PredictAge toDomain(AgeResponse ageResponse);

}
