package electroStore;

import electroStore.bank.SberBank;
import electroStore.bank.VTB;
import electroStore.client.VipVisitor;
import electroStore.client.Visitor;
import electroStore.department.ElectronicDepartment;
import electroStore.department.GameDepartment;
import electroStore.employeesStore.Administrator;
import electroStore.employeesStore.Consultant;
import electroStore.enums.ConsultResult;
import electroStore.goods.Computer;
import electroStore.goods.GameConsole;
import electroStore.goods.Subwoofer;
import electroStore.goods.TV;
import electroStore.interfaces.GoodsInterface;
import electroStore.interfaces.VisitorsInterface;

public class Main {
    public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking() {

        SoppingRoom soppingRoom = new SoppingRoom(); //создаём тороговый зал

        //создаём администратора всего торгового зала
        Administrator administrator = new Administrator(soppingRoom);

        //создаём два отдела
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        //добаляем отделы в торговый зал
        soppingRoom.addDepartment(electronicDepartment);
        soppingRoom.addDepartment(gameDepartment);

        //добавляем сотрудников в каждый отдел
        Consultant consultant1 = new Consultant("Джон");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Алина");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);

        //создаём товары для отделов
        Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
        TV tv = new TV(1000, false, "SmartTV", "Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        //добавляем товары в отделы
        electronicDepartment.addGoods(tv);
        electronicDepartment.addGoods(computer);
        gameDepartment.addGoods(xbox);

        //создаём покупателей
        Visitor visitor1 = new Visitor("Джон");
        VipVisitor vipVisitor1 = new VipVisitor("Ник", 50);

        //ищем свободного консультанта из нужного отдела
        ConsultResult consultResult = administrator.provekingConsultant(electronicDepartment)
                                                   .consult(visitor1);

        switch (consultResult) {
            case BUY:
                visitor1.buyProduct(tv);
                break;
            case EXIT:
                break;
        }
    }

//        TV tv = new TV("Samsung");
//
//        GoodsInterface subwoofer = new Subwoofer("MicroLab");
//
//        GoodsInterface goods = new Subwoofer("Romantica");
//        ((TV)goods).showChannel();//сокращённое приведение типа, с вызовом метода телевизора showChannel()
//        TV t = (TV) goods; //подробное приведение типа
//
//
//        GoodsInterface computer = new Computer("MacBook");
//        Computer computer2 = new Computer("Asus");
//
//        VisitorsInterface visitor = new Visitor();
//
//        visitor.buyProduct(tv);
//        visitor.buyProduct(computer);
//        visitor.buyProduct(computer2);
//        visitor.buyProduct(computer2);
//        visitor.buyProduct(computer);
//        visitor.buyProduct(subwoofer);

//        SberBank sberBank = new SberBank("Sberbank", "test desc");
//        sberBank.checkCreditHistory(true);
//        sberBank.checkCreditHistory();
//        sberBank.checkCreditHistory();
//
//        VTB vtb = new VTB("Sberbank", "test desc");
//        vtb.checkCreditHistory();
//        vtb.checkCreditHistory();
//
//        System.out.println("sberBank.requestCount = " + sberBank.requestCount);
    // System.out.println("vtb.requestCount = " + vtb.requestCount);

//    }
}
