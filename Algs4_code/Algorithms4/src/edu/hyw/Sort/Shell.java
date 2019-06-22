package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Shell {
	/**
	  * @Title:  Shell.java   
	  * @Package edu.hyw.Sort   
	  * @Description:    ϣ������ 
	  * @author: hyw 
	  * @date:   2018��12��2�� ����11:04:12   
	  * @version V1.0       */
	
	public static void sort(Comparable[] a) {
		//�����㷨
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
		//�Ƿ�v < w
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		//����a[i] a[j]
		//StdOut.println("Exchange: " + (j+1) + "  " + (i+1));
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		//��̬ͼ����ʾ
		//for (int i = 0; i < a.length; i++) StdOut.print(a[i] + " ");
		//StdOut.println();
		for (int i = 0; i < a.length; i++){
			double x = 1.0 * i / a.length;
			double y = (double)a[i] / 2.0;
			double rw = 0.5 /  a.length;
			double rh = (double)a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
            //x ���������Ǹ�λ��  y��������ߵĸ߶�
            // rw rh ����ƽ���������
		}
	}
	
	public static void Allshow (Comparable[] a) {
		for (int i = 0; i < a.length; i++) 
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
	
	public static void Change (Comparable[] a){
		//��̬ͼ��
		show(a); 
		StdDraw.show(); 
		//StdDraw.pause(1000);
		StdDraw.enableDoubleBuffering();  
		StdDraw.clear();
	}
	
	public static boolean isSorted(Comparable[] a) {
		//��������Ԫ���Ƿ�����
		for (int i = 0; i < a.length ; i++)
			if(less(a[i], a[i-1])) return false;
		return true;
	}
}
