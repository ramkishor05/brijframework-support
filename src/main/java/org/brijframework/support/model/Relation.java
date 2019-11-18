package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

import org.brijframework.support.enums.MappedBy;
import org.brijframework.util.support.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relation {
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	MappedBy wired() default MappedBy.AUTO;
	
	String mappedBy()  default "";

	boolean required() default false;
	
	//Query query() default @Query;
	
	Class<?> type() default Type.class;
	
}
