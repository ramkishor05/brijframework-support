package org.brijframework.support.util;

import java.util.LinkedHashSet;

import org.brijframework.container.BootstrapContainer;
import org.brijframework.container.ModuleContainer;
import org.brijframework.context.BootstrapContext;
import org.brijframework.context.ModuleContext;
import org.brijframework.factories.Factory;
import org.brijframework.support.config.DepandOn;

public class SupportUtil {
   
	/*
	 * BootstrapContext
	 * 
	 */
	public static LinkedHashSet<Class<? extends BootstrapContext>> getDepandOnSortedBootstrapContextList(LinkedHashSet<Class<? extends BootstrapContext>> classList) {
		LinkedHashSet<Class<? extends BootstrapContext>> list=new LinkedHashSet<Class<? extends BootstrapContext>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return  1;
			}
			return 0;
		}).forEach(context->{
			fillDepandOnBootstrapContext(list,context);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static void fillDepandOnBootstrapContext(LinkedHashSet<Class<? extends BootstrapContext>> list, Class<? extends BootstrapContext> context) {
		if(context==null) {
			return;
		}
		if (context.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = context.getAnnotation(DepandOn.class);
			fillDepandOnBootstrapContext(list,(Class<? extends BootstrapContext> ) depandOn.depand());
		}
		if(!list.contains(context)) {
			list.add(context);
		}
	}
	

	/*
	 * BootstrapContainer
	 */
	public static LinkedHashSet<Class<? extends BootstrapContainer>> getDepandOnSortedBootstrapContainerList(LinkedHashSet<Class<? extends BootstrapContainer>> classList) {
		LinkedHashSet<Class<? extends BootstrapContainer>> list=new LinkedHashSet<Class<? extends BootstrapContainer>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return 1;
			}
			return 0;
		}).forEach(container->{
			fillDepandOnBootstrapContainer(list,container);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	private static void fillDepandOnBootstrapContainer(LinkedHashSet<Class<? extends BootstrapContainer>> list, Class<? extends BootstrapContainer> container) {
		if(container==null) {
			return;
		}
		if (container.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = container.getAnnotation(DepandOn.class);
			fillDepandOnBootstrapContainer(list,(Class<? extends BootstrapContainer> ) depandOn.depand());
		}
		if(!list.contains(container)) {
		  list.add(container);
		}
	}
	
	/*
	 * ModuleContext
	 */
	public static LinkedHashSet<Class<? extends ModuleContext>> getDepandOnSortedModuleContextList(LinkedHashSet<Class<? extends ModuleContext>> classList) {
		LinkedHashSet<Class<? extends ModuleContext>> list=new LinkedHashSet<Class<? extends ModuleContext>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return  1;
			}
			return 0;
		}).forEach(context->{
			fillDepandOnModuleContext(list,context);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static void fillDepandOnModuleContext(LinkedHashSet<Class<? extends ModuleContext>> list, Class<? extends ModuleContext> context) {
		if(context==null) {
			return;
		}
		if (context.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = context.getAnnotation(DepandOn.class);
			fillDepandOnModuleContext(list,(Class<? extends ModuleContext> ) depandOn.depand());
		}
		if(!list.contains(context)) {
			list.add(context);
		}
	}

	/*
	 * ModuleContainer
	 */
	public static LinkedHashSet<Class<? extends ModuleContainer>> getDepandOnSortedModuleContainerList(LinkedHashSet<Class<? extends ModuleContainer>> classList) {
		LinkedHashSet<Class<? extends ModuleContainer>> list=new LinkedHashSet<Class<? extends ModuleContainer>>();
		classList.stream().sorted((c1,c2)->{
			if(c1.isAnnotationPresent(DepandOn.class)) {
				return -1;
			}
			if(c2.isAnnotationPresent(DepandOn.class)) {
				return 1;
			}
			return 0;
		}).forEach(container->{
			fillDepandOnModuleContainer(list,container);
		});
		return list;
	}
	
	@SuppressWarnings("unchecked")
	private static void fillDepandOnModuleContainer(LinkedHashSet<Class<? extends ModuleContainer>> list, Class<? extends ModuleContainer> container) {
		if(container==null) {
			return;
		}
		if (container.isAnnotationPresent(DepandOn.class)) {
			DepandOn depandOn = container.getAnnotation(DepandOn.class);
			fillDepandOnModuleContainer(list,(Class<? extends ModuleContainer> ) depandOn.depand());
		}
		if(!list.contains(container)) {
		  list.add(container);
		}
	}

	public static LinkedHashSet<Class<? extends Factory>> getDepandOnSortedFactoryList(LinkedHashSet<Class<? extends Factory>> classList) {
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
