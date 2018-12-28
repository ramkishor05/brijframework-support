package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.constants.Constants;
import org.brijframework.support.enums.Access;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.enums.State;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relation {
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	Scope scope() default Scope.prototype;
	
	String value()  default "";
	
	String[] mappedKeys() default {};
	
	boolean isRequired() default false;
	
	Class<?> mappedTo() default Object.class; 
	
	String mappedBy()  default "";
	
	State referred() default State.ID;

	boolean required() default false;
	
}
