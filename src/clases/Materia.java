package clases;

public class Materia {
	Examen examen1 = new Examen();
	Examen examen2 = new Examen();
	
	public void evaluar(Integer nExamen, Integer nota) throws Exception
	{
		if(nExamen.equals(1))
		{
			
			try{				
				examen1.calificar(nota);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
			if(nExamen.equals(2))
			{
				
				try{				
					examen2.calificar(nota);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			else
				throw new Exception("Numero de examen invalido");
	}
	
	public void recuperar(Integer nExamen, Integer nota) throws Exception {
		if(nExamen.equals(1)) {
			if(examen1.getNota() != 0) {
				try {
					examen1.calificar(nota);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				System.out.println(examen1.getNota());
				throw new Exception("No se puede recuperar un examen que no tiene nota");
			}
		}
		else
			if(nExamen.equals(2)) {
				if(examen2.getNota() != 0) {
					try {
						examen2.calificar(nota);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				else {
					
					throw new Exception("No se puede recuperar un examen que no tiene nota");
				}
			}
			else
				throw new Exception("Numero de examen invalido");
	}

	public Examen getExamen1() {
		return examen1;
	}

	public Examen getExamen2() {
		return examen2;
	}
}
