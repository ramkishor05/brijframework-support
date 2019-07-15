package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.util.support.Constants;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mapping {

	String id() default Constants.DEFAULT;
	
	String source();
	
	String destination() default Constants.DEFAULT;
}
