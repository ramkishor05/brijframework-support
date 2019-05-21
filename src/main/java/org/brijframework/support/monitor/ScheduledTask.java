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
public @interface ScheduledTask {

	public TimeUnit unit() default TimeUnit.MINUTES;
	
	public long interval();
	
	public String format ();
	
	public String repeatOn ();

	public String startOn ();

	public String stopOn () default "";
}
