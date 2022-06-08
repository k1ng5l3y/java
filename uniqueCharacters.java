import java.util.Scanner;


public class uniqueCharacters {

  public static void main(String args[]){
    //this app was written to check if a string has all unique characters

    boolean checker = false;
    Scanner in = new Scanner(System.in);

    //the next line prompt the user for inputs
    System.out.println("enter your string here :");
    String data = in.nextLine();

    //this loop is meant to cross check a char in a string with the next char to the right 
    for(int index_counter = 0; index_counter <= data.length(); index_counter++){

      for(int right_of_index_counter= index_counter + 1; right_of_index_counter < data.length(); right_of_index_counter++  ){

        if(data.charAt(index_counter) == data.charAt(right_of_index_counter)){

          checker = true;

        }

      }

    }

    if (checker){

      System.out.println("all characters are not unique");

    }else{

      System.out.println("all charaters are unique");

    }
  }
  

}


