package clases;

public class Examen {
	private Integer nota;
	private Integer nohacenada;
	
	public Examen()
	{
		this.nota = 0;
	}
	
	public void calificar(Integer nota) throws Exception
	{
		if((nota >= 1) && (nota <= 10))
			this.nota = nota;
		else
			throw new Exception("Nota invalida");
	}
	

	public Integer getNota() {
		return nota;
	}
}
