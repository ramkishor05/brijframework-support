package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.enums.State;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relation {
	
	String value() default "";
	
	String mappedBy()  default "";
   
	Class<?> relative() default Object.class; 
	
	State referred() default State.ID;
	
}
