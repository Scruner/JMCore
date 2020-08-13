package electroStore.bank;

import electroStore.interfaces.BankInteraface;

public abstract class BaseBank implements BankInteraface {
    private String nameCredit;
    private String conditionsCredit;

    //количество заявок по всем банкам (можно также реализовать через коллекцию)
    public static int requestCount;

    public BaseBank(String nameCredit, String conditionsCredit) {
        this.nameCredit = nameCredit;
        //this.conditionsCredit = conditionsCredit;
    }

    @Override
    public void checkCreditHistory() {
        requestCount++;
    }

    @Override
    public void issuanceOfCredit() {

    }

    @Override
    public String getNameCredit() {
        return nameCredit;
    }

    @Override
    public String getConditionsCredit() {
        return conditionsCredit;
    }
}
