package main;

import java.util.Map;

public class CheckIn {

    public enum CheckInType {BUSINESS, SOCIAL, LEGAL};

    private Person _person;
    private CheckInType _type;

    private static int _id = 0;

    private static Map<Integer,CheckIn> _checkins;

    public CheckIn(Person person, CheckInType type) {
        _person = person;
        _type = type;
    }
    
    public void addCheckIn(Person person, CheckInType type) {
        _checkins.put(_id, new CheckIn(person, type));
        _id++;
    }
}