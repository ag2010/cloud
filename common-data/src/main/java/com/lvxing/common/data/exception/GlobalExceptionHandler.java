package com.lvxing.common.data.exception;


import com.lvxing.common.data.base.Result;
import com.lvxing.common.data.enums.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;

/**
 * 异常统一处理
 * @author lvxing
 * @since 2019/5/19
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result handleBasicException(BaseException baseException){
        log.error("抛异常code:{}，msg:{}", baseException.getCode(), baseException.getMessage());
        return Result.error(baseException.getCode(), "");
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result handleValidException(MethodArgumentNotValidException e){
        log.error("参数校验异常，msg:{}",  e.getMessage(), e);
        return Result.error(ResultEnum.CRUD_VALID_NOT);
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result handleAccessDeniedException(AccessDeniedException e) {
        log.error("拒绝授权异常信息 ex={}",e.getMessage(), e);
        return Result.error(ResultEnum.CRUD_NOT_OPERATE);
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result handleException(Exception e) {
        log.error("Exception全局异常信息 ex={}", e.getMessage(), e);
        return Result.error(e.getLocalizedMessage());
    }


    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result handleHttpRequestMethodNotSupportedException(Exception e) {
        log.error("HttpRequestMethodNotSupportedException异常信息 ex={}", e.getMessage(), e);
        return Result.error(ResultEnum.SYSTEM_REQUEST_METHOD_NOT_SUPPORTED);
    }
}
