package org.sid;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Publisher {
    private final ApplicationEventPublisher eventPublisher;

    public void publishEvent() {

        // Async event listener
        eventPublisher.publishEvent(new UserCreatedEvent(this, "created event 1"));
        eventPublisher.publishEvent(new UserRemovedEvent("removed event 1"));

        // conditional event listener
        eventPublisher.publishEvent(new UserCreatedEvent(this, "conditional"));
        eventPublisher.publishEvent(new UserRemovedEvent("conditional"));
    }
}
