package co.com.bancolombia.usecase.person;

import co.com.bancolombia.model.personmodel.PersonModel;
import co.com.bancolombia.model.personmodel.gateways.PersonModelRepository;
import co.com.bancolombia.usecase.person.gateways.EventPublisher;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PersonUseCase {

    private final PersonModelRepository personModelRepository;
    private final EventPublisher eventPublisher;

    public Mono<PersonModel>createPerson(PersonModel personModel)
    {
        return personModelRepository.createPerson(personModel)
                .map(person1 -> {eventPublisher.publish(person1);
                    return  person1;
                });
    }
}
