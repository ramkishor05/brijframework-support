package org.brijframework.support.model;

public @interface Query {
    String value() default "";
    Param[] param() default {};
}
