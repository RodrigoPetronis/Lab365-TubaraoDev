
public class NumeroPrimo {

    public void numeroPrimo(int num) {
        if (num <= 1) {
            System.out.println(num + " Não é um número primo");
        }

        Boolean isPrimo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }

        if(isPrimo){
            System.out.println("Número " + num + " é primo");
        }else{
            System.out.println("Número " + num + " não é primo");
        }
        
    
    }

}
