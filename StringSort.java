import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;
import java.util.ArrayList;

class StringSort{
 
    public static void sortStrings(ArrayList<String> arr, int n)
    {

      long start = System.currentTimeMillis();

        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr.get(j).compareTo(arr.get(i)) > 0)
                {
                    temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("--- " + (end-start) + " miliseconds " + " to sort in Java" + " ---");
    }

    public static void main(String[] args)
    {

        ArrayList<String> myArrayList = new ArrayList<String>();


        // Code to read from text file and store in array list
        try {
            File myObj = new File("cpt316-assignment-1-strings.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              myArrayList.add(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        //////////////////////////////////////////////////////
        sortStrings(myArrayList, myArrayList.size());

        

        for (int i=0; i < 10; i++){
          System.out.print(myArrayList.get(i) + " ");
        }

        
        
    }
}