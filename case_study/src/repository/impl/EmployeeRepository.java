package repository.impl;

import models.person.Employee;
import repository.IEmployeeRepository;
import until.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void display() {
        employeeList = ReadAndWriteEmployee.readEmployee();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList = ReadAndWriteEmployee.readEmployee();
        employeeList.add(employee);
        ReadAndWriteEmployee.writerFile(employeeList);
    }

    @Override
    public void delete(String id) {
        employeeList = ReadAndWriteEmployee.readEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            employeeList.remove(employeeList.get(i));
        }
        ReadAndWriteEmployee.writerFile(employeeList);
    }

    @Override
    public Employee findEmployeeById(String id) {
        for (Employee e : employeeList) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        employeeList = ReadAndWriteEmployee.readEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())) {
                employeeList.set(i, employee);
                break;
            }
        }
        ReadAndWriteEmployee.writerFile(employeeList);
    }
}
