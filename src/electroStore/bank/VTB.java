package electroStore.bank;

public class VTB extends BaseBank {


    public VTB(String nameCredit, String conditionsCredit) {
        super(nameCredit, conditionsCredit);
    }

    @Override
    public void checkCreditHistory() {
        super.checkCreditHistory();
    }

    @Override
    public void issuanceOfCredit() {
        //доработанная реализация
    }

//    @Override
//    public String getNameCredit() {
//        return super.getNameCredit();
//    }
//
//    @Override
//    public String getConditionsCredit() {
//        return super.getConditionsCredit();
//    }
}
