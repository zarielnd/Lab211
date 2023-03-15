/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

import java.io.IOException;

/**
 *
 * @author phuon
 */
public class MatrixCalculator {
    Validate in = new Validate();
    
    void addition() throws IOException {
        int row1,column1,row2,column2,i,j;
        System.out.println("Enter row of matrix 1:");
        row1=in.getInt();
        System.out.println("Enter column of matrix 1:");
        column1=in.getInt();
        int[][] matrix1 = new int[row1][column1];
        System.out.println("Enter row of matrix 2:");
        row2=in.getInt();
        System.out.println("Enter column of matrix 2:");
        column2=in.getInt();
        int[][] matrix2 = new int[row2][column2];
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            int[][] result = new int[row1][column2];
            System.out.println("------Matrix 1-----");
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    
                    System.out.println("Enter number at ["+(i+1)+"]["+(j+1)+"]:");
                    matrix1[i][j]=in.getInt();
                }
            }
            System.out.println("------Matrix 2------");
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    
                    System.out.println("Enter number at ["+(i+1)+"]["+(j+1)+"]:");
                    matrix2[i][j]=in.getInt();
                }
            }
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    result[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }
            System.out.println("------Result-------");
            this.display(matrix1);
            System.out.println("+");
            this.display(matrix2);
            System.out.println("=");
            this.display(result);
            
        }
        else{
            System.out.println("2 matrix must have the same dimension");
            return;
        }
    }

    void subtraction() throws IOException {
        int row1,column1,row2,column2,i,j;
        System.out.println("Enter row of matrix 1:");
        row1=in.getInt();
        System.out.println("Enter column of matrix 1:");
        column1=in.getInt();
        int[][] matrix1 = new int[row1][column1];
        System.out.println("Enter row of matrix 2:");
        row2=in.getInt();
        System.out.println("Enter column of matrix 2:");
        column2=in.getInt();
        int[][] matrix2 = new int[row2][column2];
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            int[][] result = new int[row1][column2];
            System.out.println("------Matrix 1-----");
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    
                    System.out.println("Enter number at ["+(i+1)+"]["+(j+1)+"]:");
                    matrix1[i][j]=in.getInt();
                }
            }
            System.out.println("------Matrix 2------");
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    
                    System.out.println("Enter number at ["+(i+1)+"]["+(j+1)+"]:");
                    matrix2[i][j]=in.getInt();
                }
            }
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    result[i][j]=matrix1[i][j]-matrix2[i][j];
                }
            }
            System.out.println("------Result-------");
            this.display(matrix1);
            System.out.println("-");
            this.display(matrix2);
            System.out.println("=");
            this.display(result);
            
        }
        else{
            System.out.println("2 matrix must have the same dimension");
            return;
        }
    }

    void multiplication() throws IOException {
        int row1,column1,row2,column2,i,j,k;
        System.out.println("Enter row of matrix 1:");
        row1=in.getInt();
        System.out.println("Enter column of matrix 1:");
        column1=in.getInt();
        int[][] matrix1 = new int[row1][column1];
        System.out.println("Enter row of matrix 2:");
        row2=in.getInt();
        System.out.println("Enter column of matrix 2:"); 
        column2=in.getInt();
        int[][] matrix2 = new int[row2][column2];
        if(matrix1[0].length==matrix2.length){
            int[][] result = new int[row1][column2];
            System.out.println("------Matrix 1-----");
            for(i=0;i<row1;i++){
                for(j=0;j<column1;j++){
                    
                    System.out.println("Enter number at ["+(i+1)+"]["+(j+1)+"]:");
                    matrix1[i][j]=in.getInt();
                }
            }
            System.out.println("-------Matrix 2------");
            for(i=0;i<row2;i++){
                for(j=0;j<column2;j++){
                    System.out.println("Enter number at ["+(i+1)+"]["+(j+1)+"]:");
                    matrix2[i][j]=in.getInt();
                }
            }
            for(i=0;i<row1;i++){
                for(j=0;j<column2;j++){
                    for(k=0;k<column1;k++){
                        result[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            System.out.println("------Result-------");
            this.display(matrix1);
            System.out.println("*");
            this.display(matrix2);
            System.out.println("=");
            this.display(result);
        }
        else{
            System.out.println("The column of matrix 1 must have the same size as row of matrix 2");
            return;
        }
    }
    
    void display(int[][] matrix){
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.print("\n");
        }
    }
}
