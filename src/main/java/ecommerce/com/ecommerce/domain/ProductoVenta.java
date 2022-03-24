package ecommerce.com.ecommerce.domain;

import lombok.Data;

    @Data
    public class ProductoVenta {
        private String id;
        private String marca;
        private String modelo;
        private Double precioFinal;
        private Integer cantidad;
    }


