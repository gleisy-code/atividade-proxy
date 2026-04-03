
package proxy;
/**
 *
 * @author gleisy
 */
public class FilmePremiumReal implements Conteudo {

    @Override
    public void assistir(Usuario usuario) {
        System.out.println("Reproduzindo filme para "+usuario.getNome());
    }
    
}
