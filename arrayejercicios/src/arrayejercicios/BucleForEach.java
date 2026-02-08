package arrayejercicios;

public class BucleForEach {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Naranja", "Plátano"};
        int [] numero= {1,12,45};

        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
        
        for (int number:numero) {
        	System.out.println("numeros: "+number);
        	
        }     
    }
}
