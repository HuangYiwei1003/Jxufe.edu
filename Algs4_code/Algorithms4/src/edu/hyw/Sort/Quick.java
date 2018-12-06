package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Quick {
	/**
	  * @Title:  Quick.java   
	  * @Package edu.hyw.Sort   
	  * @Description:    快速排序
	  * @author: hyw 
	  * @date:   2018年12月2日 下午11:04:12   
	  * @version V1.0       */
	
	public static void sort (Comparable[] a) {
		//排序算法
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi) {
		//实际算法
		if(hi <= lo) return;
		int j = partition(a, lo, hi);      //切分算法
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	private static int partition(Comparable[] a, int lo, int hi) {
		//切分算法
		int i = lo, j = hi+1;
		Comparable v = a[lo];
		while (true) {
			//扫描左右， 检查扫描是否结束并且交换元素
			while (less(a[++i], v)) if (i == hi ) break;     //筛选在lo,hi中最先大于a[lo]的元素
			while (less(v, a[--j]))  if (j == lo ) break;     //筛选在lo,hi中最先小于a[lo]的元素
			if (i >= j) break;                                             //如果最先大于的元素位置大于最先小于的元素位置则两者不交换
			exch(a, i, j);
			//Change(a);
		}
		exch(a, lo, j);                    //将v = a[j]放入正确的位置
		//Change(a);
		return j;
		}
	
	public static boolean less(Comparable v,  Comparable w) {
		//是否v < w
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		//交换a[i] a[j]
		StdOut.println("Exchange: " + i + " " +  j);
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		//动态图像显示
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
