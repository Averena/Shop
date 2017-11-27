package org.itstep.model;

import org.itstep.model.Backet;

public class AppRunner {

	public static void main(String[] args) {

		Backet client = new Backet();
		client.addGoods("pans", 2);
		client.addGoods("shoes", 7);
		client.addGoods("shirt", 8);
		client.getChek();
		

	}

}
