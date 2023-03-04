package co.com.bancolombia.events;


import co.com.bancolombia.model.personmodel.PersonModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class RabbitMQEventHandler {

    public static final String EVENTS_QUEUE = "events.queue";

    private final Logger LOGGER = Logger.getLogger("RabbitMQEventHandler");

    @RabbitListener(queues = EVENTS_QUEUE)
    public  void consume(PersonModel personModel){
        LOGGER.info(String.format("Received message -> %s",personModel.toString()));
    }
}
