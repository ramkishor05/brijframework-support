package org.brijframework.support.app;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.constants.SupportConstants;
import org.brijframework.support.properties.AssignForKey;

@Target({ ElementType.METHOD,ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnvironmentResource {
	
	@AssignForKey(SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_PATH_KEY)
	String location() default SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_PATH_VAL;
	
	String value() default SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_FILE_NAMES;
}
