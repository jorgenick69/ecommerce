package ecommerce.com.ecommerce.enums;

public enum Genero {
    MASCULINO ("Masculino"), FEMENINO("Femenino"), UNISEX("Unisex"), KIDS("Kids");
    
    private String valor;

    private Genero(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    
}
