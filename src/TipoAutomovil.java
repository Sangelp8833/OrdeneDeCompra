public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("hatchback", "Auto compacto", 4),
    PICKUP("pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripción;

    TipoAutomovil(String nombre, String descripción, int numeroPuertas) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripción(){
        return descripción;
    }

    public int getNumeroPuertas(){
        return  numeroPuertas;
    }

}

