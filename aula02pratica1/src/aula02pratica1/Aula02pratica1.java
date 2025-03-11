
package aula02pratica1;
import javax.swing.JOptionPane;



/**
 *
 * @author Gabriel Dreick
 */
public class Aula02pratica1 {// CLASSE INSTANCIADORA
    /*
    public static void mostraTecnico(int matricula, String nome, String titulo){
        JOptionPane.showMessageDialog(
                null, "Matricula: "+matricula+"\n"+
                "Nome: "+nome+"\n"+
                "Titulo: "+titulo, "Dados do Tecnico", JOptionPane.PLAIN_MESSAGE
        );
    }*/
    
    
    public static void main(String[] args) {
        System.out.println("meu Segundo codigo em java...\n\n");
        Tecnico tec = new Tecnico(1173, "Gabriel Dreick", "Analista de Sistemas");
        // EXIBINDO O TECNICO EM UMA CAIXA DE DIALOGO
        // mostraTecnico(tec.matricula, tec.nome, tec.titulo);
        
        JOptionPane.showMessageDialog(
                null, "Matricula: "+tec.matricula+"\n"+
                "Nome: "+tec.nome+"\n"+
                "Titulo: "+tec.titulo, "Dados do Tecnico", JOptionPane.PLAIN_MESSAGE
        );


        /*
        // EXIBINDO O TECNICO
        System.out.println(
        "====================\n" +
        "Matricula: "+tec.matricula + "\n" +
        "Nome: " + tec.nome + "\n" +
        "Titulo: " + tec.titulo +
        "\n====================");
        */      
        
        
        
        
        
        /*
        * curiosidade propria sobre java: testando print
        int num;
        num = 10;
        System.out.println("num: "+ ((num+num)/num) + ".");
        */
        
    }
    
}