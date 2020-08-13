package electroStore.employeesStore;

import electroStore.enums.ConsultResult;
import electroStore.interfaces.DepartmentInterface;
import electroStore.interfaces.VisitorsInterface;

public class Consultant extends BaseEmployee {

    public Consultant() {

    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorsInterface visitor) {
        super.setFree(false);

        //здесь должна быть логика, купить или пойдёт домой

        return ConsultResult.BUY;
    }

    @Override
    public void setDepartment(DepartmentInterface department) {
        super.setDepartment(department);
    }

    public void transferOfVisitorAnotherConsultant() {



    }
}

