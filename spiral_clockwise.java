/*This Java code generates a spiral matrix in clockwise order based on the user input of the matrix size (n x n). It first 
prompts the user to enter the value of 'n' for the matrix dimensions. Then, it initializes a 2D array to store the elements 
of the spiral matrix. Using a series of loops, it iterates through the matrix in a spiral pattern, filling in each element 
with sequential numbers starting from 1 up to n*n. The algorithm accounts for both odd and even values of 'n' to ensure that 
the spiral pattern is correctly generated. Finally, it prints the resulting spiral matrix. This program effectively generates 
a spiral matrix in a clockwise direction based on the given size 'n'.*/

import java.util.Scanner; // Importing Scanner class to take user input

class spiral_clockwise // Class declaration
{
    public static void main(String args[]) // Main method
    {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take user input
        System.out.println("Enter the value of n for n x n matrix"); // Prompting user to enter matrix size
        int r = sc.nextInt(); // Reading user input for matrix size
        int a[][] = new int[r][r]; // Creating a 2D array to store the matrix
        int s = 1, z = (r * r); // Initializing variables for matrix filling
        if (r % 2 != 0) // Checking if the matrix size is odd
        {
            int i = Math.round(r / 2); // Calculating the middle index of the matrix
            a[i][i] = (r * r); // Assigning the middle element of the matrix
        } 
        else // If the matrix size is even
        {
            int i = Math.round(r / 2); // Calculating the middle index of the matrix
            a[i][i - 1] = (r * r); // Assigning the element to the left of the middle element
        }
        int n = 0, o = 0, j = 0, y = (r - 1); // Initializing loop variables
        while (true) // Infinite loop to fill the matrix in a spiral manner
        {
            for (o = j; o < y; o++) // Filling the top row from left to right
            {
                a[n][o] = s; // Assigning value to matrix element
                s = s + 1; // Incrementing value for next element
            }
            if (s == z) // Checking if all elements are filled
                break; // Exiting the loop if all elements are filled
            for (n = j; n < y; n++) // Filling the rightmost column from top to bottom
            {
                a[n][o] = s; // Assigning value to matrix element
                s = s + 1; // Incrementing value for next element
            }
            if (s == z) // Checking if all elements are filled
                break; // Exiting the loop if all elements are filled
            for (o = y; o > j; o--) // Filling the bottom row from right to left
            {
                a[n][o] = s; // Assigning value to matrix element
                s = s + 1; // Incrementing value for next element
            }
            if (s == z) // Checking if all elements are filled
                break; // Exiting the loop if all elements are filled
            for (n = y; n > j; n--) // Filling the leftmost column from bottom to top
            {
                a[n][o] = s; // Assigning value to matrix element
                s = s + 1; // Incrementing value for next element
            }
            j = j + 1; // Updating loop variables for next iteration
            y = y - 1; // Updating loop variables for next iteration
            n = n + 1; // Updating loop variables for next iteration
            if (s == z) // Checking if all elements are filled
                break; // Exiting the loop if all elements are filled
        }
        System.out.println("The spiral matrix in clockwise is"); // Printing message indicating result
        for (n = 0; n <= (r - 1); n++) // Looping through rows of the matrix
        {
            for (o = 0; o <= (r - 1); o++) // Looping through columns of the matrix
            {
                System.out.print(a[n][o] + "\t"); // Printing each element of the matrix
            }
            System.out.println(); // Moving to the next line for the next row
        }
    }
}
