package org.brijframework.support.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.constants.Constants;
import org.brijframework.support.enums.Access;
import org.brijframework.support.enums.Scope;

@Target({ ElementType.FIELD , ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Property {
	
	String id() default Constants.DEFAULT;

	Access access() default Access.PUBLIC;

	Scope scope() default Scope.prototype;
	
	String value()  default "";
	
	/*State referred() default State.AUTO;*/
	
  /*  String referedBy()  default "";
	*/
	/*Class<?> target()  default Class.class;*/
	
	String[] mappedKeys() default {};
	
	boolean isRequired() default false;
}
