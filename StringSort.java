import java.io.BufferedReader;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class StringSort{
 
    //Bubble sort algorithm used
    //start varibale used to calculate total time for sorting
    public static void my_bubble_sort(ArrayList<String> myArrayList){

      int myArrayListSize = myArrayList.size();

      long start = System.currentTimeMillis();


      String temp;

      //If the current string is smaller than the previous string, swap them using temp variable
      for (int i = 0; i < myArrayListSize; i++){
        for (int j=1; j < myArrayListSize-i; j++){
          if (myArrayList.get(j-1).compareTo(myArrayList.get(j)) > 0)
                {
                    temp = myArrayList.get(j);
                    myArrayList.set(j, myArrayList.get(j-1));
                    myArrayList.set(j-1, temp);
                }   
        }  
      }
        System.out.println("--- " + (System.currentTimeMillis()-start) + " miliseconds " + " to bubble sort in Java" + " ---");
    }


    //Print function takes in the ArrayList and number of words to print
    public static void printStrings(ArrayList<String> list, int words){
      for (int i = 0; i < words; i++){
        System.out.print(list.get(i) + " ");
      }
    }


    public static void main(String[] args)
    {

        ArrayList<String> myArrayList = new ArrayList<String>();

        // Code to read from text file and store in array list
        // Array list used as the number of strings don't need to be counted to initialize array
        try {

            File file = new File("cpt316-assignment-1-strings.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null){
                myArrayList.add(st);
            }
              br.close();
          } 
          catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          catch (IOException e){
            System.out.println(e);
          }
        
        
        //Sorting and then printing ten words
        my_bubble_sort(myArrayList);
        printStrings(myArrayList, 10);

    }
}