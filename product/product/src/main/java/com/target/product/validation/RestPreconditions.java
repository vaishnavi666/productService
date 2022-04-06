package com.target.product.validation;

public class RestPreconditions {
    public static <T> T checkFound(final T resource) {
        if (resource == null) {
       //     throw new ResourceNotFoundException();
        }
        return resource;
    }
    
    public static <T> T checkNotNull(final T reference, final String message) {
        if (reference == null) {
       //     throw new ResourceNotFoundException(message);
        }
        return reference;
    }
    
    
}
