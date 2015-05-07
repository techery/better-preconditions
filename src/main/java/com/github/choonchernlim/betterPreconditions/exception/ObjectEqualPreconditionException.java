package com.github.choonchernlim.betterPreconditions.exception;

import com.github.choonchernlim.betterPreconditions.core.PreconditionException;

/**
 * This exception is thrown if the first value is equal to second value.
 */
public class ObjectEqualPreconditionException extends PreconditionException {

    /**
     * Constructs a new exception with an error message.
     *
     * @param firstValue  First value
     * @param firstLabel  First label
     * @param secondValue Second value
     * @param secondLabel Second label
     */
    public ObjectEqualPreconditionException(final Object firstValue,
                                            final String firstLabel,
                                            final Object secondValue,
                                            final String secondLabel) {
        super(String.format("%s [ %s ] must not be equal to %s [ %s ]",
                            firstLabel,
                            firstValue,
                            secondLabel,
                            secondValue));
    }
}
