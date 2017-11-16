
public class GuiP {

	public static void main(String[] args) {
		GuiLogin login=new GuiLogin();
		login.setVisible(true);
		Administrador admin = new Administrador();
		admin.setVisible(false);
		Estudiante usu  =  new Estudiante();
		admin.setVisible(false);
	}

}
