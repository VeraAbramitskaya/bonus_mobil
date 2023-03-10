public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        // сумма на счету
        int payment = 2010;
        // сумма пополнения счета
        int bonus;
        boolean conditions = payment >= 1000;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int account = nitialAccount + payment + bonus;
        //сумма на счету после пополнения + бонусы

        System.out.println("Сумма на счету: " + account);
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}