package LabSheet10.Exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;


    public PermanentLecturer(String nm, String add, GregorianCalendar dob, String sID, String[] ct, GregorianCalendar doa, String pensionEntitlements, String status) {
        super(nm, add, dob, sID, ct, doa);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { //e.g. full time, part-time, etc.
        this.status = status;
    }

    @Override
    public int getPointOnScale() {
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked =  today.get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH) ||
        (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH) &&
        today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        //Lecturer = full years worked;
        if(yearsWorked>=20)
            return 20;
        else
            return yearsWorked;
    }

    public String toString() {
        return super.toString() + "\nLecturer Pension Entitlements is: " + getPensionEntitlements();
    }
}
