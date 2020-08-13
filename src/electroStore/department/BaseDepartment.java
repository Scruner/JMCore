package electroStore.department;

import electroStore.interfaces.DepartmentInterface;
import electroStore.interfaces.EmployeeInterface;
import electroStore.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class BaseDepartment implements DepartmentInterface {
    private String name;
    private ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();//список сотрудников
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();//список товаров

    public BaseDepartment() {
    }

    public BaseDepartment(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> productList) {
        this.goodsList = goodsList;
    }

    public void addEmployee(EmployeeInterface employee) {
        employee.setDepartment(this);
        employeeList.add(employee);
    }

    public void addGoods(GoodsInterface goods) {
        goods.setDepartment(this);// при добавлении товара для него автометически прописывается отдел
        goodsList.add(goods);
    }
}
