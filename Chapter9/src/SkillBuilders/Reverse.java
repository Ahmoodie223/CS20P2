package SkillBuilders;

public class Reverse {
   
public static void main(String[] args) {
     
	// Create an integer array of size 10
       
	int[] array = new int[10];

        // Store the index of each element in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Display the title
        System.out.println("Countdown");

        // Display the array elements in reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
		
		
		
		
		
	




