package lesson6.step4;

public class MicroServiceRunner {
    public static void main(String[] args) {
       Authorization auth = new Authorization();
       Ordering ordering = new Ordering();
       Payment payment = new Payment();
       CancelOrder cancelOrder = new CancelOrder();

       MicroService.process(auth);
       MicroService.process(ordering);
       MicroService.process(payment);
       MicroService.process(cancelOrder);
    }
}
