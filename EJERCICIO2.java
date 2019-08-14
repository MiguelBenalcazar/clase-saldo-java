
package ejercicio2;

public class EJERCICIO2 {

    
    public static void main(String[] args) {
        Pregunta nuevo= new Pregunta();
        Pregunta nuevo1= new Pregunta(1,"texto1","ayuda1","retroalimentacion1",1.1);
        Pregunta nuevo2= new Pregunta(2,"texto2","ayuda2","retroalimentacion2",1.2);
        Pregunta nuevo3= new Pregunta(3,"texto3","ayuda3","retroalimentacion3",1.3);
        
    System.out.print("Objeto nuevo"+nuevo.getNumero()+" "+nuevo.getTexto()+" "+nuevo.getAyuda()+" "+nuevo.getRetro()+" "+nuevo.getValor()+"\n");
    System.out.print("Objeto nuevo1"+nuevo1.getNumero()+" "+nuevo1.getTexto()+" "+nuevo1.getAyuda()+" "+nuevo1.getRetro()+" "+nuevo1.getValor()+"\n");
    System.out.print("Objeto nuevo2"+nuevo2.getNumero()+" "+nuevo2.getTexto()+" "+nuevo2.getAyuda()+" "+nuevo2.getRetro()+" "+nuevo2.getValor()+"\n");
    System.out.print("Objeto nuevo3"+nuevo3.getNumero()+" "+nuevo3.getTexto()+" "+nuevo3.getAyuda()+" "+nuevo3.getRetro()+" "+nuevo3.getValor()+"\n");
    
    nuevo.setNumero(2);
    nuevo.setTexto("hola");
    nuevo.setAyuda("como");
    nuevo.setRetro("estas");
    nuevo.setValor(1);
    
    System.out.print("Objeto nuevo"+nuevo.getNumero()+" "+nuevo.getTexto()+" "+nuevo.getAyuda()+" "+nuevo.getRetro()+" "+nuevo.getValor()+"\n");
    }
    
}
