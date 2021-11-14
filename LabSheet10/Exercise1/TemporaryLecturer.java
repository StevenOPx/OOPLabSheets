package LabSheet10.Exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {
    private int hoursWorked;

    public TemporaryLecturer(String nm, String add, GregorianCalendar dob, String sID, String[] ct, GregorianCalendar doa, int hoursWorked) {
        super(nm, add, dob, sID, ct, doa);
        setHoursWorked(hoursWorked);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public int getPointOnScale() {
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked =  GregorianCalendar.getInstance().get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH) ||
                (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH) &&
                        today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        if(yearsWorked>=3 && yearsWorked>1500)
            return 4;
        else if (yearsWorked>3 && yearsWorked>1000)
            return (int) (hoursWorked/700f*1.33)+1;
        else
            return yearsWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked();
    }
}
