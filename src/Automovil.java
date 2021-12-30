public class Automovil {

    // FINAL --- significa que no puede ser modificaco. (Es una constante) ; Ejm. public static final.
    // PRIVATE --- Solo puede sermodificado por metodos de la clase.
    // PUBLIC
    // STATIC --- Artibuto o metodo que no le pertener a la instancia, es compartido por cualquier objeto de la clase.
    // STATIC Y FINAL son modificadores de estructura
    // ENUM --- Enumeradores, estructura que tiene varios valores.


    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindraje;
    private int capacidadTanque = 40;

    // EJEMPLO CON MÁS ENUM

    private TipoAutomovil tipo;

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    // FINAL

    // Atributo o metodo estatico, no le pertenece a la instacancia, es compartido por cualquier objeto de esa clase

    static String colorPatente = Color.NARANJA.getColor();

    // CONSTRUCTORES
    public Automovil(){

    }
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo ;
    }
    public  Automovil(String fabricante, String modelo, Color color){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }
    // FINAL CONSTRUCTORES

    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String  fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public double getCilindraje(){
        return  this.cilindraje;
    }

    public void setCilindraje(double cilindraje){
        this.cilindraje = cilindraje;
    }

    public int getCapacidadTanque(){
        return  this.capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }



    public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color.getColor());
        System.out.println("colorPatente = " + colorPatente);
        System.out.println("auto.cilindraje = " + this.cilindraje);
        System.out.printf("auto.tipo = " + this.getTipo().getDescripción());
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + "acelerando a " + rpm + " rpm ";
    }

    public String frenar(){
        return "el auto " + this.fabricante + " " + this.modelo + " está frenando";
    }

    public String aclerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + " " + frenar;
    }

    public float consumo(int km, float porcentajeBencina){
        return km/(capacidadTanque*porcentajeBencina);
    }

    public float consumo(int km, int porcentajeBencina){
        return km/(capacidadTanque*(porcentajeBencina/100f));
    }

    // Representar el objeto en una cadena de texto.
    // Override usado para documentar. (Buenas prácticas de Java)

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindraje=" + cilindraje +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }


}
