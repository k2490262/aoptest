package com.bit.dao;

import java.util.ArrayList;

public class MemberDao {
	
	// private ProfilingAdvice advice = new ProfilingAdvice();
	
	public int insertMember(String name, int age) {
		System.out.println("회원등록 완료");
		
		return 1;
	}
	
	public void updateMember() {
		System.out.println("회원 수정완료");
	}
	
	public ArrayList<String> listMember(){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("이순신");
		list.add("유관순");
		list.add("김유신");
		
		return list;
	}

}
