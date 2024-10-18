package com.tecsup.petclinic.exception;
import java.io.Serial;

/**
 *
 * @author Deivid Laura
 *
 */

public class OwnerNotFoundException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public OwnerNotFoundException(String message) {
        super(message);
    }

}
