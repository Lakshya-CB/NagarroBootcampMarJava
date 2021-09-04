package QPS_6;

import java.util.ArrayList;

public class Matrix_dia {
	public int[] findDiagonalOrder(int[][] mat) {
        int[] arr = new int[mat.length*mat[0].length];
        int count=0;
        for(int dia= 0;dia < mat.length+mat[0].length-1;dia++){
            int row=0;
            int col=0;
            if(dia<mat[0].length){
                col=dia;
                
            }
            else{
                col = mat[0].length-1;
                row = dia-mat[0].length+1;
                
            }
            ArrayList<Integer> AL = new ArrayList<>();
            // System.out.println(row + "  "+col);
            while(row<mat.length && col>=0){
                // System.out.print(mat[row][col]);
                AL.add(mat[row][col]);
                row++;col--;
            }
            // System.out.println(AL);
            for(int i=0;i<AL.size();i++){
                if(dia%2==0){
                    arr[count] = AL.get(AL.size()-1-i);
                }
                else{
                    arr[count] = AL.get(i);
                }
                count++;
            }
        }
        return arr;
    }
}