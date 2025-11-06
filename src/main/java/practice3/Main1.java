package practice3;

public class Main1 {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Михаил");
        Company employee2 = new Company(2, "Мария");

        Company.printCompanyName();
        employee1.printInfo();
        employee2.printInfo();

        Company.companyName = "Samsung";
        Company.printCompanyName();
        employee1.printInfo();
        employee2.printInfo();

    }
}
