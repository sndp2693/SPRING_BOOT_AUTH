package com.sample.auth.annotations;


import com.sample.auth.enums.UserRole;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Authorization {
    boolean enabled() default true;
    UserRole requiredRole() default UserRole.GUEST;

}
