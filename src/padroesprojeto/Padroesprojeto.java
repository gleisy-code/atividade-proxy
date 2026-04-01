
package padroesprojeto;

/**
 *
 * @author gleisy
 */
public class Padroesprojeto {

    public static void main(String[] args) {
        Conteudo c = new FilmePremiumProxy();
        
        System.out.println("primeiro usuario-----------------------------------");
        Usuario usuario1= new Usuario("premium","carlos");
        c.assistir(usuario1);
        
        System.out.println("segundo usu----------------------------------------");
        Usuario usuario2 = new Usuario("basico","ana");
        c.assistir(usuario2);
        
        System.out.println("terceiro usu----------------------------------------");
        Usuario usuario3= new Usuario("premium","marina");
        c.assistir(usuario3);
        
        System.out.println("quarto usu------------------------------------------");
        Usuario usuario4=new Usuario("basico","pedro");
        c.assistir(usuario4);
        
        System.out.println("teste null----------------------------------------------");
        try{ 
            Usuario usuario5=null;
            c.assistir(usuario5);
        }catch(IllegalArgumentException e){
            System.out.println("ERRO: "+e.getMessage());
        }
           
            
    }
    
}
