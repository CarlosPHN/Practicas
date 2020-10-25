package legacy;

public class Usuario {
	
	public String mLogin;
	public String mPassword;
	
	
	//Constructor para la creacion de un objeto Usuario vacio
	public Usuario(){
		this.mLogin = null;
		this.mPassword = null;
	}
	
	//Constructor para la creacion de un Usuario
	public Usuario(String login, String password){
		this.mLogin = login;
		this.mPassword = password;
	}
	
	
}
