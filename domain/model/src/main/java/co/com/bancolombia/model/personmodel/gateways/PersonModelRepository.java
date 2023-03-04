package co.com.bancolombia.model.personmodel.gateways;

import co.com.bancolombia.model.personmodel.PersonModel;
import reactor.core.publisher.Mono;

public interface PersonModelRepository {

    Mono<PersonModel> getPerson(String id);
    Mono<PersonModel> createPerson(PersonModel personModel);
}
