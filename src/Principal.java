import java.util.List;
import java.util.ArrayList;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;

public class Principal {
	public static void main(String args[]) {
		db db = new db(); 
		
    	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    	usuarios = db.cargarU();
    	ArrayList<Deporte> deportes = db.cargarD();
    	deportes = db.cargarD();
    	Deporte d = new Deporte("Futbol");
    	d.agregarTorneo(new Torneo("Masculino"));
    	d.getTorneo().get(0).agregarE(new Equipo("Ratas"));
    	deportes.add(d);
    	/*
    	System.out.println("Todos los usuarios:");
    	for (int i = 0; i < usuarios.size(); i++) {
    		System.out.println(usuarios.get(i).toString());
    	}*/
    	
		
    	db.guardarD(deportes);
    	
    	System.out.println("Todos los deportes:");
    	for (int i = 0; i < deportes.size(); i++) {
    		System.out.println(deportes.get(i).getTorneo().get(0).getNombre());
    	}
    	
    	
    	
    	//db.guardarU(usuarios);
		
    }
    
}

