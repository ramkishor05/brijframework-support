package org.brijframework.support.model.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

import org.brijframework.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.FIELD , ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ModelProperty {
	
	String id() default Constants.DEFAULT;
	
	String name() default Constants.DEFAULT;

	Access access() default Access.READ_WRITE;

	boolean required() default false;
	
	Class<?> type() default Type.class;
}
