package electroStore.goods;

public class GameConsole extends ElectronicDevace {

    private int ram;

    public GameConsole(int ram) {
        this.ram = ram;
    }

    public GameConsole(String name, int ram) {
        super(name);
        this.ram = ram;
    }

    public GameConsole(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }

    public void loadGame() {

    }
}
