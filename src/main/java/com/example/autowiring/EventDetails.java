package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventDetails {
    Sports sports;
    @Autowired
    @Qualifier("football")
    public void setSports(Sports sports) {
        this.sports = sports;
    }

    Sports nsports;
    @Autowired
    @Qualifier("cricket")
    public void setNsports(Sports nsports) {
        this.nsports = nsports;
    }

    Sports msports;
    @Autowired
    @Qualifier("hockey")
    public void setMsports(Sports msports) {
        this.msports = msports;
    }



    public List<String> printEvent(String choice){
        if(choice.equalsIgnoreCase("cricket")) {
            System.out.println("Cricket :");
            return nsports.showPlayers();
        }
        else if(choice.equalsIgnoreCase("football")) {
            System.out.println("Football :");
            return sports.showPlayers();
        }
        else{
            System.out.println("Hockey :");
            return msports.showPlayers();
        }
    }
}
