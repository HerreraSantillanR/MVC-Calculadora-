/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author Herrera Santiilan
 */
public class Controlador {
   
    private Modelo modeloCalculadora; 
    
    private Vista vistaCalculadora;

    public Controlador(Modelo modeloCalculadora, Vista vistaCalculadora) {
        //Instancia del modelo para realizar las operaciones aritmetricas
        this.modeloCalculadora = modeloCalculadora;
        
        //Instancia la vista para obtener los datos y mostrar resultados 
        this.vistaCalculadora = vistaCalculadora;
    }
    
    public  void realizarSuma(){
        //Obtiene los resultados desde la vista 
        int num1 = vistaCalculadora.getNumero1();
        int num2 = vistaCalculadora.getNumero2();
        
        //calcula la suma utilizando el modelo 
        int resultado = modeloCalculadora.sumar(num1, num2);
        
        //Se envia el resultado a la vista 
        vistaCalculadora.setResultado(resultado);
    }
    
       public  void realizarResta(){
        int num1 = vistaCalculadora.getNumero1();
        int num2 = vistaCalculadora.getNumero2();
        
        int resultado = modeloCalculadora.restar(num1, num2);
        
        vistaCalculadora.setResultado(resultado);
    }
}
