package main;

import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class CheckInLog {
    private ArrayList<CheckIn> _checkinlist;

    public CheckInLog(){
        _checkinlist = new ArrayList<CheckIn>();
    }

    public void addCheckIn(Person p, AppointmentType a, Date d) {
        _checkinlist.add(new CheckIn(p, a, d));
    }

    public void printCheckIns() {
        Iterator<CheckIn> iter = _checkinlist.iterator();
        System.out.println("----- Check-in Log -----");
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.print("\n");
    }

    public void printLastCheckIn(Person p) {
        Iterator<CheckIn> iter = _checkinlist.iterator();
        AppointmentType last_appt = null;
        Date date = null;
        while(iter.hasNext()) {
            CheckIn temp = iter.next();
            if (temp.getPerson() == p) {
                last_appt = temp.getAppointmentType();
                date = temp.getDate();
            }
        }
        if (last_appt != null) {
            System.out.println(p.getName() + " last checked in for " + last_appt + " on " + date);
        } else {
            System.out.println(p.getName() + " has never checked in");
        }
    }
}