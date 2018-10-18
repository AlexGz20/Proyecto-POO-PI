
public class Cita extends Event{
	private String lugar;

	public Cita(int month, int day, int hora, int intervalo, String lugar) {
		super(month, day, hora, intervalo);
		this.lugar = lugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	

}
