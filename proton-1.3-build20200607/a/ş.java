package a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface ş {
   boolean ĂƂ() default false;

   String u() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

   String ⲋ() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

   boolean ᴃᎲ() default false;
}
