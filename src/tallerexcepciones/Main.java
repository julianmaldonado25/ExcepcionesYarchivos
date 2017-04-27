/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerexcepciones;

import Excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Archivo.*;
import java.io.*;
/**
 *
 * @author Estudiante
 */
public class Main {

    
    
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Consultor c = new Consultor("Ingjbasjja", 1);
        Administrador a= null;
        try{
        a = new Administrador("Julioprofe.net",2);
        }catch(ExcepcionNombre ex){
            ex.printStackTrace();
        }catch(ExcepcionSalario ex){
            ex.printStackTrace();
        }
    
        
        try{
         Programador p =  new Programador("Java","Ste men si la caga",1210000,45);
         LiderDeProyecto l = new LiderDeProyecto("Java", "nosfuimosapfu",3000000,75);
         l.agregarProgramador(p);
        }catch( ExcepcionNombre | ExcepcionSalario | ExceptionLenguaje ex){
            ex.printStackTrace();
        }
        ArchivoDB arc = new ArchivoDB();
        try{
            arc.guardarInformacion(emp);
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        //File archivo = new File("empresa.txt");
        //archivo.exists();
        
        
    }
    
}
