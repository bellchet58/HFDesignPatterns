package com.ublwarriors.observerpattern;

import com.ublwarriors.observerpattern.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
