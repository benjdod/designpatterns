package main;

import java.util.Date;

public interface PersonDecorator extends Person {

    public Person getPerson();
    public AppointmentType getAppointmentType();
    public Date getDate();

}

