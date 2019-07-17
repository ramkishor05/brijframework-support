package org.brijframework.support.mapper;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD , ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value = Mappers.class)
public @interface Mapper {

	String id() default Constants.DEFAULT;

	String source();

	String target() default Constants.DEFAULT;
}
