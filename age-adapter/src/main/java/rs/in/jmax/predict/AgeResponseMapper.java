package rs.in.jmax.predict;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AgeResponseMapper {

    AgeResponseMapper INSTANCE = Mappers.getMapper(AgeResponseMapper.class);

    PredictAge toDomain(AgeResponse ageResponse);

}
