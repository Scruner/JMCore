package electroStore.goods;

public class Computer extends ElectronicDevace {
    private int ram;

    public Computer(String name) {
        super(name);
    }

    public Computer(String name, int ram) {
        super(name);
        this.ram = ram;
    }

    public Computer(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }

    public void loadOS() {

    }
}
