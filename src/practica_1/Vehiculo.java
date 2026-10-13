/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_1;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    //Atributos
    String marca, modelo, estado;
    int anio_fab;
    boolean matriculado;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String estado, int anio_fab, boolean matriculado) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.anio_fab = anio_fab;
        this.matriculado = false;
        
    }
      //Metodos
    public void revisionVehicular(){
        if(anio_fab < 1996){
            estado = "usado malo";
        }else if(anio_fab < 2016  ){
            estado=" usado bueno";
        }else if(anio_fab < 2026 ||( anio_fab < 2026 && estado.equalsIgnoreCase(estado))){
            estado= "seminuevo";
        }else{
            estado = "nuevo";
        }
    }
    public void  matricular(){
        if(estado.equalsIgnoreCase("usado malo ")){
            matriculado = true;
            System.out.println("Vehiculo matriculado"); 
    }else{
            System.out.println("No se puede matricular");
    }
    }
    public void mostrarDatos(){
        System.out.println("====DATOS DE MATRICULACION===");
        System.out.println("Marca "+ marca);
        System.out.println("Modelo"+ modelo);
        System.out.println("Estado"+ estado);
        System.out.println("Anio"+anio_fab);
        System.out.println("Matriculado"+(matriculado ? "si": "No" ));
    }
    
}
