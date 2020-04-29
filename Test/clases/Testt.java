package clases;

import static org.junit.Assert.*;


import org.junit.Test;

public class Testt {

	@Test
	public void testMateria() {
		Materia miMateria = new Materia();
		
		try{			
			miMateria.evaluar(4, 7);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try{			
			miMateria.evaluar(1, 16);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try{			
			miMateria.evaluar(1, 6);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			miMateria.recuperar(1, 11);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try{			
			miMateria.evaluar(2, 8);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(miMateria.getExamen1().getNota());
		System.out.println(miMateria.getExamen2().getNota());
	}
	
	@org.junit.Test
	(expected = Exception.class)
	public void testExamen() throws Exception
	{
		Examen miExamen = new Examen();	
		miExamen.calificar(47);
	}

}
