package com.fw.server.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 日期转换
 * @author FW900
 * @date 2021-09-26 11:18
 */
@Component
public class DateConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {

        try {
            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
