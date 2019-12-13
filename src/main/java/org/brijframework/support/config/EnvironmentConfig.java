package org.brijframework.support.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.constants.SupportConstants;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface EnvironmentConfig {
	
	public String paths() default SupportConstants.APPLICATION_ENVIRONMENT_RESOURCE_FILE_NAMES;
}
