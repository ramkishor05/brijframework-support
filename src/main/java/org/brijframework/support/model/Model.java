package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.util.support.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value = Models.class)
public @interface Model {
	
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	String extend() default Constants.DEFAULT;
	
	Construct constructor() default @Construct;
	
	Property[] properties() default {};
	
	Relation[] relations() default {};
}
