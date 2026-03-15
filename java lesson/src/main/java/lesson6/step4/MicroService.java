package lesson6.step4;

public class MicroService {

    public static void process(Object task) {
        if (task instanceof Authorization authorization) {
           authorization.authorize();
        }
        if (task instanceof Ordering ordering) {
            ordering.order();
        }
        if (task instanceof Payment payment) {
            payment.pay();
        }
        if (task instanceof CancelOrder cancelOrder) {
            cancelOrder.cancel();
        }
    }
}
