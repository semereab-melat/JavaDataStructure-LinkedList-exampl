
import java.io.*;
import java.util.*;

class Main {
  static  Scanner keyboard = new Scanner(System.in);
  public static void main(String[] args) {
    
    LinkedList<Integer> listNum = new LinkedList<>(Arrays.asList());
        LinkedList<Integer> subListing = new LinkedList<>(Arrays.asList());
        
        String filename, filename2;
        //Create a file containing 20 random numbers. Populate a linked list (listNum) with these values
        //I create a random numbers from 1 to 200
        System.out.print("Enter the first name of the file you want to create: ");
        filename = keyboard.nextLine();

        try {

            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < 20; i++) {
                int random = (int) (Math.random() * 200) + 1;
                listNum.add(random);
                pw.println(random);

            }
            System.out.println(listNum);

            //Using the listNum, write code to insert
            // 16 and 24 into the linked list at the first and last positions respectively.
            listNum.addFirst(16);
            listNum.addLast(24);
            System.out.println(listNum);


            //Write code to get the first and last occurrence of
            // 6 and 15 in a linked list, advise if these elements do not exist.

            if (listNum.contains(6)){
                int firstOccurrence =  listNum.indexOf(6);
                System.out.println("First Occurrence of 6: \t\t" + firstOccurrence);
            }
            if (listNum.contains(15)){
                int last =   listNum.lastIndexOf(15);
                System.out.println("Last Occurrence of 15: \t\t" + last);
            }
            else
                System.out.println("Not found in the list!");


            //Write code to display all of the elements and their positions in a linked list.

            for (int i = 0; i < listNum.size(); i++){
                //System.out.println("Number " + listNum.get(i) + "\tat position\t" + (i+1));
            }

            //Add some code to remove first, last and element 4 from a linked list.
            listNum.removeFirst();
            listNum.removeLast();
            listNum.remove(4);
            System.out.println(listNum);

            //Now swap the elements at locations 3 and 16 in the linked list
            Collections.swap(listNum, 3,16);
            System.out.println(listNum);

            // close files
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

            //Create a second list containing 6 elements and join it to listNum

            System.out.print("Enter the name of second file you want to create: ");
            Scanner keyboard = new Scanner(System.in);
            filename2 = keyboard.nextLine();

            try {

                FileWriter fw2 = new FileWriter(filename2);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                PrintWriter pw2 = new PrintWriter(bw2);
                for (int i = 0; i < 6; i++) {
                    int random = (int) (Math.random() * 200) + 1;
                    subListing.add(random);
                    pw2.println(random);
                }
                System.out.println("New list with six random numbers: \n" + subListing);
                listNum.addAll(subListing);
                System.out.println("After both lists linked together:\n" + listNum);

                //the first element of a linked list.
                System.out.println("First Element: " + removeInt(listNum));

                //Check if a 32 exists in a linked list and print an appropriate response to the console.
                if (listNum.contains(32)) {
                    System.out.println("Found the element");
                }else {
                    System.out.println("There is no such element");
                }

                // Also test to determine if the linked list is empty or not.
                if (listNum == null) {
                    System.out.println("List is null");
                }
                if (listNum.isEmpty()) {
                    System.out.println("List is empty");
                }
                else {
                    System.out.println("List is not empty or null");
                }

                pw2.close();
                bw2.close();
                fw2.close();
            } catch (IOException e) {
                System.out.println(e);
            }
  

  }
    public static int removeInt(LinkedList <Integer> listNew){

      int removed = (int )listNew.removeFirst();
      return removed; 
    
    }//end removeInt
  
}