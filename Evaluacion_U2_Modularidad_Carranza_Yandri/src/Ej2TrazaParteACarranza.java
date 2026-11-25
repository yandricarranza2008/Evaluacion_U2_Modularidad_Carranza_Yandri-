public class Ej2TrazaParteACarranza {

    static int pot(int b, int e) { 
        if (e == 0) 
            return 1; 
        return b * pot(b, e - 1); 
    }

    public static void main(String[] args) {
        int b = 3;
        int e = 4;
        System.out.println("La llamada es: " + pot(b, e));
    }
}

//La respuesta es 81 