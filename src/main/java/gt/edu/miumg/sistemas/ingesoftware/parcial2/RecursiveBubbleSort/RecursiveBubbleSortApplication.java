package gt.edu.miumg.sistemas.ingesoftware.parcial2.RecursiveBubbleSort;

import gt.edu.miumg.sistemas.ingesoftware.parcial2.RecursiveBubbleSort.Services.IRecursiveBubbleSort;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.RecursiveBubbleSort.Services.RecursiveBubbleSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecursiveBubbleSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RecursiveBubbleSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        IRecursiveBubbleSort rBubble = new RecursiveBubbleSort();
        
        
        String[] words = {"Rojo","Azul","Morning","Sunday","Arbol","Bosque","Cielo"};
        
        rBubble.bubbleSort(words, words.length);
        
        for (int i = 0; i < words.length; i++) {
            
            
            System.out.println(words[i]);
            
        }
        
    
    }

}
