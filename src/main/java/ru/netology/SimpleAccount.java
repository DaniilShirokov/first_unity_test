package ru.netology;

public class SimpleAccount extends Account {
    final static int MINIMUM_VALUE = 0;

    public SimpleAccount(long currentAmount) {
        super(currentAmount);
    }

    @Override
    public boolean add(long amount) {
        if (amount > MINIMUM_VALUE) {
            initialAmount += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (Math.abs(amount) < initialAmount) {
            initialAmount -= amount;
            return true;
        } else {
            return false;
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