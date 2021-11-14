package LabSheet10.Exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String nm, String add, GregorianCalendar dob, String sID, String[] ct, GregorianCalendar doa) {
        setName(nm);
        setAddress(add);
        setDateOfBirth(dob);
        setStaffID(sID);
        setCoursesTaught(ct);
        setDateOfAppointment(doa);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    @Override
    public String toString() {
        String str = "Lecturer Name: " + getName() +
                "\nLecturer Address: " + getAddress() +
                "\nLecturer Date of Birth: ";

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        if (getDateOfBirth() != null)
        {
            Date dob = getDateOfBirth().getTime();

            String strDob = formatDate.format(dob);
            str+=strDob;
        }

        else
            str += "Undefined";

        str += "\nLecturer StaffID is " + getStaffID() +
                "\nLecturer Courses Taught are " + Arrays.toString(getCoursesTaught()) +
                "\nLecturer Date of Appointment is " + formatDate.format(getDateOfAppointment().getTime()) +
                "\nLecturer Status is " + getStatus() +
                "\nLecturer Point on Scale is " + getPointOnScale();

        return str;
    }
}
