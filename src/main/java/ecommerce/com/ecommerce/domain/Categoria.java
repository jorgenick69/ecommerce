/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.com.ecommerce.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jorge Dominguez
 */
@Entity
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String titulo;
}
