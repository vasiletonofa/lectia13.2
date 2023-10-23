package amprenta;

public class GeneratorAmprente {

    public void genereaza(String name) {
        Amprenta amprenta = new Amprenta() {
            @Override
            public void lasaAmprenta() {
                System.out.println("Amprenta " + name);
            }

        };

        amprenta.lasaAmprenta();
    }

}
