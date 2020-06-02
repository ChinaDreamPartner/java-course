package com.experiment07.ticket.entity;

import java.util.LinkedList;
import java.util.List;

public class TrainDepartment {
    private static final List<Ticket> tickets = create();
    private static List<Ticket> create(){
        List<Ticket> tickets = new LinkedList<>();
        for (int i = 0; i < 200; i++) {
            Ticket t = new Ticket(i,"harbin","beijing");
            tickets.add(t);
        }
        return tickets;
    }
    public static synchronized Ticket getTicket(){
        Ticket t = null;
        if(tickets.size() > 0){
            t = tickets.get(0);
            tickets.remove(t);
        }
        return t;
    }
}
