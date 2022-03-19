package ecommerce.com.ecommerce.Dto;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class ProductoDto {
    private String id;
    private String marca;
    private String modelo;
    private String codigo;
    private String descripcion;
    private Double costo;
    private Double remarque;
    private Double precio;
    private Double descuento;
    private Double precioFinal;
    private String categoria;
    private List<String> foto;
    private Date alta;
    private Integer stock;
    private Boolean estado;
    private String genero;
    private String color;
    private String colorCristal;
    private String material;
    private String estilo;
    private String tamano;
    private String duracion;
    private String uso;
}
