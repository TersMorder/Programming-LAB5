package DataModule.CommandPack.Commands;

import DataModule.CommandPack.CommandsEnum;
import DataModule.CommandPack.Executer;
import DataModule.EventPack.Coordinates;
import DataModule.EventPack.Event;
import DataModule.TicketPack.Ticket;
import java.util.Scanner;

public class Add extends CommandParent implements Executer {
    public Add() {
        super(CommandsEnum.ADD);
        this.name = CommandsEnum.ADD;
    }
    @Override
    public void execute() {
        Ticket ticket = new Ticket();
        Coordinates coordinates = new Coordinates();
        Event event = new Event();
        Scanner reader = new Scanner(System.in);
        boolean fieldComplited = false;
        String input;
        while (!fieldComplited) {
            try {
                System.out.println("Введите имя билета");
                System.out.println("Поле не может быть пустым");
                input = reader.nextLine();
                ticket.setName(input);
                fieldComplited = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        fieldComplited = false;
        while (!fieldComplited){
            try {
                System.out.println("Введите 'x' координату места в котором находится мероприятие");
                System.out.println("Поле не может быть > 718");
                input = reader.nextLine();
                coordinates.setX(Integer.parseInt(input));
                fieldComplited = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        fieldComplited = false;
        while (!fieldComplited){
            try {
                System.out.println("Введите 'y' координату места в котором находится мероприятие");
                input = reader.nextLine();
                coordinates.setY(Double.parseDouble(input));
                fieldComplited = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        fieldComplited = false;
        while (!fieldComplited){
            try {
                System.out.println("Введите цену билета");
                System.out.println("поле должно быть > 0 и не может быть пустым");
                input = reader.nextLine();
                ticket.setPrice(Integer.valueOf(input));
                fieldComplited = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        fieldComplited = false;
        while (!fieldComplited){
            try {
                System.out.println("Введите скидку, которая действует на билет");
                System.out.println("Поле не может быть пустым и его значение должно находиться в диапазоне (0;100]");
                input = reader.nextLine();
                ticket.setDiscount(Long.valueOf(input));
                fieldComplited = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        fieldComplited = false;
        while (!fieldComplited){
            try {
                System.out.println("Возможно ли вернуть билет?");
                System.out.println("Поле может быть только true или false");
                input = reader.nextLine();
                ticket.setRefundable(Boolean.valueOf(input));
                fieldComplited = true;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }


    }

}