package one.digitalinnovation.personapi_dio_live_project.mapper;

import one.digitalinnovation.personapi_dio_live_project.dto.request.PersonDTO;
import one.digitalinnovation.personapi_dio_live_project.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
