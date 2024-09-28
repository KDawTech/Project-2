import java.util.StringTokenizer;

public class Project2 {
//@author Kevon Dawkins
    
 /** 
     * @param main
     */
    public static void main(String[] main) {
        

        
        TextFileInput file = new TextFileInput("input.txt");// input //file from
        // texfileinput.java

        UnsortedRomanNumeralList a = new UnsortedRomanNumeralList();
        SortedRomanNumeralList b = new SortedRomanNumeralList();
        String c = "";

        String line = file.readLine();
       // line = file.split(",");

                //split the file line by line by comma separated

       while (line != null) {
       
        
 

            
            
            // System.out.println(line);   
            

        StringTokenizer tn = new StringTokenizer(line, ",");

        while (tn.hasMoreTokens()) {   
            
          
                  
             //Split the line by commas that are seperated by spaces 
            String word = tn.nextToken();
           // Split the line by commas that are seperated by spaces
            String name = new String(word);
            c+=name + "\n"; 
           
            a.add(name);
            b.add(name);
            
           
            System.out.println(name);
              

        }
        line = file.readLine();
        
         
    }
         //System.out.println(a);//testing

         //System.out.println(b);//testing

        RomanNumeralGUI gui = new RomanNumeralGUI(a, b,c);
        //textArea1.append(gui.toString() + "\n");
        gui.display(a, b);//Call the display method of the RomanNumeralGUI object with arraylists a and b as parameters
    }
}










