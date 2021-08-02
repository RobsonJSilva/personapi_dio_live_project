package one.digitalinnovation.personapi_dio_live_project.repository;

import one.digitalinnovation.personapi_dio_live_project.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
