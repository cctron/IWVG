package designPatterns.exercises.n3_manager.v1.dispatchers;

import designPatterns.exercises.n3_manager.v1.manager.Server;
import designPatterns.exercises.n3_manager.v1.manager.Store;

public abstract class Dispatcher {

	protected Store store;
	
	protected Server server;
	
	public Dispatcher(Store store, Server server) {
		this.store = store;
		this.server = server;
	}
	
	public abstract void dispatch();
	
	public abstract Dispatcher clone();
}
