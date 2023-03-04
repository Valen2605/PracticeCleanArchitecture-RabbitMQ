package co.com.bancolombia.api;

import co.com.bancolombia.model.personmodel.PersonModel;
import co.com.bancolombia.model.personmodel.gateways.PersonModelRepository;
import co.com.bancolombia.usecase.person.PersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
  private  final PersonUseCase personUseCase;
  private PersonModelRepository personModelRepository;
    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> createPerson(ServerRequest serverRequest) {
        Mono<PersonModel> personMono = serverRequest.bodyToMono((PersonModel.class));
        return personMono.flatMap(person -> ServerResponse.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON)
                .body(personUseCase.createPerson(person), PersonModel.class));
    }


}
