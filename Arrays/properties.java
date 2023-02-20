import java.util.Arrays;



/**
 *
 * @author ADMIN
 */
public class Dictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr;
        int[] arrcpy;
        int[] arrfill;
        // allocating memory for 5 integers.
        arr = new int[5];
        
        arrfill = new int[5];
  
        // initialize the first elements of the array
        arr[0] = 20;
  
        // initialize the second elements of the array
        arr[1] = 10;
  
        // so on...
        arr[2] = 30;
        arr[3] = 5;
        arr[4] = 50;
        
  
        // accessing the elements of the specified array
        //Property 1: arr.length
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                               + " : " + arr[i]);
       
        //Property 2: sorting function (sort)[Sorts the specified array into ascending numerical order.]
        
       Arrays.sort(arr);
        System.out.println("Values After Sorting : ");
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                               + " : " + arr[i]);
        
        System.out.println("The element is found at position :  "+Arrays.binarySearch(arr, 30));
        
       //Property 3: copyOf [Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.]
       
       arrcpy=Arrays.copyOf(arr, 5);
        for (int i = 0; i < arrcpy.length; i++)
            System.out.println("Element at copied index " + i + " : " + arrcpy[i]);
       
       System.out.println("Check if the two arrays are equal :  " +Arrays.equals(arr, arrcpy));
       
       
     //Property 4: array fills using fill function
       
       Arrays.fill(arrfill, 10);
      
       //Property 5: for loop for arrays
       /*for (type var : array) 
        { 
            statements using var;
        }*/
       for(int n:arrfill){
          System.out.println(n);
      }
    }
}
