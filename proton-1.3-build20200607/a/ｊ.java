package a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
public @interface ｊ {
   long[] u() default {};

   long[] ⲋ() default {};

   Class 〥ҳⱆ() default void.class;

   Class ᴃᎲ() default void.class;

   String[] ĂƂ() default {};
}
