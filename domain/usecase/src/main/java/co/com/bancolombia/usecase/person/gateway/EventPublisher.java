package co.com.bancolombia.usecase.person.gateway;

import co.com.bancolombia.model.personmodel.PersonModel;

public interface EventPublisher {

    void publish(PersonModel personModel);
}
