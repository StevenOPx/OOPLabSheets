package LabSheet7.Exercise3;

public class Student {
    private int id;
    private String name;
    private String department;

    public Student(String name, int id, String department) {
        setName(name);
        setID(id);
        setDepartment(department);
    }

    public void setID(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setDepartment(String department) {
        this.department=department;
    }

    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Student name: " + getName() + "   ID: " + getID() + "   Department: " + getDepartment() + "\n";
    }
}
