package dataModule.ticketPack;
import dataModule.eventPack.Coordinates;
import dataModule.eventPack.Event;
import exceptions.validateExceptions.*;

import java.time.ZonedDateTime;
import java.util.Vector;

public class Ticket {
    private long nextId = 1;
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer price; //Поле может быть null, Значение поля должно быть больше 0
    private Long discount; //Поле не может быть null, Значение поля должно быть больше 0, Максимальное значение поля: 100
    private Boolean refundable; //Поле может быть null
    private TicketType type; //Поле не может быть null
    private Event event; //Поле может быть null
    private String ticketFilePath = "C:\\Stud\\Programming-LAB5\\src\\main\\java\\DataModule\\TicketPack\\TicketFile.csv";
    private int rowPos;

    public Ticket() {
        generateTicketID();
        generateCreationDate();
    }

    Vector<Vector<String>> toCSV = new Vector<>();

    private void generateCreationDate(){
        creationDate = ZonedDateTime.now();
    }
    private void generateTicketID(){
        id = getNextId();
    }
    private long getNextId(){
        return nextId++;
    }

    public long getId() {
        return id;
    }

    public void validate(String name) {
        if(!name.isBlank()) {
            this.name = name;
            System.out.println("Установленно!");
        }
        else {
            throw new TicketNameValidateException("Имя некорректно");
        }
    }

    public void setCoordinates(Coordinates coordinates) {
        if(coordinates != null){
            this.coordinates = coordinates;
            System.out.println("Установленно!");
        }
        else throw new IllegalArgumentException("Координаты не могут быть пустыми");
    }
    public void validate(Long discount) {
        if(discount > 0 && discount<=100 ) {
            this.discount = discount;
            System.out.println("Установленно!");
        }
        else throw new TicketDiscountValidateException("Скидка должна быть > 0 и <100");
    }
    public void validate(Boolean refundable) {
        if(refundable != null) {
            this.refundable = refundable;
            System.out.println("Установленно!");
        }
        else throw new TicketRefundableValidateException("Укажите возможно ли возвращение с помощью true или false");
    }
    public void validate(TicketType type) {
        if(type!=null) {
            this.type = type;
            System.out.println("Установленно!");
        }
        else throw new TicketTypeValidateException("type не может быть null");
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public void validate(Integer price) {
        if(price > 0) {
            this.price = price;
            System.out.println("Установленно!");
        }
        else throw new TicketPriceValidateException("Цена должна быть больше 0, как иначе заработать?");
    }

}
