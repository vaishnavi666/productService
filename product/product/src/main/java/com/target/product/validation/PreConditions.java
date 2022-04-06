package com.target.product.validation;

public class PreConditions {

	
    public static <T> T checkNotNull(final T reference, final String message) {
        if (reference == null) {
            //throw new ResourceNotFoundException(message);
        }
        return reference;
    }
	
}
