package model;

public class EmployeeModel extends PersonModel {
    private String position;
    private int salary;
    private String yearsInTheCompany;

    public EmployeeModel(String fullName, int age, String position, int salary, String yearsInTheCompany) {
        super(fullName, age);
        this.position = position;
        this.salary = salary;
        this.yearsInTheCompany = yearsInTheCompany;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getYearsInTheCompany() {
        return yearsInTheCompany;
    }

    public void setYearsInTheCompany(String yearsInTheCompany) {
        this.yearsInTheCompany = yearsInTheCompany;
    }

    @Override
    public void showInformation() {
        String information = String.format("Name: %s Age: %s Salary: %s Years In The Company: %s",
                getName(),
                getAge(),
                getSalary(),
                getYearsInTheCompany()
        );
        System.out.println(information);

    }
}
