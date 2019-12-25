package com.cc.alg;

public class CircleMatrix {


    public void reverseOutput(int a[]){
        int size = (int)Math.ceil(Math.sqrt(a.length));


        int direction;//1向右，2向左，3向下，4向上

        int [][] newa = new int[size][size];
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                newa[i][j] = -1;
            }
        }

        direction = 1;
        int line = 0;
        int row = 0;
        newa[line][row] = a[0];
        for(int i = 1 ; i < a.length ; i++){
            int nextDirection = calNexDirection(newa,direction,line,row,size);
            if(nextDirection == 1){
                row++;
            }
            if(nextDirection == 2){
                row--;
            }

            if(nextDirection == 3){
                line++;
            }
            if(nextDirection == 4){
                line--;
            }
            newa[line][row] = a[i];
            direction = nextDirection;
        }
        System.out.println(newa);
        for(int i = 0 ; i<size ; i++){
            for(int j = 0 ; j < size; j++){
                System.out.print(newa[i][j]+" ");
            }
            System.out.println();
        }

    }


    public int calNexDirection(int[][] newa, int direction, int i, int j, int size){

        int nextDirection = 1;
        if(direction == 1){//向右之后只能继续向右或向下
            if(j<(size-1)&&newa[i][j+1] == -1)
                nextDirection = 1;
            else{
                nextDirection = 3;
            }
        }

        if(direction == 2){//向左之后只能继续向左或向上
            if(j>0 && newa[i][j-1] == -1){
                nextDirection = 2;
            }else{
                nextDirection = 4;
            }
        }

        if(direction == 3){//向下之后只能继续向下或向左
            if(i<(size-1)&&newa[i+1][j] == -1){
                nextDirection = 3;
            }else {
                nextDirection = 2;
            }
        }

        if(direction == 4){//向上之后只能继续向上或向右
            if(i>0&& newa[i-1][j] == -1){
                nextDirection = 4;
            }else{
                nextDirection = 1;
            }
        }
        return nextDirection;
    }


    public static void main(String[] args) {
        CircleMatrix circleMatrix = new CircleMatrix();
        int[] a= {0,1,2,3,4,5,6,7,8,9,10,11,12};
        circleMatrix.reverseOutput(a);
    }
}
