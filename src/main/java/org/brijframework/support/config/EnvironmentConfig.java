package org.brijframework.support.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface EnvironmentConfig {
	public String paths() default SupportConstants.APPLICATION_BOOTSTRAP_CONFIG_FILES;
}
