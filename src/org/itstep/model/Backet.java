package org.itstep.model;

import java.util.HashMap;

import org.itstep.model.DataBase;

public class Backet {
	
	
	DataBase db = new DataBase();
	HashMap<String, Integer> goodsMap = new HashMap<>();
	
	public void addGoods(String goods, int quantity) {

		if (goodsMap.containsKey(goods)) {
			int a = goodsMap.get(goods);
			goodsMap.put(goods, a+quantity);
		} else {
			goodsMap.put(goods, quantity);
		}
	}
	
	public void getChek() {
		double sumVaucher = 0.0;
		for (String key : goodsMap.keySet()) {
			int discountedGoods, goodsWithoutDiscount;
			double sum; 
			
		    if(key == "pans") {
	
		    discountedGoods = goodsMap.get(key)/3;
		    goodsWithoutDiscount = goodsMap.get(key) - discountedGoods;
		    sum = (goodsWithoutDiscount*db.getPants())+(discountedGoods*(db.getPants()*0.5));
		    sumVaucher += sum;
		    System.out.println("amount to pay for " + key +" is "+ sum+ " doolars" );
		    
		    }else if(key == "shirt") { 
		    discountedGoods = goodsMap.get(key)/3;
		    goodsWithoutDiscount = goodsMap.get(key) - discountedGoods;
		    sum = (goodsWithoutDiscount*db.getShirt())+(discountedGoods*(db.getShirt()*0.5));
		    sumVaucher += sum;
		    System.out.println("amount to pay for " + key +" is "+ sum+ " doolars" );    	
		    }else if(key == "shoes") {
		    discountedGoods = goodsMap.get(key)/3;
			goodsWithoutDiscount = goodsMap.get(key) - discountedGoods;
			sum = (goodsWithoutDiscount*db.getShoes())+(discountedGoods*(db.getShoes()*0.5));
			sumVaucher += sum;
			System.out.println("amount to pay for " + key +" is "+ sum+ " doolars" );
		    	
		    }
		    
		}
		System.out.println("The amount of your vaucher is " + sumVaucher + " dollar");
	}
	
	
}
