//CONTEST Q.
/*The scoreboard of an imaginary game is of a 2D matrix of size m x n format contains 0s and 1s. 
You played a match of the game with a team and the opposition is in a better position in the half time. 
You, being jealous decide to risk tampering the scoreboard, since it is very easy and the game wasn't being 
monitored properly. You wish to change the entire scoreboard of your time. The rules of tampering are:

Choose any row or column and toggle all the values of it, i.e. 0 -> 1 and 1 -> 0
Every row of the matrix is a binary number and the score of the matrix is calculated by summing all these numbers. 
Calculate the highest possible score after making any number of moves.

Input Format
First line consists of two integers, m and n, the number of rows and columns in the scoreboard matrix matrix

The next m lines contain n integers (0 or 1) each, representing the matrix matrix

Output Format
Print the highest possible score after making any number of moves.

Example 1
Input

3 4
0 0 1 1
1 0 1 0
1 1 0 0
Output

39
Explanation

0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39

Example 2
Input

1 1
0
Output

1
Explanation

binary number 0 represents integer 1.

Constraints
m == matrix.length

n == matrix[i].length

1 <= m, n <= 20

matrix[i][j] is either 0 or 1. */
package Array2D;
import java.util.*;
public class arr09 {
    public static void main(String[] args) {
        
    }
}
