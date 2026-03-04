package br.fiap.com.ms.produto.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    //RuntimeException não precisa de try-catch

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
