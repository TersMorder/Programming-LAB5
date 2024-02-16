package DataModule.TicketPack;
import DataModule.EventPack.Coordinates;
import DataModule.EventPack.Event;
import DataModule.NameSetter;

import java.time.ZonedDateTime;
import java.util.Vector;

public class Ticket implements NameSetter {
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
    Vector<Ticket> collection = new Vector<>();
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
    @Override
    public void setName(String name) {
        if(!name.isBlank()) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Имя некорректно");
        }
    }

    public void setCoordinates(Coordinates coordinates) {
        if(coordinates != null){
            this.coordinates = coordinates;
        }
        else throw new IllegalArgumentException("Координаты не могут быть пустыми");
    }
    public void setDiscount(Long discount) {
        if(discount > 0 && discount<=100 ) {
            this.discount = discount;
        }
        else throw new IllegalArgumentException("Скидка должна быть > 0 и <100");
    }
    public void setRefundable(Boolean refundable) {
        if(refundable != null) {
            this.refundable = refundable;
        }
        else throw new IllegalArgumentException("Укажите возможно ли возвращение с помощью true или false");
    }
    public void setType(TicketType type) {
        this.type = type;
    }
    public void setEvent(Event event) {
        this.event = event;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

}
