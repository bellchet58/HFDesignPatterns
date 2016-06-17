package com.ublwarriors.adapterpattern.ducks;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object>{

	private Iterator<?> iterator;
	
	public IteratorEnumeration(Iterator<?> iterator2) {
		this.iterator = iterator2;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
