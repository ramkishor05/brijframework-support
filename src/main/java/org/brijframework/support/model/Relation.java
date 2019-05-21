package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.enums.Scope;
import org.brijframework.support.enums.Wiring;
import org.brijframework.util.support.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relation {
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	Scope scope() default Scope.PROTOTYPE;
	
	Wiring wired() default Wiring.AUTO;
	
	String value()  default "";
	
	Class<?> mappedTo() default Object.class; 
	
	String mappedBy()  default "";

	boolean required() default false;
	
	Query query() default @Query;
	
}
