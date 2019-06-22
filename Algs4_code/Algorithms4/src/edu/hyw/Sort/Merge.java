package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Merge {

	/**
		  * @Title:  Merge.java  
		  * @Package edu.hyw.Sort
		  * @Description:    TODO 归并排序
		  * @author: hyw 
		  * @date:   2018年12月5日 下午5:11:35   
		  * @version V1.0       */
	
	private static Comparable[] aux;
	
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		//原地归并操作
		int i = lo , j = mid + 1;
		for (int k = lo; k <= hi; k++)    //将a[lo..hi]复制到aux[0..(hi-lo)]
			aux[k] = a[k]; 
		
		for (int k = lo; k <= hi; k++)     //归并至a[lo..hi]
			if			(i > mid )							a[k] = aux[j++];
			else if	(j > hi    )							a[k] = aux[i++];
			else if (less(aux[j], aux[i]))		a[k] = aux[j++];
			else												a[k] = aux[i++];
	}
	
	public static boolean less(Comparable v,  Comparable w) {
		//是否v < w
		return v.compareTo(w) < 0;
	}
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		//排序a[lo..hi]
		if(hi <= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid);					//排序左半边
		sort(a, mid+1, hi);				//排序右半边
		merge(a, lo, mid, hi);			//归并
		//Change(a);
		}
	
	public static void Allshow (Comparable[] a) {
		StdOut.print("a: ");
		for (int i = 0; i < a.length; i++) 
			StdOut.print(a[i] + " ");
		StdOut.println();
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
	
	public static void Change (Comparable[] a){
		//动态图像
		show(a); 
		StdDraw.show(); 
		//StdDraw.pause(1000);
		StdDraw.enableDoubleBuffering();  
		StdDraw.clear();
	}
}
