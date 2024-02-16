package ControlModule;

import DataModule.EventPack.Coordinates;
import DataModule.EventPack.Event;
import DataModule.EventPack.EventType;
import DataModule.TicketPack.Ticket;
import DataModule.TicketPack.TicketType;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();

    }
}