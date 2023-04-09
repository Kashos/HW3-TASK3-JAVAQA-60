public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000; // Сумма кредита
        double interestRate = 9.99; // Годовая процентная ставка
        int creditTermOneYear = 12; //Срок кредита для 1 года в месяцах
        int creditTermTwoYear = 24; //Срок кредита для 2 лет в месяцах
        int creditTermTreeYear = 36; //Срок кредита для 3 лет в месяцах

        double creditOneYear = (int) service.calculate(amountOfCredit, interestRate, creditTermOneYear);
        System.out.println("Ежемесячный платеж для кредита на 1 год:");
        System.out.println(creditOneYear + " рублей.");

        double creditTwoYear = (int) service.calculate(amountOfCredit, interestRate, creditTermTwoYear);
        System.out.println("Ежемесячный платеж для кредита на 2 года:");
        System.out.println(creditTwoYear + " рублей.");

        double creditTreeYear = (int) service.calculate(amountOfCredit, interestRate, creditTermTreeYear);
        System.out.println("Ежемесячный платеж для кредита на 3 года:");
        System.out.println(creditTreeYear + " рублей.");
    }
}