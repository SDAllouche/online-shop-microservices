package ma.sda.orderservice.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * In this class we'll add all the manual configuration required for Observability to
 * work.
 */
//@Configuration(proxyBeanMethods = false)
//@RequiredArgsConstructor
public class ManualConfiguration {

    /*private final KafkaTemplate kafkaTemplate;

    @PostConstruct
    void setup() {
        this.kafkaTemplate.setObservationEnabled(true);
    }*/

}
