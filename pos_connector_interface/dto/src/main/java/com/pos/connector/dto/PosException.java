package com.pos.connector.dto;

import com.pos.common.exceptions.ErrorCode;
import com.pos.common.exceptions.ErrorDetails;
import com.pos.common.exceptions.ServiceException;

public class PosException extends ServiceException {

    public PosException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    public PosException(ErrorCode errorCode, ErrorDetails errorDetails, Throwable cause) {

        super(errorCode, cause);
    }


    public PosException(ErrorCode errorCode) {

        super(errorCode);
    }

}
