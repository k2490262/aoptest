package com.bit.dao;

import java.util.ArrayList;

public class GoodsDao {
	public int insertGoods(String item, int price) {
		System.out.println("상품 등록 완료");
		return 1;
	}
	
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("포도");
		list.add("딸기");
		System.out.println(list.get(100));
		
		return list;
	}
}
