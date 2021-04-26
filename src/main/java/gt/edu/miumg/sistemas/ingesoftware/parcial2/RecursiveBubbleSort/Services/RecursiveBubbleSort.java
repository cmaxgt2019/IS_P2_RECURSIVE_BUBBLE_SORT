package gt.edu.miumg.sistemas.ingesoftware.parcial2.RecursiveBubbleSort.Services;

public class RecursiveBubbleSort implements IRecursiveBubbleSort {

    @Override
    public void bubbleSort(String[] words, int n) {

        if (n == 1) 
            return;
        
        for(int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length - 1; j++) {
                String elementoActual = words[j],
                        elementoSiguiente = words[j + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {

                    words[j] = elementoSiguiente;
                    words[j + 1] = elementoActual;
                }
            }
        }

        bubbleSort(words, n - 1);
    }

}

