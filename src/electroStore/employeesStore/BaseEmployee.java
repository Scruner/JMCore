package electroStore.employeesStore;

import electroStore.department.BaseDepartment;
import electroStore.interfaces.DepartmentInterface;
import electroStore.interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;//к какому департаменту относится сотрудник
    private boolean free; //идетнификатор свободен сотрудник или нет

    public BaseEmployee() {

    }

    public BaseEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
