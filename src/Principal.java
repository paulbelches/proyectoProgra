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
    	//ArrayList<Deporte> deportes = db.cargarD();
    	
    	System.out.println("Todos los usuarios:");
    	for (int i = 0; i < usuarios.size(); i++) {
    		System.out.println(usuarios.get(i).toString());
    	}
    	
    	
		Usuario u = new Usuario();
    	u.getAlumno().setNombre("Javier Garcia");
    	usuarios.add(u);
		
    	db.guardarU(usuarios);
    	/*
    	System.out.println("Todos los deportes:");
    	for (int i = 0; i < usuarios.size(); i++) {
    		System.out.println(deportes.get(i).toString());
    	}*/
    	
    	
    	
    	//db.guardarU(usuarios);
		
    }
    
}

