package practice3;

public class Company {
    static String companyName = "Apple";
    final int employeeID;
    String employeeName;

    //final int employeeID = 10; - ошибка!

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    int getEmployeeID() {
        return employeeID;
    }
    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;

    }

    void printInfo() {
        System.out.println("Название компании: " + companyName + ", имя сотрудника: " + employeeName);
    }

}
