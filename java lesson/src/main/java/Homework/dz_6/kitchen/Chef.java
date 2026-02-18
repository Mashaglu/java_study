package Homework.dz_6.kitchen;


public class Chef {

    public static void chefcook(Object task) {
        if (task instanceof Carp carp) {
            carp.carpcook();
        }
        if (task instanceof Chicken chicken) {
            chicken.chickencook();
        }
        if (task instanceof Duck duck) {
            duck.duckcook();
        }
        if (task instanceof Salmon salmon) {
            salmon.salmoncook();
        }
        if (task instanceof Sturgeon sturgeon) {
            sturgeon.sturgeoncook();
        }
        if (task instanceof Turkey turkey) {
            turkey.turkeycook();
        }

    }
}
