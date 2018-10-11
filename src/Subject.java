/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yrodr
 */
public class Subject extends Human{    
    public void respirar (){
    }
    public int edad;
    
    public static void main (String []args){

        Subject suj1= new Subject();
        suj1.Nombre = "Mariana";
        suj1.Apellido = "Solis";
        suj1.DNI = 32968757;
        
        suj1.vivir();
        suj1.trabajar();
        
        System.out.println(suj1.Nombre);
        System.out.println(suj1.Apellido);
        System.out.println(suj1.DNI);
        
        Subject suj2 = new Subject();
        suj2.Nombre = "Antonio";
        suj2.Profesion = "Maestro";
        suj2.EstadoCivil = "Viudo";
        
        suj2.respirar();
        suj2.vivir();
        System.out.println(suj2.Nombre);
        System.out.println(suj2.Profesion);
        System.out.println(suj2.EstadoCivil);
        
        
}




}
