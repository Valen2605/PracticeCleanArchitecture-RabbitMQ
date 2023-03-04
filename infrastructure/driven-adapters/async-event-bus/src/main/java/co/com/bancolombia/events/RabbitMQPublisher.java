package co.com.bancolombia.events;


import co.com.bancolombia.model.personmodel.PersonModel;
import co.com.bancolombia.usecase.person.gateways.EventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQPublisher implements EventPublisher {

    public static final String EXCHANGE = "core-posts-events";

    public static final String ROUTING_KEY = "events.routing.key";

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private RabbitTemplate rabbitTemplate;

    public RabbitMQPublisher(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(PersonModel personModel){

    }

    @Override
    public void publish(PersonModel personModel) {
        LOGGER.info(String.format("Message sent -> %s", personModel.toString()));
        rabbitTemplate.convertAndSend(EXCHANGE,ROUTING_KEY,personModel);

    }


}
