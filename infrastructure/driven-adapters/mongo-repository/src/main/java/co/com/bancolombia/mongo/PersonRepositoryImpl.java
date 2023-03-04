package co.com.bancolombia.mongo;


import co.com.bancolombia.model.personmodel.PersonModel;
import co.com.bancolombia.model.personmodel.gateways.PersonModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class PersonRepositoryImpl implements PersonModelRepository {

    private final MongoRepositoryAdapter dto;
    @Override
    public Mono<PersonModel> getPerson(String id) {
        return null;
    }

    @Override
    public Mono<PersonModel> createPerson(PersonModel personModel) {
        return dto.save(personModel);
    }
}
