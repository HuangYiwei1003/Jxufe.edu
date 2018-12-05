package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Shell {
	/**
	  * @Title:  Shell.java   
	  * @Package edu.hyw.Sort   
	  * @Description:    希尔排序 
	  * @author: hyw 
	  * @date:   2018年12月2日 下午11:04:12   
	  * @version V1.0       */
	
	public static void sort(Comparable[] a) {
		//排序算法
		int N = a.length;
		int h = 1;
		while ( h < N/3) h = 3*h + 1;
		while ( h >= 1) {
			//StdOut.println("h = " + h);
			for (int i = h; i < N; i++) {
				for (int j = i; j >=h &&less(a[j], a[j-h]); j -=h) {
					//StdOut.println("i, j=" + i + "," + j);
					exch(a, j, j-h);
					//Change(a);
				}
			}
			h = h/3;
		}
	}
	
	public static boolean less(Comparable v,  Comparable w) {
		//是否v < w
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		//交换a[i] a[j]
		//StdOut.println("Exchange: " + (j+1) + "  " + (i+1));
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		//动态图像显示
		//for (int i = 0; i < a.length; i++) StdOut.print(a[i] + " ");
		//StdOut.println();
		for (int i = 0; i < a.length; i++){
			double x = 1.0 * i / a.length;
			double y = (double)a[i] / 2.0;
			double rw = 0.5 /  a.length;
			double rh = (double)a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
            //x 代表线在那个位置  y代表这个线的高度
            // rw rh 理解成平面坐标参数
		}
	}
	
	public static void Allshow (Comparable[] a) {
		for (int i = 0; i < a.length; i++) 
			StdOut.print(a[i] + " ");
		StdOut.println();
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
}
