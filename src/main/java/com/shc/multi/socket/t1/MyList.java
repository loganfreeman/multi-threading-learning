package com.shc.multi.socket.t1;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List<Object> list = new ArrayList<Object>();

	public void add() {
		list.add("陈泽昊!");
	}

	public int size() { 
		return list.size();
	}

}
