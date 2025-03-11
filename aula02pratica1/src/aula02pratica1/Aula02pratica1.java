
package aula02pratica1;




/**
 *
 * @author Gabriel Dreick
 */
public class Aula02pratica1 {// CLASSE INSTANCIADORA
    public static void main(String[] args) {
        System.out.println("meu primeiro codigo em java...\n\n");
        Tecnico tec = new Tecnico(1173, "Gabriel", "Analista de Sistemas");
        // EXIBINDO O TECNICO
        System.out.println(
        "====================\n" +
        "Matricula: "+tec.matricula + "\n" +
        "Nome: " + tec.nome + "\n" +
        "Titulo: " + tec.titulo +
        "\n====================");
        
        /*
        * curiosidade propria sobre java: testando print
        int num;
        num = 10;
        System.out.println("num: "+ ((num+num)/num) + ".");
        */
    }
    
}