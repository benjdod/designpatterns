package main;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Person sumar = new PersonImpl("Sumar", "Raj");
        Person franz = new PersonImpl("Franz", "Hasengschwandtner");
        Person diana = new PersonImpl("Diana", "Reiter");
        Person ben = new PersonImpl("Ben", "Dod");

        CheckInLog log = new CheckInLog();

        SimpleDateFormat df = new SimpleDateFormat("M/d/y k:m");

        log.addCheckIn(sumar, AppointmentType.SOCIAL, df.parse("10/29/19 10:27"));
        log.addCheckIn(franz, AppointmentType.BUSINESS, df.parse("10/29/19 11:12"));
        log.addCheckIn(sumar, AppointmentType.SOCIAL, df.parse("10/29/19 19:45"));
        log.addCheckIn(diana, AppointmentType.LEGAL, df.parse("10/30/19 8:27"));
        log.addCheckIn(sumar, AppointmentType.SOCIAL, df.parse("10/30/19 10:34"));
        log.addCheckIn(diana, AppointmentType.LEGAL, df.parse("10/31/19 8:17"));
        log.addCheckIn(franz, AppointmentType.SOCIAL, df.parse("10/31/19 22:18"));

        log.printCheckIns();
        
        log.printLastCheckIn(sumar);
        log.printLastCheckIn(ben);

    }
}