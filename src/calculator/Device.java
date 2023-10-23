package calculator;

public class Device {

    int count = 3;

    public void callInnerClass() {
        class Tablet {
            int anProducere;
            int getAnProducere() {
                return anProducere + count;
            }
        }

        Tablet tablet = new Tablet();
        System.out.println(tablet.getAnProducere());
    }


}
