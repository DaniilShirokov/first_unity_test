package ru.netology;

public class Main {
    public static void main(String[] args) {
        Account simpleAccount = new SimpleAccount(0);
        Account creditAccount = new CreditAccount(-500, -20000);
        System.out.println(simpleAccount.add(50000));
        System.out.println(simpleAccount.pay(3000));
        System.out.println(simpleAccount.transfer(creditAccount, 200));//корректный перевод
        System.out.println(simpleAccount.transfer(creditAccount, 5000));// неправильный перевод, сумма есть , но у кредита тогда баланс станет положительный
        System.out.println(creditAccount.getBalance());
        System.out.println(simpleAccount.getBalance());
        System.out.println();
        System.out.println(creditAccount.add(3000));
        System.out.println(creditAccount.pay(15000));
        System.out.println(creditAccount.transfer(simpleAccount, 20000));//некоректный перевод, долг будет больше лимита
        System.out.println(creditAccount.transfer(simpleAccount, 2000));//корректный перевод
        System.out.println(creditAccount.getBalance());
        System.out.println();
        System.out.println(simpleAccount.getBalance());
    }
}