/**
 *
 * @author Gabriel Dreick
 */
package aula02pratica1;


public class Tecnico extends Empregado {
    
    String titulo;
    
    // METODO CONSTRUTOR
    public Tecnico(int matricula, String nome, String titulo){
        super(matricula, nome);
        this.titulo = titulo;
    }

}
