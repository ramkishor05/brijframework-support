package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.state.State;
import org.brijframework.util.casting.NullClass;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relation {
	
	String value() default "";
	
	String mappedBy()  default "";
   
	Class<?> relative() default NullClass.class; 
	
	State referred() default State.AUTO;
	
}
