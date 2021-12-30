import javax.swing.plaf.synth.SynthMenuBarUI;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Random");

        auto.setTipo(TipoAutomovil.HATCHBACK);
        auto.setColor(Color.AZUL);
        auto.setCilindraje(2.0);


        auto.detalle();


        Automovil mazda = new Automovil();
        mazda.setModelo("Mazda");

        System.out.println();
        System.out.println("*** ESTE ES UN NUEVO AUTO *** ");


        System.out.println(auto.acelerar(120));
        System.out.println(auto.frenar());
        System.out.println(mazda.acelerar(200));
        System.out.println(mazda.frenar());

        System.out.println();
        System.out.println("Fabricante " + auto.getFabricante());

        System.out.println("ESTO ES OTRA PRUEBA");
        System.out.println(auto.aclerarFrenar(2000));

        System.out.println("*OTRO EJEMPLO");
        System.out.println("kilómetros por litro: " + auto.consumo(300,0.6f));
        System.out.println("kilómetros por litro: " + auto.consumo(300,60));

        Automovil nissan = new Automovil("Nissa", "2020", Color.AZUL);


        System.out.println(nissan);
        System.out.println(nissan.toString());


    }
}
