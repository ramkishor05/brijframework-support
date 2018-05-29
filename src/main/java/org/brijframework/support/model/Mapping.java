package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.state.Scope;
import org.brijframework.util.constants.Constants;
import org.brijframework.util.enums.Access;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mapping {

	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	Scope scope() default Scope.prototype;

	String[] mappedKeys() default {};

	boolean isRequired() default false;
	
	String mappedBy() default "";
	
	Class<?> target() default Object.class;
	
	Query query() default @Query;
}
