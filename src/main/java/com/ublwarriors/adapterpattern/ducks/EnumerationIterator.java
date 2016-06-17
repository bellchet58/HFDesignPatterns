package com.ublwarriors.adapterpattern.ducks;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E>{
	
	private Enumeration<E> enume;
	
	public EnumerationIterator(Enumeration<E> enume) {
		this.enume = enume;
	}
	
	@Override
	public boolean hasNext() {
		return enume.hasMoreElements();
	}

	@Override
	public E next() {
		return enume.nextElement();
	}

	@Override
	public void remove() {
		Iterator.super.remove();
	}

}
