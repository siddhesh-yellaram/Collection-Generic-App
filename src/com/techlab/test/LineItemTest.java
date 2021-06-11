package com.techlab.test;

import java.util.*;

import com.techlab.model.LineItem;


public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> a1 = new ArrayList<LineItem>();
		LineItem item1 = new LineItem(1,"q1",20,3);
		LineItem item2 = new LineItem(2,"q2",40,2);
		LineItem item3 = new LineItem(3,"q3",60,10);
		a1.add(item1);
		a1.add(item2);
		a1.add(item3);
		printCart(a1);
	}
	
	public static void printCart(ArrayList<LineItem> cart) {
		double totalCost = 0;
		for(LineItem item: cart) {
//			LineItem lineItem=(LineItem) item;
		    totalCost=totalCost+item.CalculateItemCost();
			System.out.println(item);
		}
		System.out.println("Total Cart Value: "+totalCost);
	}
}
