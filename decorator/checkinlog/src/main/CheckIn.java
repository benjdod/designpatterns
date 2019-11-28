package main;

import java.util.Date;

public class CheckIn implements PersonDecorator {

    // CheckIn is a decorator of the Person type which holds relevant 
    // information about a person's checkin

    private AppointmentType _appttype;
    private Date _date;

    private Person _person;

    public CheckIn(Person person, AppointmentType appointment_type, Date date) {
        _person = person;
        _appttype = appointment_type;
        _date = date;
    }

    // the unwrapping method (returns the original person)

    public Person getPerson() {
        return _person;
    }


    // methods which retrieve variables from the wrapped Person 

    public String getName() {
        return _person.getName();
    }

    public int getID() {
        return _person.getID();
    }


    // methods for accessing the CheckIn variables 
    // (new methods inherited from the PersonDecorator interface)

    @Override
    public AppointmentType getAppointmentType() {
        return _appttype;
    }

    @Override
    public Date getDate() {
        return _date;
    }

    
    // convenience method for printing a CheckIn instance to the console

    public String toString() {
        return _person.getName() + " (" + _person.getID() + ")" + " checked in for " + _appttype + " on " + _date;
    }
}