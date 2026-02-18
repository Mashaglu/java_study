package Homework.dz_6;

public enum CurrencyRate {
    USD("Долллар", 1, 76.15),
    EUR("Евро", 2, 90.27),
    CNY("Юань", 3, 11.01),
    AED("Дирхам", 4, 20.74);

    private final String rusName;
    private final int code;
    private final double rate;

    CurrencyRate(String rusName, int code, double rate) {
        this.rusName = rusName;
        this.code = code;
        this.rate = rate;
    }

    public String getRusName() {
        return rusName;
    }

    public int getCode() {
        return code;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return
                "Валюта : " + rusName +
                        ", курс валюты к рублю = " + rate;
    }
}
