package org.brijframework.support.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.brijframework.container.Container;
import org.brijframework.context.Context;
import org.brijframework.factories.Factory;
import org.brijframework.support.model.DepandOn;

public class SupportUtil {
   
	public static Collection<Class<? extends Context>> getDepandOnSortedClassList(Collection<Class<? extends Context>> classList) {
		ArrayList<Class<? extends Context>> list=new ArrayList<Class<? extends Context>>();
		classList.forEach(context->{
			if(!list.contains(context))
			fillDepandOn(list,context);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static void fillDepandOn(Collection<Class<? extends Context>> list, Class<? extends Context> context) {
		if (context.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = context.getAnnotation(DepandOn.class);
			fillDepandOn(list,(Class<? extends Context> ) depandOn.depand());
		}
		if(!list.contains(context))
		list.add(context);
	}
	

	public static Collection<Class<? extends Container>> getDepandOnSortedClassList(Set<Class<? extends Container>> classList) {
		ArrayList<Class<? extends Container>> list=new ArrayList<Class<? extends Container>>();
		classList.forEach(context->{
			if(!list.contains(context))
			fillDepandOn(list,context);
		});
		return classList;
	}
	
	@SuppressWarnings("unchecked")
	private static void fillDepandOn(ArrayList<Class<? extends Container>> list, Class<? extends Container> context) {
		if (context.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = context.getAnnotation(DepandOn.class);
			fillDepandOn(list,(Class<? extends Container> ) depandOn.depand());
		}
		if(!list.contains(context))
		list.add(context);
		
	}

	public static Collection<Class<? extends Factory>> getDepandOnSortedClassFactoryList(Collection<Class<? extends Factory>> classList) {
		ArrayList<Class<? extends Factory>> list=new ArrayList<Class<? extends Factory>>();
		classList.forEach(context->{
			if(!list.contains(context))
			fillDepandOnFactory(list,context);
		});
		return classList;
	}
	
	@SuppressWarnings("unchecked")
	private static void fillDepandOnFactory(Collection<Class<? extends Factory>> list, Class<? extends Factory> factory) {
		if (factory.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = factory.getAnnotation(DepandOn.class);
			fillDepandOnFactory(list,(Class<? extends Factory> ) depandOn.depand());
		}
		if(!list.contains(factory))
		list.add(factory);
		
	}
}
