package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.constants.Constants;
import org.brijframework.support.enums.Access;
import org.brijframework.support.enums.Scope;

@Target({ ElementType.TYPE,ElementType.CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Construct {
   
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	Scope scope() default Scope.PROTOTYPE;
	
	String extend() default Constants.NULL;
	
	Param[] params()  default {};
}
