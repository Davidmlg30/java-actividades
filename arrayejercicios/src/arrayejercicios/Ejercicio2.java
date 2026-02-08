package arrayejercicios;


public class Ejercicio2 {

	public static void main(String[] args) {
		//array una sola dimension, matrices son arrays multidimensionales
		String texto;
		String [] array1= {"Eva","Ana", "Cristina", "Pablo", "Maria", "Isabel"}; 
		//definimos el array y le damos valores
		String [] array2= new String[6]; 
		//creamos un objeto array, en realidad todos los arrays sean creados de una manera o de otra son objetos
		array2[0]="España";
		array2[1]="Francia";
		array2[2]="Estados Unidos";
		array2[3]="Italia";
		array2[4]="Irlanda";
		array2[5]="Rep.Checa";
		//recorremos ambos arrays
		mostrarArray("Array1 Nombres",array1);	
		mostrarArray("Array2 Paises",array2);
	}
	public static void mostrarArray(String texto,String [] array) {
		System.out.println(texto+"******");
		for (String array1:array) { //podemos sustituir a<5 por array.length
			System.out.println(" Array "+array1);
			}
		
		
	} 
	
	
	

}
