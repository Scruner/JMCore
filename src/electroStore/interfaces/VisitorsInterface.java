package electroStore.interfaces;

public interface VisitorsInterface {

    void buyProduct(GoodsInterface goods);

    void returnProduct(GoodsInterface goods);

    String getName();
}
