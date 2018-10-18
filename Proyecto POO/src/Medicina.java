
public class Medicina extends Event{
	private int dianFinal;
	private String Cantidad;
	
	public Medicina(int month, int day, int hora, int intervalo, int dianFinal, String cantidad) {
		super(month, day, hora, intervalo);
		this.dianFinal = dianFinal;
		Cantidad = cantidad;
	}

	public int getDianFinal() {
		return dianFinal;
	}

	public void setDianFinal(int dianFinal) {
		this.dianFinal = dianFinal;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	
	
	
	
	

}
