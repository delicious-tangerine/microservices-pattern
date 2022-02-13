package business.publisher;

import java.util.List;

import business.domain.Domain;
import business.event.DomainEvent;

public class DomainEventPublisher {
    public void publish(Domain domain, Long orderId, List<DomainEvent> events) {
        // 이벤트 발행
        // kafka rabbitMq 등 publish 코드 구현
    }
}
