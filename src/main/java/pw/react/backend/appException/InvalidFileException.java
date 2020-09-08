package pw.react.backend.appException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** Created by Pawel Gawedzki on 06-Oct-2019. */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidFileException extends RuntimeException {
    public InvalidFileException(String message) {
        super(message);
    }

    public InvalidFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
