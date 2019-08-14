/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

public class Pregunta {
  private int numero;
  private String texto;
  private String ayuda;
  private String retroalimentacion;
  private double valor;
 
  
  public Pregunta(){
      this.numero=4;
      this.texto="texto";
      this.ayuda="ayuda";
      this.retroalimentacion="retroalimentacion";
      this.valor=2.1;
  }
  public Pregunta(int numero, String texto, String ayuda, String retroalimentacion, double valor){
      this.numero=numero;
      this.texto=texto;
      this.ayuda=ayuda;
      this.retroalimentacion=retroalimentacion;
      this.valor=valor;
  }
 public void setNumero(int numero){
     this.numero=numero;
 }
 public int getNumero(){
     return numero;
 }
 public void setTexto(String texto){
     this.texto=texto;
 }
 public String getTexto(){
     return texto;
 }
 public void setAyuda(String ayuda){
     this.ayuda=ayuda;
 }
 public String getAyuda(){
     return ayuda;
 }
 public void setRetro(String retroalimentacion){
     this.retroalimentacion=retroalimentacion;
 }
 public String getRetro(){
     return retroalimentacion;
 }
 public String setValor(double valor){
     String error;
     if(valor>=0 && valor<=1){
         this.valor=valor; 
         error="Dato valor ingresado";
         
     }else{
        error="El dato debe ser mayor a cero y menor a 1 "; 
     }
    return error;
 }
 public double getValor(){
     return valor;
 }
 
}
