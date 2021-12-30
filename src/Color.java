public enum Color {
    // Colecciones de valores constantes
    ROJO ("Rojo"),
    AMARILLO ("Amarillo"),
    AZUL ("Azul"),
    BLANCO ("Blanco"),
    GRIS ("Gris"),
    NARANJA ("Naranja");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
