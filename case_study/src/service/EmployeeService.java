package service;

public interface EmployeeService extends Service {
    @Override
    void addNew();

    @Override
    void display();

    @Override
    void edit();
}
