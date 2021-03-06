package org.brijframework.support.bean.conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.support.enums.ConditionalPolicy;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConditionalOnBean {
  
	String value();
  
    ConditionalPolicy policy() default ConditionalPolicy.PRELOAD_IF_EXIST;
    
}


