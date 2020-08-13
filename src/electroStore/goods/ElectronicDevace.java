package electroStore.goods;

import electroStore.interfaces.ElectronicDevrceInterface;

public class ElectronicDevace extends BaseGoods implements ElectronicDevrceInterface {

    public ElectronicDevace() {

    }

    public ElectronicDevace(String name) {
        super(name);
    }

    public ElectronicDevace(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

    @Override
    public void turnOn() {
        //общая реализация
    }

    @Override
    public void turnOff() {
        //общая реализация
    }
}
