/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int MinimumRectangle(int[][] points){
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int[]p:points){
            if(!map.containsKey(p[0])){
                map.put(p[0],new HashSet<>());
            }
            map.get(p[0]).add(p[1]);
        }
        int minArea=Integer.MAX_VALUE;
        for(int[] p1:points){
            for(int[] p2:points){
                if(p1[0]==p2[0] || p1[1]==p2[1]){
                    continue;
                }
                if((map.get(p2[0]).contains(p1[1])) && (map.get(p1[0]).contains(p2[1]))){
                    minArea=Math.min(minArea,Math.abs(p2[0]-p1[0])*Math.abs(p2[1]-p1[1]));
                }
            }
        }
        if(minArea==Integer.MAX_VALUE){
            return -1;
        }
        return minArea;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of point you want to enter: ");
		int n=sc.nextInt();
		int points[][]=new int[n][2];
		System.out.println("Enter the points:");
		for(int i=0;i<n;i++){
		    for(int j=0;j<2;j++){
		        points[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Area of Minimum size Rectangle: "+MinimumRectangle(points));
	}
}


