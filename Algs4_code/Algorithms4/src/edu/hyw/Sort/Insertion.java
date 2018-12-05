package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Insertion {
	/**
	  * @Title:  Shell.java   
	  * @Package edu.hyw.Sort   
	  * @Description:    插入排序 
	  * @author: hyw 
	  * @date:   2018年12月2日 下午11:04:12   
	  * @version V1.0       */
	
	public static void sort(Comparable[] a) {
		//排序算法
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for(int j = i; j > 0 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
				//Change(a);
			}
		}
	}
	
	public static boolean less(Comparable v,  Comparable w) {
		//是否v < w
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		//交换a[i] a[j]
		//StdOut.println("Exchange: " + a[i] + a[j]);
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		//在单行中打印数组
		for (int i = 0; i < a.length; i++) {
			double x = 1.0 * i / a.length;
			double y = (double)a[i] / 2.0;
			double rw = 0.5 /  a.length;
			double rh = (double)a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
	
	public static void Change (Comparable[] a){
		//动态图像
		show(a); 
		StdDraw.show(); 
		//StdDraw.pause(1000);
		StdDraw.enableDoubleBuffering();  
		StdDraw.clear();
	}
	
	public static boolean isSorted(Comparable[] a) {
		//测试数组元素是否有序
		for (int i = 0; i < a.length ; i++)
			if(less(a[i], a[i-1])) return false;
		return true;
	}
	
	public static void Allshow (Comparable[] a) {
		//单行打印数组
		for (int i = 0; i < a.length; i++) 
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
}
