package controller;

import model.EmployeeModel;

public class EmployeeController {
    private EmployeeModel employee;

    public EmployeeController(EmployeeModel employee) {
        this.employee = employee;
    }

    public void updateEmployee(String name, int age, String position, int salary, String yearsInTheCompany) {
        employee.setName(name);
        employee.setPosition(position);
        employee.setSalary(salary);
        employee.setYearsInTheCompany(yearsInTheCompany);
    }


}
