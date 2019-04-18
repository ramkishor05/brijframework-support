package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.enums.Formula;

@Target({ ElementType.FIELD , ElementType.METHOD,ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Strategy {

	Formula formula() default Formula.Sequence;
	
	double init() default 0.1; 
	
	double increment() default 0.1; 
	
	double decrement() default 0.1; 
}
