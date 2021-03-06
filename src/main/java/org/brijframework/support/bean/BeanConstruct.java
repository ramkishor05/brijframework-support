package org.brijframework.support.bean;

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
public @interface BeanConstruct {
   
	String id() default Constants.DEFAULT;

	Access access() default Access.READ_WRITE;
	
	BeanParam[] params()  default {};
}