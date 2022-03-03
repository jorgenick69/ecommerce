package ecommerce.com.ecommerce.enums;

public enum Rol {
    USER("Usuario"),ADMIN("Administrador");


    private String valor;

    private Rol(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
