package com.cg.dao;

import java.util.*;

import java.util.HashMap;
import com.cg.bean.*;
public class Dao 
{
     Bean c;
	
	HashMap<Long,Bean> hm = new HashMap<Long,Bean>();
	
	public void create(Bean c) {	
		this.c = c;
		hm.put(c.getAccountNo(),c);
	//System.out.println(hm);
	}
	public HashMap<Long,Bean> getHash() {
		return hm;
	} 
}
