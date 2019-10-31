/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.principal;

import com.epn.entities.Producto;
import com.mycompany.seccion.ProductoJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aplicaciones D
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("laboratorio2");
        ProductoJpaController pjc=new ProductoJpaController(emf);
        Producto p = new Producto();
        p.setNombre("Nuevo producto");
        p.setPrecio(10);
        pjc.create(p);
    }
    
}
