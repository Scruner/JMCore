package electroStore.bank;

public class SberBank extends BaseBank {

    public SberBank(String nameCredit, String conditionsCredit) {
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

    //сбербанк умеет также рассматривать срочные заявки с помощью перегруженного метода
    public void checkCreditHistory(boolean critical) {
        System.out.println("sberbank");
    }
}
