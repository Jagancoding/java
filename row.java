import java.io.*;
 
class row {
    public static void main(String[] args)
    {
        int n = 5;
       
        String names[]
            = { "banana", "carrot", "radish", "apple","jack" };
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
               
                if (names[i].compareTo(names[j]) > 0) {
                   
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
       
        System.out.println(
            "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}