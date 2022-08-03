import java.util.LinkedList;

public class AcctLinkedList implements IAcctDataStructure {

    private LinkedList<Account> accounts;

    public Account findByNumber(int forAcctNum) {
        for (Account acct : accounts) {
            if (acct.checkNumber(forAcctNum))
                return acct;
        }
        return null;
    }
}
