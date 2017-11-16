
import java.util.ArrayList;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;
/*db.class
* Raúl Monzón 17014
* Paul Belches 17088
*/
public class db {
	private MongoClient mongo;
    private Morphia morphia;
    private Datastore ds;
    private Datastore ds2;
    
    /**
     * Constructor sin parámetros
     */
    public db () {
    	mongo = new MongoClient();
    	morphia = new Morphia();
    	morphia.mapPackage("(default package)");
    	ds = morphia.createDatastore(mongo, "Deportes");
    	ds2 = morphia.createDatastore(mongo, "Usuarios");
    }
    /**Cargar
     * Se envia un arreglo con los valores guardados para cada uno de los tanques.
     * @return El arreglo de tanques 
     */
    public ArrayList<Deporte> cargarD(){
    	ArrayList<Deporte> r = new ArrayList<Deporte>();
    	Query<Deporte> query = ds.createQuery(Deporte.class);
    	List<Deporte> t1 = query.asList();
        for (Deporte t: t1){
            r.add(t);
        }
        return r; 
    }
     /* Se envia un arreglo con los valores guardados para cada uno de los tanques.
     * @return El arreglo de tanques 
     */
    
    public ArrayList<Usuario> cargarU(){
    	ArrayList<Usuario> r = new ArrayList<Usuario>();
    	Query<Usuario> query = ds2.createQuery(Usuario.class);
    	List<Usuario> t1 = query.asList();
        for (Usuario t: t1){
            r.add(t);
        }
        return r;  
    }
    /*Guardar
     * Se guardan los datos de los tanques que se tienen
     * @param t: la lista de tanques
     */
 
    public void guardarD(ArrayList<Deporte> t) {
    	Query<Deporte> query = ds.createQuery(Deporte.class);
    	List<Deporte> t1 = query.asList();
        for (Deporte t2: t1){
            ds.delete(t2);
        }
    	for (Deporte a:t) {
    		ds.save(a);
    	}
    }
    
    /*Guardar
     * Se guardan los datos de los tanques que se tienen
     * @param t: la lista de tanques
     */
    public void guardarU(ArrayList<Usuario> t) {
    	Query<Usuario> query = ds2.createQuery(Usuario.class);
    	List<Usuario> t1 = query.asList();
        for (Usuario t2: t1){
            ds2.delete(t2);
        }
    	for (Usuario a:t) {
    		ds2.save(a);
    	}
    }
}
