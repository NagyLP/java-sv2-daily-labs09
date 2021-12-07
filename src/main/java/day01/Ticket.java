package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String band;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String bandName, LocalDateTime startTime, int price) {
//        super();
        this.band = band;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.toLocalTime().minusHours(1);
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}
