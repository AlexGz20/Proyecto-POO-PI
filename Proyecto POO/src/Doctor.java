
public class Doctor extends Usuario{
	private int id;
	private String[] pacientes;
	private String[] mensajes;
	
	public Doctor(String nombre, String password, int tipo, int id, String[] pacientes, String[] mensajes) {
		super(nombre, password, tipo);
		this.id = id;
		this.pacientes = pacientes;
		this.mensajes = mensajes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getPacientes() {
		return pacientes;
	}

	public void setPacientes(String[] pacientes) {
		this.pacientes = pacientes;
	}

	public String[] getMensajes() {
		return mensajes;
	}

	public void setMensajes(String[] mensajes) {
		this.mensajes = mensajes;
	}
	
	
	
	

}
