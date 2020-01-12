package com.pos.common.util.validation;

import java.util.function.Predicate;

public interface Validator {

    static <T> T notNull(T t, String field) {
        if (t == null) {
            String message = String.format("The argument %s cannot be null", field);
            throw new IllegalArgumentException(message);
        }
        return t;
    }

    static <T> T check(Predicate<T> p, T value, String field, String precondition) {
        if (p.test(notNull(value, field))) {
            return value;
        } else {
            String message = String.format("The value of %s is not satisfying precondition '%s'", field, precondition);
            throw new IllegalArgumentException(message);
        }
    }

    static <T> T checkIfSet(Predicate<T> p, T value, String field, String precondition) {
        if (value == null) {
            return null;
        } else {
            return check(p, value, field, precondition);
        }
    }
}