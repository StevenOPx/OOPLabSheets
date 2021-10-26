package LabSheet7.Exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student s1 = new Student("Jake", 154345, "Computing");
        Student s2 = new Student("Mary", 234532, "Creative Media");
        Student s3 = new Student("Tommy", 453726, "Computing");
        Student s4 = new Student("Peter", 623456, "Creative Media");

        Student compStudents[] = new Student[10];
        compStudents[0] = s1;
        compStudents[1] = s3;

        Student crvMediaStudents[] = new Student[10];
        crvMediaStudents[0] = s2;
        crvMediaStudents[1] = s4;

        Department crvMedia = new Department("Creative Media", crvMediaStudents);
        Department comp = new Department("Computing", compStudents);

        Department department[] = new Department[5];
        department[0] = crvMedia;
        department[1] = comp;

        Institute institute = new Institute("Institute of Technology, Tralee", department);

        System.out.println(institute);

        System.out.print("Total students in the institute: ");
        System.out.print(institute.getTotalStudents());

        System.out.println("\n\nJake will move from the Computing Dept, into the Creative Media Dept.");

        int crvMediaSubscript=-1, compSubscript=-1;

        /*crvMediaStudents[2] = s1;
        s1.setDepartment("Creative Media");
        compStudents[0] = null;*/

        for(int i=0; i<department.length; i++) {
            if(department[i] != null && department[i].getName().equals("Creative Media"))
                crvMediaSubscript = i;

            if(department[i] != null && department[i].getName().equals("Computing"))
                compSubscript = i;
        }

        if(crvMediaSubscript != -1 && compSubscript != -1) {
            Student[] allDeptStudents = department[compSubscript].getStudents();
            int j;

            for (j = 0; j < allDeptStudents.length; j++) {
                if (allDeptStudents[j] != null) {
                    if (allDeptStudents[j].getID() == 154345) {
                        System.out.println("\nFound Jake!\n");

                        allDeptStudents[j].setDepartment("Creative Media");

                        department[crvMediaSubscript].getStudents()[2] = allDeptStudents[j];
                        allDeptStudents[j] = null;

                        break;
                    }
                }
            }

            if (j == allDeptStudents.length)
                System.out.println("\nCouldn't find Jake\n");

        }
        System.out.println(institute);
    }
}
