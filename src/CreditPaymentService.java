public class CreditPaymentService {
    public double calculate (int a, double b, int c) {

        double argument = b / (100*12); // Процентная ставка в месяц
        double result = a * ((argument*(Math.pow(1+argument, c)))/((Math.pow(1+argument, c))-1));
        return result;
    }
}
