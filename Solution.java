/**
 * Joshua Zweig | Columbia University
 * Explination of Approach
 * I found which columns forced the rows to be incorrect or "off" and recorded what would need to 
 * be changed to make the column one that would allow another wish from the box from the 
 * perspective of P and T, respectivley.
 * From these recorded lists of what columns needed to be flipped I found the most frequently occuring
 * list of columns that needed to be changed
 * While debugging, I realized that I did not account for the case in which P and T lists could both appear
 * as the result of changing one column which still grants another wish - so I added the statement
 *                 if(offT[i].equals(offP[j]) || offP[i].equals(offT[j]))
 * 
 * Future Improvements:
 * Accounting for the aforementioned case early could have led to a better design.
 * Also, there is definitley a more optimized method to finding the "mode" of the lists
 * 
 * Thanks for reading!
 * Best,
 * Joshua Zweig
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String scratch = in.nextLine();
        String [][] table = new String[m][n];
        for(int i = 0; i < m; i++)
        {
            String temp = in.nextLine();
            for(int j = 0; j < n; j++)
            {
                table[i][j] = String.valueOf(temp.charAt(j));
                //System.out.println(table[i][j]); //Test input routine
            }
        }
        //INPUT ROUTINES VERIFIED
        
        ArrayList [] offP = new ArrayList[m];
        ArrayList [] offT = new ArrayList[m];
        for(int i = 0; i < m; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            ArrayList<Integer> tempT = new ArrayList<Integer>();
            for(int j = 0; j < n; j++)
            {
                if(!table[i][j].equals("P"))
                {
                    temp.add(j);
                }
                else
                {
                    tempT.add(j);
                }
            }
            offP[i] = temp;
            offT[i] = tempT;
        }
        //Now I have an array of arraylists, each arraylist containt what needs to be changed
        
        //Now I need to find most common arraylist of that array
        //Theres definitely optimizations to be made for finding the "mode"
        int [] counts = new int[m];
        int [] countsT = new int[m];
        for(int i = 0; i < m; i++)
        {
            for(int j = i + 1; j < m; j++)
            {
                if(offT[i].equals(offP[j]) || offP[i].equals(offT[j]))
                {
                    counts[i]++; 
                    countsT[i]++;
                    continue;
                }
                if(offP[i].equals(offP[j]))
                {
                    counts[i]++;
                }
                if(offT[i].equals(offT[j]))
                {
                    countsT[i]++;
                }
                
            }
        }

        int maxP = counts[0];
        int maxT = countsT[0];
        //Impovement in efficency could be to do this in the above for loop
        for(int i = 1; i < m; i++)
        {
            if(counts[i] > maxP)
            {
                maxP = counts[i];
            }
            if(countsT[i] > maxT)
            {
                maxT = countsT[i];
            }
        }
        //The below must be done to include the first row that was matching
        maxP += 1;
        maxT += 1;

        if(maxP > maxT)
        {
            System.out.println(maxP);
        }
        else
        {
            System.out.println(maxT);
        }
    }
}