package com.vp.messaging.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@UtilityClass
@Slf4j
public class DateUtils {

    public static DateTimeFormatter formatterOf(String format) {
        return new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern(format))
                .toFormatter();
    }

    public LocalDate stringToLocaleDate(String date) {
        try {
            date = StringUtils.trim(date).replaceAll(" +", " ");
            return StringUtils.isNotBlank(date) ? LocalDate.parse(date, DateUtils.formatterOf("M/d/yyyy")) : null;
        } catch (Exception e) {
            log.error("Error converting String to DateFormat {}, {}, {}", date, e.getCause(), e.getMessage());
            return null;
        }
    }

    public LocalDate stringToLocaleDate(String date, String format) {
        try {
            date = StringUtils.trim(date).replaceAll(" +", " ");
            return StringUtils.isNotBlank(date) ? LocalDate.parse(date, DateUtils.formatterOf(format)) : null;
        } catch (Exception e) {
            log.error("Error converting String to DateFormat = {}, date = {}, {}, {}", format, date, e.getCause(), e.getMessage());
            return null;
        }
    }

    /**
     * get current system time converted to EST
     */
    public LocalDateTime getCurrentSystemTimeConvertedToEST() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        zonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        return zonedDateTime.toLocalDateTime();
    }
}
