package es.studium.Recorre;

public class Recorre
{

	public static void main(String[] args)
	{
		String cadena = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		int i;
		for(i = 0; i<cadena.length(); i++)
		{
			System.out.println(cadena.charAt(i));
		}

	}

}
