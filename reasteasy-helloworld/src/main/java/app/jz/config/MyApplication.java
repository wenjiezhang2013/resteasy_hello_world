package app.jz.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import app.jz.rest.UserServiceImpl;

public class MyApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public MyApplication() {
		singletons.add(new UserServiceImpl());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
