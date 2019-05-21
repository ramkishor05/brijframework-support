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
public @interface TimerTask {

	public long period() default 1; //loop time

	public TimeUnit periodUnit() default TimeUnit.MINUTES;// loop unit
	
	public String timeFormat () default "h:mm";
	
	public String startTime () default  "";// = "3:00 am",  "3:00AM", "3:00 PM", "3:00pm"

	public String stopTime () default  ""; // = "3:00 am",  "3:00AM", "3:00 PM", "3:00pm"
}
