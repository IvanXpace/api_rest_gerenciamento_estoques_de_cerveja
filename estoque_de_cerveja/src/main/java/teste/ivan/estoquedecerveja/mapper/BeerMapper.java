package teste.ivan.estoquedecerveja.mapper;

import teste.ivan.estoquedecerveja.dto.BeerDTO;
import teste.ivan.estoquedecerveja.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
