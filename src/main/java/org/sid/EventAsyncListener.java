package org.sid;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.context.event.EventListener;

@Component
@Log4j2
public class EventAsyncListener {

    @Async
    @EventListener
    public void handleCreatedUserAsyncEvent(UserCreatedEvent userCreatedEvent) {
            log.info(userCreatedEvent);
    }

    @Async
    @EventListener
    public void handleRemovedUserAsyncEvent(UserRemovedEvent userRemovedEvent) {
        log.info(userRemovedEvent);
    }
}
