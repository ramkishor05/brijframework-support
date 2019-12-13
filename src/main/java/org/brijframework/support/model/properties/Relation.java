package org.brijframework.support.model.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.util.support.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relation {
	
	String id() default Constants.DEFAULT;

	String name() default Constants.DEFAULT;
	
	Access access() default Access.PUBLIC;
	
	String value()  default Constants.DEFAULT;

	String mappedBy()  default Constants.DEFAULT;

	boolean required() default false;
	
	//Query query() default @Query;
	
}
