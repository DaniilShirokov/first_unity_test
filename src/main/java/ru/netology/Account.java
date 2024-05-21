package ru.netology;

public abstract class Account {
    protected long initialAmount;

    public Account(long amount) {
        this.initialAmount = amount;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public abstract boolean transfer(Account account, long amount);

    public long getBalance() {
        pay(100100);
        return initialAmount;
    }
}