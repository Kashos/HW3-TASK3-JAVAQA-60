public class CreditPaymentService {
    public double calculate(int amount, double Rate, int creditTerm) {
        double monthlyRate = Rate / (100 * 12); // Процентная ставка в месяц
        double result = amount * ((monthlyRate * (Math.pow(1 + monthlyRate, creditTerm))) / ((Math.pow(1 + monthlyRate, creditTerm)) - 1));
        return result;
    }
}
