import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class ProdService {
 
	 @PersistenceContext
	  private EntityManager entityManager;
 
    @Transactional
    public void inserisciParquet(String nome, String materiale,String collezione, String descrizione, double prezzo) {
    	Prod_parquet parquet = new Prod_parquet();
    	parquet.setNome(nome);
    	parquet.setMateriale(materiale);
    	parquet.setDescrizione(descrizione);
    	parquet.setPrezzo(prezzo);
 
        entityManager.persist(parquet);
    }
 
}