public class App {
    public static void main(String[] args) throws Exception {
        String paises[] = { "Mexico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha" };

        bubbleSort(paises);
        insertionSort(paises);
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

        for (int k = 0; k < tamanhoLista; k++) {
            System.out.println(paises[k]);
        }
    }
}
