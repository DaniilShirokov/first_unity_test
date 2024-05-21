package ru.netology;

public class CreditAccount extends Account {
    final static int MAXIMUM_VALUE = 0;
    private long maxLimit;

    public CreditAccount(long currentAmount, long maxLimit) {
        super(currentAmount);
        this.maxLimit = maxLimit;
    }

    @Override
    public boolean add(long amount) {
        if ((initialAmount + amount) > MAXIMUM_VALUE) {
            return false;
        } else {
            initialAmount += amount;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {
        if ((initialAmount - amount) < maxLimit) {
            return false;
        } else {
            initialAmount -= amount;
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else {
            return false;
        }
    }
}
