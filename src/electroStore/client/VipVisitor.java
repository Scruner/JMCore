package electroStore.client;

import electroStore.interfaces.GoodsInterface;

public class VipVisitor extends BaseVisitor {
    //private String name; не нужно дублировать переменную, она уже есть в родительском классе Visitor
    private float discount;

    public VipVisitor(float discount) {
        this.discount = discount;
    }

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }


    @Override
    public void buyProduct(GoodsInterface goods) {
        if (!checDiscont()) {
            super.buyProduct(goods);
        } else {
            //купить со скидкой
        }
    }

    private boolean checDiscont() {
        return discount > 0;
    }
}
