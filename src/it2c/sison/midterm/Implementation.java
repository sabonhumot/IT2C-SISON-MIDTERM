package it2c.sison.midterm;

import java.util.Scanner;

public class Implementation {

    Scanner input = new Scanner(System.in);
    config conf = new config();

    public void addInstructor() {

        System.out.print("Enter Name: ");
        String name = input.next();

        System.out.print("Enter eMail: ");
        String email = input.next();

        System.out.print("Enter Department: ");
        String dept = input.next();

        System.out.print("Enter Phone Number: ");
        String pnum = input.next();

        System.out.print("Enter Hire Date: ");
        String hdate = input.next();

        String sql = "INSERT INTO tbl_instructors (name, email, dept, pnum, hdate) VALUES (?, ?, ?, ?, ?)";

        conf.addInstructor(sql, name, email, dept, pnum, hdate);
    }

    public void viewInstructors() {
        String tqry = "SELECT * FROM tbl_instructors";
        String[] hrds = {"ID", "Name", "Email", "Department", "Phone Number", "Hire Date"};
        String[] clmns = {"instructor_id", "name", "email", "dept", "pnum", "hdate"};

        conf.viewInstructors(tqry, hrds, clmns);
    }

    public void updateInstructor() {
        System.out.print("Enter Instructor ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter New Email: ");
        String email = input.nextLine();

        System.out.print("Enter New Department: ");
        String dept = input.nextLine();

        System.out.print("Enter New Phone Number: ");
        String pnum = input.nextLine();

        String qry = "UPDATE tbl_instructors SET email = ?, dept = ?, pnum = ? WHERE instructor_id = ?";

        conf.updateInstructor(qry, email, dept, pnum, id);
    }

    public void deleteInstructor() {

        System.out.print("Enter Instructor ID to Delete: ");
        int id = input.nextInt();

        String sqlDelete = "DELETE FROM tbl_instructors WHERE instructor_id = ?";

        conf.deleteInstructor(sqlDelete, id);
    }

}
