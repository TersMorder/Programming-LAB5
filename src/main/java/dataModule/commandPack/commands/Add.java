package dataModule.commandPack.commands;

import dataModule.commandPack.CommandsEnum;
import dataModule.commandPack.Executer;
import dataModule.eventPack.Coordinates;
import dataModule.eventPack.Event;
import dataModule.eventPack.EventType;
import dataModule.ticketPack.Ticket;
import dataModule.ticketPack.TicketType;
import exceptions.validateExceptions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add extends CommandParent implements Executer {
    public Add() {
        super(CommandsEnum.ADD);
        this.name = CommandsEnum.ADD;
    }
    @Override
    public void execute() {
        AddMessages addMessages = new AddMessages();
        Ticket ticket = new Ticket();
        Coordinates coordinates = new Coordinates();
        Event event = new Event();
        Scanner reader = new Scanner(System.in);
        String input;
        List<String> keys = new ArrayList<>(addMessages.keySet());
        System.out.println(keys);
        for(int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            try {
                switch (key) {
                    //Короче запишу идею тут, создать классы валидаторов, добавить что-то вроде того, что ниже, и надо понять как эту стену раскидать, или сократить,
                    // и нужно с помощью другой абстракции эксепшнов обойти проблему с парсерами, тогда по сути будет прям очень эффективная штука
                    case "name":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        ticket.validate(input);
                        break;
                    case "x":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        coordinates.validate(Integer.parseInt(input));
                        break;
                    case "y":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        coordinates.setY(Double.parseDouble(input));
                        break;
                    case "price":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        ticket.validate(Integer.parseInt(input));
                        break;
                    case "discount":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        ticket.validate(Long.parseLong(input));
                        break;
                    case "refundable":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        ticket.validate(Boolean.parseBoolean(input));
                        break;
                    case "type":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        ticket.validate(TicketType.valueOf(input));
                        break;
                    case "eventName":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        event.validate(input);
                        break;
                    case "date":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                        event.validate(LocalDateTime.parse(input, formatter));
                        break;
                    case "eventType":
                        System.out.println(addMessages.getMassageByKey(key));
                        input = reader.nextLine();
                        event.validate(EventType.valueOf(input));
                        break;
                }
            }
            catch (ValidateException e){
                System.out.println(e.getMessage());
                i = e.getMapPos();
            }

        }
        ticket.setCoordinates(coordinates);
        ticket.setEvent(event);
    }

}