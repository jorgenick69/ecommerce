
package ecommerce.com.ecommerce.enums;

public enum Envio {
    LOCAL("Retira en el local"), 
    CORREO("Retira en sucursal del correo"), 
    DOMICILIO("Envío a domicilio");
    
    private String valor;


    private Envio(String tipoDeEnvio) {
        this.valor = valor;
    }

    public String getTipoDeEnvio() {
        return valor;
    }

}
