package org.brijframework.support.config.application;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.config.AssignForKey;
import org.brijframework.support.config.SupportConstants;

@Target({ ElementType.METHOD,ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnvironmentResource {
	
	@AssignForKey(SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_PATH_KEY)
	String location() default SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_PATH_VAL;
	
	String value() default SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_FILE_NAMES;
}
