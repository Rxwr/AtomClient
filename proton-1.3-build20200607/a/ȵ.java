package a;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Retention(RetentionPolicy.RUNTIME)
@Metadata(
   mv = {1, 1, 16},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\tB\u0014\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0086\u0004R\u0017\u0010\u0005\u001a\u00020\u00048\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0086\u0004"},
   d2 = {"La/ȵ;", "", "ⲋ", "()I", "La/Ѿ;", "ĂƂ", "()La/Ѿ;", "p0", "p1", ""}
)
public @interface ȵ {
   @JvmName(
      name = "ĂƂ"
   )
   Ѿ ĂƂ() default Ѿ.NONE;

   @JvmName(
      name = "ⲋ"
   )
   int ⲋ() default 0;
}
