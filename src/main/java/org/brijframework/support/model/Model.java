package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.Access;
import org.brijframework.support.model.properties.ModelProperty;
import org.brijframework.support.model.properties.ModelRelation;
import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value = Models.class)
public @interface Model {
	
	String id() default Constants.DEFAULT;

	Access access() default Access.READ_WRITE;
	
	String name() default Constants.DEFAULT;

	String extend() default Constants.DEFAULT;
	
	ModelConstruct constructor() default @ModelConstruct;
	
	ModelProperty[] properties() default {};
	
	ModelRelation[] relations() default {};
}
