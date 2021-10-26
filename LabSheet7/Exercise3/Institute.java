package LabSheet7.Exercise3;

public class Institute {
    private String instituteName;
    private Department departments[];

    Institute (String instituteName, Department[] departments) {
        setInstituteName(instituteName);
        setDepartment(departments);
    }

    public void setInstituteName(String instituteName) {
        this.instituteName=instituteName;
    }
    public void setDepartment(Department[] departments) {
        this.departments=departments;
    }

    public String getInstituteName() {
        return instituteName;
    }
    public Department[] getDepartments() {
        return departments;
    }

    public String toString() {
        String str = "Name: " + getInstituteName() + "\n\nDepartments: ";

        for(int i=0; i<getDepartments().length; i++)
            if(departments[i] != null)
                str += departments[i];

        return str;
    }

    public int getTotalStudents() {
        int numStudents=0;
        Student[] students;

        for(int i=0; i<departments.length; i++) {
            if(departments[i] != null) {
                students = departments[i].getStudents();

                for(int j=0; j<students.length; j++) {
                    if(students[j] != null)
                        numStudents++;
                }
            }
        }
        return numStudents;
    }
}
