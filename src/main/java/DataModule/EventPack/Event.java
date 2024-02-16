package DataModule.EventPack;

import DataModule.NameSetter;
import DataModule.TicketPack.Ticket;

import java.time.LocalDateTime;

public class Event implements NameSetter {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDateTime date; //Поле может быть null
    private EventType eventType; //Поле не может быть null

    @Override
    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Имя некорректно");
        }
    }

    public void setDate(LocalDateTime date) {
        if(date!= null) {
            this.date = date;
        }
        else throw new IllegalArgumentException("Дата некорректна");
    }

    public void setEventType(EventType eventType) {
        if(eventType!= null) {
            this.eventType = eventType;
        }
        else throw new IllegalArgumentException("Тип события некорректен");
    }


    public String getName() {
        return name;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }
}