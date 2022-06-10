package observerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Listenable {
	
	List<Listener> listeners;
	
	public Listenable() {
		listeners = new ArrayList<>();
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public boolean removeListener(Listener listener) {
		if(listeners.contains(listener)) {
			listeners.remove(listener);
			return true;
		}
		return false;
	}
	
	public void notifyAllListeners(Object obj, Listenable listenable) {
		for(Listener listener: listeners) {
			listener.update(obj, listenable);
		}
	}
	
}
