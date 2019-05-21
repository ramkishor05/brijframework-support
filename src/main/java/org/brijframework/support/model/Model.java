package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.enums.Scope;
import org.brijframework.util.support.Access;
import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value = Models.class)
public @interface Model {
	
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	Scope scope() default Scope.PROTOTYPE;
	
	String extend() default Constants.DEFAULT;
	
	Construct constructor() default @Construct;
	
	String[] methodKeys() default {};
	
	String[] propertyKeys() default {};
	
	boolean isUseDefaultFields() default true;
	
	boolean isUseDefaultMethods() default false;
	
	boolean isUseMappedKeys() default false;
	
	boolean isDefault() default false;
}
