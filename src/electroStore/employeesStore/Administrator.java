package electroStore.employeesStore;

import electroStore.SoppingRoom;
import electroStore.interfaces.DepartmentInterface;
import electroStore.interfaces.EmployeeInterface;

public class Administrator {

    private SoppingRoom soppingRoom;

    public Administrator(SoppingRoom soppingRoom) {
        this.soppingRoom = soppingRoom;
    }

    public Consultant provekingConsultant(DepartmentInterface departmentInterface) {
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()) {
            if (employee instanceof Consultant) {
                if (employee.isFree()) {
                    return (Consultant) employee;
                }
            }
        }
        return null;
    }
}
