package electroStore.client;

import electroStore.goods.TV;
import electroStore.interfaces.GoodsInterface;
import electroStore.interfaces.VisitorsInterface;

public abstract class BaseVisitor implements VisitorsInterface {

    private String name;

    public BaseVisitor() {
    }

    public BaseVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buyProduct(GoodsInterface goods) {
        System.out.println("buy "+goods.getName());

//        if(goods instanceof TV) {
//            ((TV)goods).showChannel();
//        }
    }

    @Override
    public void returnProduct(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }
}
