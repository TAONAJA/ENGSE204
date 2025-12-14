import java.util.Scanner;

class Employee {
    private String EMPLOYEEID;
    private String DEPARTMENT;

    public Employee(String EMPLOYEEID, String DEPARTMENT) {
        this.EMPLOYEEID = EMPLOYEEID;
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getEmployeeId() {
        return EMPLOYEEID;
    }

    public String getDepartment() {
        return DEPARTMENT;
    }

    public void setDepartment(String NEWDEPARTMENT) {
        this.DEPARTMENT = NEWDEPARTMENT;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        String EMPLOYEEID = SC.nextLine();
        String STARTDEPARTMENT = SC.nextLine();
        String NEWDEPARTMENT = SC.nextLine();

        Employee EMP = new Employee(EMPLOYEEID, STARTDEPARTMENT);
        EMP.setDepartment(NEWDEPARTMENT);

        System.out.println(EMP.getEmployeeId());
        System.out.println(EMP.getDepartment());
    }
}
