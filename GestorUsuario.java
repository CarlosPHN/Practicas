package legacy;

public class GestorUsuario {
	
	public static boolean autenticarUsuario(String login, String password) throws Exception{
		boolean autenticado = false;
		Agente ag = Agente.getAgente();
		String SQLSelect = "SELECT login, pass FROM Usuario WHERE login = '"+login+"' AND pass = '"+password+"'";
		if(ag.select(SQLSelect) != null) {

			autenticado = true;
		}	
		return autenticado;
	}
	
	public static boolean nuevoUsuario(String login, String password) throws Exception{
		boolean insertado = false;
		Agente ag = Agente.getAgente();
		String SQLInsert = "INSERT INTO Usuario VALUES('"+login+"','"+password+"')";
		if(ag.insert(SQLInsert) == 1) {
			insertado=true;
		}	
		
		return insertado;		
	}
	
	public static boolean eliminarUsuario(String login, String password) throws Exception{
		boolean eliminado = false;
		Agente ag = Agente.getAgente();
		
		String SQLInsert = "DELETE FROM Usuario WHERE login = '" +login+ "' AND pass = '" +password+ "'";
		if(ag.delete(SQLInsert) == 1) {
			eliminado=true;
		}	
		
		return eliminado;
	}
	
}
