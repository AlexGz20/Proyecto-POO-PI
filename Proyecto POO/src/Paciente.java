
public class Paciente extends Usuario {
	private int edad;
	private int alto;
	private int peso;
	private String enfpre;
	private String alergias;
	private String tsangre;
	private Event[] citas;
	private Event[] medicina;
	private String[] doctor;
	
	public Paciente(String nombre, String password, int tipo, int edad, int alto, int peso, String enfpre,
			String alergias, String tsangre, Event[] citas, Event[] medicina, String[] doctor) {
		super(nombre, password, tipo);
		this.edad = edad;
		this.alto = alto;
		this.peso = peso;
		this.enfpre = enfpre;
		this.alergias = alergias;
		this.tsangre = tsangre;
		this.citas = citas;
		this.medicina = medicina;
		this.doctor = doctor;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getEnfpre() {
		return enfpre;
	}

	public void setEnfpre(String enfpre) {
		this.enfpre = enfpre;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getTsangre() {
		return tsangre;
	}

	public void setTsangre(String tsangre) {
		this.tsangre = tsangre;
	}

	public Event[] getCitas() {
		return citas;
	}

	public void setCitas(Event[] citas) {
		this.citas = citas;
	}

	public Event[] getMedicina() {
		return medicina;
	}

	public void setMedicina(Event[] medicina) {
		this.medicina = medicina;
	}

	public String[] getDoctor() {
		return doctor;
	}

	public void setDoctor(String[] doctor) {
		this.doctor = doctor;
	}
	
	
	
	
	

}
