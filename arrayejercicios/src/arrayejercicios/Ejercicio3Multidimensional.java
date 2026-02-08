package arrayejercicios;

public class Ejercicio3Multidimensional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array una sola dimension, matrices son arrays multidimensionales
		String texto;
		String [] [] array1= {
				{"España","Madrid"},
				{"Italia","Roma"},
				{"Francia","Paris"}}; //definimos el array y le damos valores
		
		
		mostrarArray(array1);	//recorremos el array
				
	}
		
	public static void mostrarArray(String[][] array1) {

		for (int a=0;a<array1.length;a++) { //podemos sustituir a<5 por array.length
			System.out.print(" pais: "+array1[a][0]);
			System.out.println(" capital: "+array1[a][1]);
			
		}
		
		
	} 
}

