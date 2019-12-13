package org.brijframework.support.model.queries;

public @interface Query {
    String value() default "";
    Param[] param() default {};
}
