//wordgui.java
import javax.swing.*;

import java.awt.*;



public class RomanNumeralGUI {

    public RomanNumeralGUI(UnsortedRomanNumeralList a, SortedRomanNumeralList b, String c) {
        // public WordGui(UnsortedWordList a, SortedWordList b) {
        createAndShowGUI(a, b, c);
    }

    
    /** 
     * @param a
     * @param b
     */
    public static void createAndShowGUI(UnsortedRomanNumeralList a, SortedRomanNumeralList b, String c) {
        JFrame frame = new JFrame("Roman Numerals   in Sorted Word List and Unsorted Word List");   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);// width, height);
        frame.setLocation(200, 200);// x, y);
        frame.setLayout(new GridLayout(1, 3));

        JTextArea textArea1 = new JTextArea();// location display words from txt
        JTextArea textArea2 = new JTextArea(BorderLayout.CENTER);// location display unsorted
        JTextArea textArea3 = new JTextArea(BorderLayout.WEST);// location display sorted
        textArea1.setEditable(false);
        textArea2.setEditable(false);
        textArea3.setEditable(false);

        JScrollPane scrollPane1 = new JScrollPane(textArea1);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);
        JScrollPane scrollPane3 = new JScrollPane(textArea3);

        frame.getContentPane().add(scrollPane1);
        frame.getContentPane().add(scrollPane2);
        frame.getContentPane().add(scrollPane3);


        textArea2.setText("Unsorted: " + " \n");
        textArea3.setText("Sorted: " + "\n");


        
        
       
        // try {
        //     FileReader w = new FileReader("input.txt");// read input file
        //     BufferedReader br = new BufferedReader(w);
        //     //split the file line by line by comma separated
            
        //     // Split the line by commas using the split() method

           
        //     //textArea1.append( "\n" + "," );
        //     //textArea1.read(br, null);
        //     textArea1.read( br,  null );

             
        //     //String [] line =text.split(",");
        //     //textArea1.requestFocus();// size


        //     br.close();
        // } catch (Exception e2) {
        // }

        
        textArea1.setBackground(Color.GRAY);
         
        //textArea1.append( "\n");
        //textArea1.append( "\n" + "," );
        textArea2.setBackground(Color.cyan);
        textArea3.setBackground(Color.yellow);
        textArea1.append("\n"+c);
        textArea2.append(a.toString());
        textArea3.append(b.toString());
      

        frame.pack();
        frame.setVisible(true);

    }

    


    public void display(UnsortedRomanNumeralList a, SortedRomanNumeralList b) {// display unsort and sort variables a and b
        // public void display(UnsortedWordList a, SortedWordList b) {
        // testing

    }

}
