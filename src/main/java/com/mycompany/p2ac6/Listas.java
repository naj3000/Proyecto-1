/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2ac6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Listas {
    public static void main(String[] args) {
       
//        List miLista = new ArrayList(); //al no especificar tipo, lo pone object
//        miLista.add(3);
//        miLista.add("Robyn");
//        miLista.add(55.58);
//        imprimir(miLista);
 
   
        List<ClsVendedores> misEmp= new ArrayList();
        
        ClsVendedores ven= new ClsVendedores();
        System.out.println("ARRAYLIST 8 VENDEDORES");
        ven.setNombre("------------1.LUCY MARGARITA PALENCIA ROJAS");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
        ven.setNombre("------------2.JOSE DAVID ARGUETA CHAVARRIA");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("------------3.JASON OMAR HERNANDEZ DE LEON");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("------------4.JOSE PABLO PEREZ");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("------------5.DANIEL RALON BOLAÑOS");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("------------6.GERMAN DE JESUS RAMOS ESPINOZA");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(103);
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("------------7.EDISON RUBEN GARCIA PEREZ");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
         ven.setNombre("------------8.HENRY DONALDO NAJERA SALAZAR");
        ven.setEnero(ale());
        ven.setFebrero(ale());
        ven.setMarzo(ale());
        misEmp.add(ven);
        ven= new ClsVendedores();
        
        double sumaEnero=0;
        double sumaFebrero=0;
        double sumaMarzo=0;
        double sumatotal=0;
        for(ClsVendedores v: misEmp){
            System.out.println("NOMBRE VENDEDOR="+v.getNombre());
            sumaEnero=sumaEnero+v.getEnero();
            sumaFebrero=sumaFebrero+v.getFebrero();
            sumaMarzo=sumaMarzo+v.getMarzo();
            sumatotal=sumaEnero+sumaFebrero + sumaMarzo;
            
        }
        System.out.println("LA SUMA DEL MES DE ENERO ES DE : "+ sumaEnero);
        
         System.out.println("LA SUMA DEL MES DE FEBRERO ES DE  : "+ sumaFebrero);
        
          System.out.println("LA SUMA DEL MES DE MARZO ES DE  : "+ sumaMarzo);
          
          System.out.println("LA SUMA TOTAL DE TODOS LOS MESES ES DE  : "+ sumatotal);
    }
    
    public static void imprimir(Collection coleccion){
        for (Object elemento : coleccion){
            System.out.println("elemento = "+ elemento);
        }
        
    }
   
 public static int ale(){
     int numero = 0; 
          numero = (int) (Math.random()*(1000-100)) + 100;
          
        return numero;
    }
}