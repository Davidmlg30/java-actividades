package arrayejercicios;


public class Ejercicio0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array una sola dimension, matrices son arrays multidimensionales
		int [] array1= {2,4,6,8,10}; //definimos el array y le damos valores
		String [] array2= {"Hola a todos", "Hello everyone",
				"Kind regards"};
		
		for (int array:array1) { //podemos sustituir a<5 por array.length
				System.out.println(" Array "+array);
			
		}	
		
		array2[2]="Java is fun.";
		
		for (String arrayNombre: array2) {
			System.out.print(" . "+arrayNombre);
			
		}
		
	}
		
}
