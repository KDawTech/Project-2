# Project-2

Create a Class for Roman Numerals 
Create a class called RomanNumeral which has two private instance variables: the String value of the 
Roman numeral, and an int for the Arabic value. It should have a one-argument constructor that takes a 
String as a parameter for the Roman Numeral. For this project we will not do error checking. The 
constructor should set the Roman numeral instance variable, and convert the Roman numeral to Arabic 
and set the Arabic integer value. Provide get and set methods for the String RomanNumeral and a get 
method for the Arabic value. Other methods to include are equals, toString, and compareTo. 
Use linked lists to store and sort RomanNumerals 
Create a class called RomanNumeralList based on the linked list with head node as shown in lecture. 
The data in the nodes should be a RomanNumeral. 
Create a class called UnsortedRomanNumeralList that extends RomanNumeralList. It should have an 
append method that takes a RomanNumeral as a parameter and adds it to the end of the list. 
Create a class called SortedRomanNumeralList that extends RomanNumeralList. It should have a 
method called add which takes a RomanNumeral as a parameter and inserts that word into the list in a 
position so that the list remains sorted. 
Read from the file and add to the sorted list 
For each line in the input file (same file as in project 1), break the line into individual RomanNumerals 
(Strings) and insert each RomanNumeral into the unsorted list (using append), and into the sorted list 
(using add). 
Display the results in a GUI with a GridLayout of one row and three columns. The first column, as in 
project 1, should contain the original RomanNumerals, the second column the unsorted Arabic values, 
and the third column the sorted Arabic values. 
