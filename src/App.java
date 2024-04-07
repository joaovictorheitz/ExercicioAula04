public class App {
    public static void main(String[] args) throws Exception {
        String paises[] = { "Mexico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha" };
        int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};

        bubbleSort(paises);
        insertionSort(paises);
        selectionSort(numeros);
    }

    public static void bubbleSort(String[] paises) {
        int tamanhoLista = paises.length;
        
        for (int i = 0; i < tamanhoLista; i++) {
            for (int j = 0; j < tamanhoLista; j++) {
                if (paises[j].compareTo(paises[i]) > 0) {
                    var temp = paises[j];
                    paises[j] = paises[i];
                    paises[i] = temp;
                }
            }
        }
        
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println(paises[i]);    
        }
    }

    public static void insertionSort(String[] paises) {
        int tamanhoLista = paises.length;

        int j;
        String temp;
        for (int i = 0; i < tamanhoLista; i++) {
            j = i;
            while(j > 0 && paises[j-1].compareTo(paises[j]) > 0) {
                temp = paises[j];
                paises[j] = paises[j-1];
                paises[j-1] = temp;
                j--;
            }
        }

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println(paises[i]);
        }
    }

    public static void selectionSort(int[] numeros) {
        int tamanhoLista = numeros.length;

        for (int i = 0; i < tamanhoLista - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tamanhoLista; j++) {
                if (numeros[j] > numeros[min])
                    min = j;
            }
            int temp = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = temp;
        }

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println(numeros[i]);
        }
    }
}
