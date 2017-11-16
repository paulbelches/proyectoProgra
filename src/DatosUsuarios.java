
public class DatosUsuarios {
	public DatosUsuarios() {
	
	}
	String usua="";
	String cont="";
	
	public int validarUsuario() {
		usua=GuiLogin.txtUSU.getText();
		cont=GuiLogin.pssCON.getText();
		if(usua.equals("ADM")&& cont.equals("123")) {
			return 2;
		}
		else if(usua.equals("EST")&& cont.equals("123")) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
