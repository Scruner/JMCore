package electroStore;

import electroStore.client.BaseVisitor;
import electroStore.department.BaseDepartment;
import electroStore.employeesStore.Administrator;
import electroStore.interfaces.DepartmentInterface;
import electroStore.interfaces.VisitorsInterface;

import java.util.ArrayList;

public class SoppingRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<>();//в каждом отделе имеются свои сотрудники

    private ArrayList<VisitorsInterface> visitorList = new ArrayList<>();

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department) {
        departmentList.add(department);
    }

    public void addVisitor(VisitorsInterface visitor) {
        visitorList.add(visitor);
    }
}
