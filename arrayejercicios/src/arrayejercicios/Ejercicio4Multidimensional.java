package arrayejercicios;


public class Ejercicio4Multidimensional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array una sola dimension, matrices son arrays multidimensionales
		String texto;
		String [] [] array1= new String [3][2];// serían 3 filas y dos columnas
			
		array1[0][0]="España";
		array1[1][0]="Italia";
		array1[2][0]="Francia";
		array1[0][1]="Madrid";
		array1[1][1]="Roma";
		array1[2][1]="Paris";
			
		
		mostrarArray(array1);	//recorremos el array
		mostrarArray2(array1);
				
	}
	// metodo mostrarArrays	
	public static void mostrarArray(String[][] array1) {
	
		for (int a=0;a<array1.length;a++) { //podemos sustituir a<5 por array.length
			System.out.print(" pais: "+array1[a][0]);
			System.out.println(" capital: "+array1[a][1]);
			}	
	} //final del metodo mostrarArray

	//otra forma mas correcta para mostrar el array
	public static void mostrarArray2(String[][] array1) {
		System.out.println(" length del array 1: "+array1.length);//length de la fila
		for (int a=0;a<array1.length;a++) { //podemos sustituir a<5 por array.length
			
			for (int b=0;b<array1[a].length;b++) { //aqui podriamos usar a o b porque el numero de columnas de cada fila es el mismo
				System.out.println(" array1[a]. lenght "+array1[a].length ); //length de la columna
				System.out.println(" fila "+a+ " columna "+b+": "+array1[a][b]);
				
			}
		
			
		}	
	} //final del metodo mostrarArray1




} 
