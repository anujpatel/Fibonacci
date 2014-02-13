package com.anuj.algorithms;

/**
 * 
 * @author Anuj
 * @Desc http://goldenpackagebyanuj.blogspot.in/2013/08/java-program-find-fibonacci-series-number.html
 *
 */
public class Fibonaci {

 /**
  * @param args
  */
 public static void main(String[] args) {
  int num=10;
  
  long[] fiboSeries = new long[num];
  fiboSeries[0] = 0;
  fiboSeries[1] = 1;
  
  //0 1 1 2 3 5 8 13 21 34
  for(int i=2;i<num;i++){
   fiboSeries[i] = fiboSeries[i-1] + fiboSeries[i-2];
  }
  
  for (long entry : fiboSeries) {
   System.out.print(entry + " ");
  }
 }
}
