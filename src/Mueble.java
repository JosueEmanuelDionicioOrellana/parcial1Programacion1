import java.util.List;

public class Mueble extends Vida{
	
	private String nombre;
	
	private List<Heroe> heroes;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Heroe> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<Heroe> heroes) {
		this.heroes = heroes;
	}
}
