package org.sid;

import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@ToString
public class UserCreatedEvent extends ApplicationEvent {
    private String name;
    public UserCreatedEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
