package task2;

public class CurExchange {

    public enum Currency {
        Dirhams,
        Dollars,
        Euros,
        Liras,
        Yens
    }

    private final static double RBLS_TO_DRHS = 22.78;
    private final static double RBLS_TO_DLRS = 83.65;
    private final static double RBLS_TO_EURS = 98.66;
    private final static double RBLS_TO_LIRS = 2.02;
    private final static double RBLS_TO_YENS = 0.57;

    public static double exchange(double roubles, Currency currency) {
        switch (currency) {
            case Dirhams -> {
                return roubles / RBLS_TO_DRHS;
            }
            case Dollars -> {
                return roubles / RBLS_TO_DLRS;
            }
            case Euros -> {
                return roubles / RBLS_TO_EURS;
            }
            case Liras -> {
                return roubles / RBLS_TO_LIRS;
            }
            case Yens -> {
                return roubles / RBLS_TO_YENS;
            }
            default -> {
                return -1.0;
            }
        }
    }

}
