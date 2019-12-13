package org.brijframework.support.app;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.constants.SupportConstants;
import org.brijframework.support.properties.AssignForKey;

@Target({ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApplicationRunner {

	@AssignForKey(SupportConstants.APPLICATION_RESOURCE_PACKAGES_PATH_KEY)
	String[] packages() default {};
	
	@AssignForKey(SupportConstants.APPLICATION_RESOURCE_FILES_PATH_KEY)
	String[] resources() default {};
	
}
