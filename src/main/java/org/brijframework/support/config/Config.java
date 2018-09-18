package org.brijframework.support.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface Config {
   
	String[] packages() default {};
	
	String appPath() default "META-INF/application.xml";
	
	public String metaPath() default "META-INF/application.xml";
	
	public String filePath() default "";
}
