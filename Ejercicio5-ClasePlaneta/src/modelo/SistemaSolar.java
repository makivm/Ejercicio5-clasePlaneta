package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {
	private String nombre;
	private List<Planeta> lista;

	public SistemaSolar(String nombre) {
		this.nombre = nombre;
		this.lista = new ArrayList<Planeta>();
	}

	public void insertarPlaneta(Planeta p) {
		if (!lista.contains(p))
			lista.add(p);
	}

	public boolean eliminarPlaneta(Planeta p) {
		return lista.remove(p);
	}

	public void eliminarPlanetas() {
		lista.clear();
	}

	public int numeroPlanetas() {
		return lista.size();
	}

	@Override
	public String toString() {
		String res = this.nombre + "\n";
		for (Planeta planeta : lista) {
			res = res + planeta + "\n";
		}
		return res;
	}

	public boolean modificarPlaneta(Planeta p) {
		int pos = lista.indexOf(p);
		if (pos != -1) {
			lista.set(pos, p);
			return true;
		} else
			return false;
	}

	public Planeta buscarPlaneta(Planeta p) {
		int pos = lista.indexOf(p);
		System.out.println("posicion: " + pos);
		if (pos != -1) {
			return lista.get(pos);
		}
		return null;
	}

	public Planeta planetaMasDenso() {
		Planeta denso = lista.get(0);

		for (Planeta planeta : lista) {
			if (planeta.calculaDensidad() > denso.calculaDensidad())
				;
			denso = planeta;
		}
		return denso;
	}

	public double pesoMedio() {
		double mediaPeso = 0;
		for (int i = 0; i < lista.size(); i++) {
			mediaPeso = mediaPeso + lista.get(i).getMasa();
		}
		return mediaPeso / lista.size();
	}

	// ESTILO DAVID
	public double masaMedia() {
		double masaTotal = 0;
		for (Planeta planeta : lista) {
			masaTotal = masaTotal + planeta.getMasa();
		}
		return masaTotal / lista.size();
	}
}
