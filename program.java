// ! String -> datatype?

// class program {
// public static void main(String[] args) {
// String s = "Hello world";

// //* instanceOf operator
// if (s instanceof String) {
// System.out.println("str is an instance of String.");
// } else {
// System.out.println("str is not an instance of String.");
// }
// }
// }

// ?-------------------------------------------------------------------

// ! printing input from the command line argument
// class program {
// public static void main(String[] args) {

// //* Since command line argument -> is string type so we need to iterate over

// if (args.length > 0) {
// //* Argument passed */
// for (int i = 0; i < args.length; i++) {
// System.out.println(args[i]);
// }
// } else {
// System.out.println("No argument passed");
// }

// }
// }

// ?-------------------------------------------------------------------

// ! printing input from the command line argument -> using Array.toString() OR
// for_each loop

// import java.util.Arrays;

// class program {
// public static void main(String[] args) {

// //* Since command line argument -> is string type so we need to iterate over

// if (args.length > 0) {
// String s = Arrays.toString(args);
// System.out.println(s);
// } else {
// System.out.println("No argument passed");
// }

// }
// }

// ! For each loop
/*
 * for (String value : args){
 * System.out.println(value);
 * }
 */
// ?-------------------------------------------------------------------

// !Java program to swap 2 number without third number
// class program {
// public static void main(String[] args) {

// int a = 10;
// int b = 20;

// //* Now Swapping

// a = a + b; // * 30
// b = a - b; // * 10
// a = a - b; // * 20
// System.out.println("the swapped value of a -> " + a + " and value of b -> " +
// b);
// //* the swapped value of a -> 20 and value of b -> 10

// }
// }

// ?-------------------------------------------------------------------

// ! Java program to print largest number in an array
// class program {
// public static void main(String[] args) {

// int[] arr = { 30, 12, 33, 5, 88, 17 };
// int max = arr[0];

// //* Traversing the array and checking if number is greater than the max then
// storing value */

// for (int i : arr) {
// if (max < i) {
// max = i;
// }
// }
// System.out.println(max); //* 88

// }
// }

// *-------------------------------------------------------------------

// ! What is output of sout?

// class program {
// public static void main(String[] args) {
// System.out.println(10 + 20 + "Hello" + "World"); // * 30HelloWorld
// System.out.println("Hello" + "World" + 10 + 20); // * HelloWorld1020
// System.out.println("Hello" + "World" + (10 + 20)); // * HelloWorld30
// }
// }

// ?-------------------------------------------------------------------

// !What is the difference between == and equals()? -> it is related to object
// class program {
// public static void main(String[] args) {

// // * == Operator
// String str1 = new String("Hello");
// String str2 = new String("Hello");
// boolean areEqual = (str1 == str2); // * This will be false because str1 and
// str2 refer to different objects.
// System.out.println(areEqual); // Todo: False

// // * equals():
// boolean areEqual1 = str1.equals(str2); // * This will be true because the
// equals() method in the String class is
// // overridden to compare the content of the strings.
// System.out.println(areEqual1); // Todo: true

// // int a = 10;
// // int b = a;
// // System.out.println(a.equals(b)); //* Cant use with primitie dataType
// // //! Error

// }
// }

// *-------------------------------------------------------------------

// ! Checking the intial capacity of arraylist

// *-------------------------------------------------------------------

// ! Main method overloading
// class MainMethodOverloading {
// public static void main(String[] args) {
// System.out.println("This is the standard main method.");

// }

// public static void main(int num) {
// System.out.println("This is an overloaded main method with an integer
// parameter.");
// System.out.println("Received number: " + num);
// }

// public static void main(String arg1, String arg2) {
// System.out.println("This is another overloaded main method with two string
// parameters.");
// System.out.println("Received arguments: " + arg1 + " and " + arg2);
// }
// }

// * ----------------------------------------------------------------------- */

// ! Parsing the value -->>
// class StringToIntegerConversion {
// public static void main(String[] args) {
// String numberStr = "42"; // A string containing an integer value

// //* Using Integer.parseInt()
// int parsedInt1 = Integer.parseInt(numberStr);
// System.out.println("Using Integer.parseInt(): " + parsedInt1); // * 42

// //* Using Integer.valueOf()
// Integer parsedInt2 = Integer.valueOf(numberStr);
// System.out.println("Using Integer.valueOf(): " + parsedInt2); // * 42
// }
// }

// * ----------------------------------------------------------------------- */

// ! Number format Exception
// class NumberFormatExceptionExample {
// public static void main(String[] args) {
// //* Attempt to parse an invalid string as an integer
// String invalidStr = "abc";

// try {
// int parsedInt = Integer.parseInt(invalidStr);
// System.out.println("Parsed Integer: " + parsedInt);
// } catch (NumberFormatException e) {
// System.out.println("NumberFormatException occurred: " + e.getMessage());
// }
// }
// }

// //* Output: NumberFormatException occurred: For input string: "abc" */

// * ----------------------------------------------------------------------- */

// ! Call by Value
// class program {

// static void modifyValue(int x) {
// x = 20; // * Changes the value of the parameter 'x' inside the function
// System.out.println(x); // * 20
// }

// public static void main(String[] args) {
// int value = 10;
// modifyValue(value);
// System.out.println(value); // * Output: 10 (unchanged)

// }

// }

// * ----------------------------------------------------------------------- */

// ! ◦ Call by reference
// class program {

// int x;

// program(int x) {
// this.x = x; // * Constructor */
// }

// void modifyValued(program obj) {
// obj.x = 30;

// }

// public static void main(String[] args) {

// program obj = new program(10);
// obj.modifyValued(obj);
// System.out.println(obj.x); // * 30

// }

// }

// * ----------------------------------------------------------------------- */

// class program {
// public static void main(String[] args) {

// }

// }

// * ----------------------------------------------------------------------- */

// class program {
// public static void main(String[] args) {

// }

// }

// * ----------------------------------------------------------------------- */

// class program {
// public static void main(String[] args) {

// }

// }

// * ----------------------------------------------------------------------- */

// class program {
// public static void main(String[] args) {

// }

// }
