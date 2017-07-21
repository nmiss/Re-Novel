package spittr.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by ccy on 2017/7/20.
 */
@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE,
                reason = "Picture Size Error")
public class SizeErrorException extends RuntimeException {

}
