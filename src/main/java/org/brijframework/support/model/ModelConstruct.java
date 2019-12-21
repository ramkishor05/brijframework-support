package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE,ElementType.CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ModelConstruct {
   
	String id() default Constants.DEFAULT;
	
	String name() default Constants.DEFAULT;

	Access access() default Access.READ_WRITE;
	
	ModelParam[] params()  default {};
}
