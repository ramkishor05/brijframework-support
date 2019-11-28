package org.brijframework.support.beans;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.enums.Scope;
import org.brijframework.support.mapper.Mapper;
import org.brijframework.support.model.Construct;
import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value = Beans.class)
public @interface Bean {

	String id() default Constants.DEFAULT;

	Scope scope() default Scope.SINGLETON;
	
	String model() default Constants.DEFAULT;
	
	String type() default Constants.DEFAULT;

	String name() default Constants.DEFAULT;
	
	Attribute[] properties() default {};
	
	Construct constructor() default @Construct;
	
	Mapper[] mappers() default {};

	String factoryMethod() default Constants.DEFAULT;

	String factoryClass() default Constants.DEFAULT;
}
