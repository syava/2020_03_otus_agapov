package ru.otus.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR
        ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.FIELD
        ElementType.LOCAL_VARIABLE})
@Inherited
public @interface Unfinished {
    enum Priority {LOW, MEDIUM, HIGH}

    String value();

    String[] changeBy() default "author";

    String[] lastChangedBy() default "";

    Priority priority() default Priority.MEDIUM;

    String createdBy() default "Tully Trautwien";

    String lastChanged() default "2000-01-01";
}
