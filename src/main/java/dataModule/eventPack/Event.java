package dataModule.eventPack;

import exceptions.validateExceptions.EventDateValidateException;
import exceptions.validateExceptions.EventNameValidateException;
import exceptions.validateExceptions.EventTypeValidateException;

import java.time.LocalDateTime;

public class Event {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDateTime date; //Поле может быть null
    private EventType eventType; //Поле не может быть null


    public void validate(String name) {
        if(!name.isBlank()) {
            this.name = name;
            System.out.println("Установленно!");
        }
        else {
            throw new EventNameValidateException("Имя некорректно");
        }
    }

    public void validate(LocalDateTime date) {
        if(date!= null) {
            this.date = date;
            System.out.println("Установленно!");
        }
        else throw new EventDateValidateException("Дата некорректна");
    }

    public void validate(EventType eventType) {
        if(eventType!= null) {
            this.eventType = eventType;
            System.out.println("Установленно!");
        }
        else throw new EventTypeValidateException("Тип события некорректен");
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