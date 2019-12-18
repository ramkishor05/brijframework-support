package org.brijframework.support.bean.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.model.mapper.ModelMapper;
import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BeanProperty {
	
	String name() default Constants.DEFAULT;

	String value() default Constants.DEFAULT;
	
	ModelMapper[] mappers() default {};
}
