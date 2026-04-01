
package padroesprojeto;

/**
 *
 * @author gleisy
 */
public class FilmePremiumProxy implements Conteudo{
    private final FilmePremiumReal filmeP;

    public FilmePremiumProxy() {
        this.filmeP= new FilmePremiumReal();
    }

    @Override
    public void assistir(Usuario usuario) {
        if(usuario==null){
            throw new IllegalArgumentException("usuario invalido");
        }else{
            if ("premium".equalsIgnoreCase(usuario.getPlano())){//invertido caso null.equalsIgnoreCase(...) e "premium"não é null ❌
            System.out.println("Acesso liberado para "+usuario.getNome());
            filmeP.assistir(usuario);
            }
            else{
                System.out.println("Acesso negado para "+usuario.getNome());
            }
        }
            
    }
    
}
