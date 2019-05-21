package org.brijframework.support.monitor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestedTask {

	public long initial() default 1;

	public TimeUnit initialUnit() default TimeUnit.SECONDS;// loop unit
	
	public long interval() default 1; //loop time
}
