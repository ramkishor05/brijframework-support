package org.brijframework.support.util;

import java.util.LinkedHashSet;

import org.brijframework.container.Container;
import org.brijframework.context.Context;
import org.brijframework.factories.Factory;
import org.brijframework.support.config.DepandOn;

public class SupportUtil {
   
	public static LinkedHashSet<Class<? extends Context>> getDepandOnSortedClassList(LinkedHashSet<Class<? extends Context>> classList) {
		
		LinkedHashSet<Class<? extends Context>> list=new LinkedHashSet<Class<? extends Context>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return  1;
			}
			return 0;
		}).forEach(context->{
			fillDepandOn(list,context);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static void fillDepandOn(LinkedHashSet<Class<? extends Context>> list, Class<? extends Context> context) {
		if(context==null) {
			return;
		}
		if (context.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = context.getAnnotation(DepandOn.class);
			fillDepandOn(list,(Class<? extends Context> ) depandOn.depand());
		}
		if(!list.contains(context)) {
			list.add(context);
		}
	}
	

	public static LinkedHashSet<Class<? extends Container>> getDepandOnSortedContainerClassList(LinkedHashSet<Class<? extends Container>> classList) {
		LinkedHashSet<Class<? extends Container>> list=new LinkedHashSet<Class<? extends Container>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return 1;
			}
			return 0;
		}).forEach(container->{
			fillDepandOnContainer(list,container);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	private static void fillDepandOnContainer(LinkedHashSet<Class<? extends Container>> list, Class<? extends Container> container) {
		if(container==null) {
			return;
		}
		if (container.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = container.getAnnotation(DepandOn.class);
			fillDepandOnContainer(list,(Class<? extends Container> ) depandOn.depand());
		}
		if(!list.contains(container)) {
		  list.add(container);
		}
	}

	public static LinkedHashSet<Class<? extends Factory>> getDepandOnSortedClassFactoryList(LinkedHashSet<Class<? extends Factory>> classList) {
		LinkedHashSet<Class<? extends Factory>> list=new LinkedHashSet<Class<? extends Factory>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return  1;
			}
			return 0;
		}).forEach(factory->{
			fillDepandOnFactory(list,factory);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	private static void fillDepandOnFactory(LinkedHashSet<Class<? extends Factory>> list, Class<? extends Factory> factory) {
		if(factory==null) {
			return;
		}
		if (factory.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = factory.getAnnotation(DepandOn.class);
			fillDepandOnFactory(list,( Class<? extends Factory> ) depandOn.depand());
		}
		if(!list.contains(factory)) {
			list.add(factory);
		}
	}

}
