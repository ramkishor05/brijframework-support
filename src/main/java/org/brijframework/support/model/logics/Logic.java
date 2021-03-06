package org.brijframework.support.model.logics;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.Access;
import org.brijframework.support.enums.Scope;
import org.brijframework.support.model.queries.Param;
import org.brijframework.util.support.Constants;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Logic {

	String id() default Constants.DEFAULT;

	Access access() default Access.AUTO;

	Scope scope() default Scope.PROTOTYPE;
	
	Param[] params()  default {};
	
	String[] mappedKeys() default {};
}
