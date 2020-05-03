package org.sid;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class EventConditionalListener {

    @Async
    @EventListener(condition = "#userCreatedEvent.name eq 'conditional' ")
    public void handleUserCreatedConditionalEvent(UserCreatedEvent userCreatedEvent) {
        log.info(userCreatedEvent);
    }
}
