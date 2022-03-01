package ecommerce.com.ecommerce.enums;

public enum TransaccionEstado {

    PREPARACION("En preparación."),EMBALAJE("Embalado"),ENVIADO("Pedido en camino."),RECIBIDO("Pedido entregado");

    private String valor;

    private TransaccionEstado(String txEstado){this.valor = valor;}

    public String getTxEstado() {return valor;}
}
