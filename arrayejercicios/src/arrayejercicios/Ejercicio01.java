package arrayejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int [] array2= new int[5]; //creamos un objeto array, en realidad todos los arrays sean creados de una manera o de otra son objetos
		array2[0]=15;
		array2[1]=25;
		array2[2]=35;
		array2[3]=45;
		array2[4]=55;
	
		
		for (int array:array2) { //podemos sustituir a<5 por array.length
			
			System.out.println(" Array "+array);
			
		}
	}

}

