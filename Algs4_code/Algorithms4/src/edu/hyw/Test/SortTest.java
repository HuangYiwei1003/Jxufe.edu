package edu.hyw.Test;

import java.util.Random;

import edu.hyw.Sort.Insertion;
import edu.hyw.Sort.Selection;
import edu.hyw.Sort.Shell;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class SortTest {
	/**
	  * @Title:  SortTest.java   
	  * @Package edu.hyw.Test   
	  * @Description:    测试排序   
	  * @author: hyw 
	  * @date:   2018年12月2日 下午11:22:02   
	  * @version V1.0       */
	
	public static void main(String[] args) {
			int   N   = Integer.parseInt(args[0]);
			//int alg1 = Integer.parseInt(args[1]);
			//int alg2 = Integer.parseInt(args[2]);
			//Random r = new Random(alg1);
			Comparable[] a= new Comparable[N],b= new Comparable[N],c = new Comparable[N];
			for (int i = 0; i < N; i++) {
				a[i] =StdRandom.random();
				b[i]=StdRandom.random();
				c[i]=StdRandom.random();
			}

			//Insertion.Allshow(a);
			Selection.sort(c);
			StdDraw.clear(); 
			Shell.sort(b);
			StdDraw.clear(); 
			Insertion.sort(a); 
			StdDraw.clear(); 
	}
	
	
}
