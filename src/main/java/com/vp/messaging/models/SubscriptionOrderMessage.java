package com.vp.messaging.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.opencsv.bean.CsvBindByPosition;
import com.vp.messaging.utils.DateUtils;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@Slf4j
public class SubscriptionOrderMessage implements Serializable {

    @CsvBindByPosition(position = 10)
    private String templateOrderId;

    @CsvBindByPosition(position = 11)
    private String lineNumber;

    @CsvBindByPosition(position = 12)
    private String accountNumber;

    @CsvBindByPosition(position = 20)
    private String partNumber;

    @CsvBindByPosition(position = 21)
    private String partDescription;

    @CsvBindByPosition(position = 22)
    private Integer orderQuantity;

    @CsvBindByPosition(position = 23)
    private String orderUom;

    @CsvBindByPosition(position = 25)
    private String vendorId;

    @CsvBindByPosition(position = 28)
    @JsonIgnore
    private String datePromisedRaw;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    public LocalDate getPromisedDate() {
        return DateUtils.stringToLocaleDate(this.datePromisedRaw);
    }

    @CsvBindByPosition(position = 30)
    private String orderType;

    @CsvBindByPosition(position = 31)
    private Integer deliveryFrequency;

    @CsvBindByPosition(position = 32)
    private Integer shipmentRemaining;

    @CsvBindByPosition(position = 33)
    private String poNumber;

    @CsvBindByPosition(position = 39)
    private Double unitPrice;

    @CsvBindByPosition(position = 41)
    private String priceDerivation;

    @CsvBindByPosition(position = 43)
    private Integer numberOfReleases;

    @CsvBindByPosition(position = 46)
    private String lotNumber;

    @CsvBindByPosition(position = 26)
    @JsonIgnore
    private String nextReleaseRaw;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    public LocalDate getNextReleaseDate() {
        return DateUtils.stringToLocaleDate(this.nextReleaseRaw);
    }

    @CsvBindByPosition(position = 27)
    @JsonIgnore
    private String lastReleasedRaw;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    public LocalDate getLastReleasedDate() {
        return DateUtils.stringToLocaleDate(this.lastReleasedRaw);
    }

    @CsvBindByPosition(position = 29)
    @JsonIgnore
    private String dateStartedRaw;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    public LocalDate getStartedDate() {
        return DateUtils.stringToLocaleDate(this.dateStartedRaw);
    }

    @CsvBindByPosition(position = 37)
    @JsonIgnore
    private String dateLastShippedRaw;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    public LocalDate getLastShippedDate() {
        return DateUtils.stringToLocaleDate(this.dateLastShippedRaw);
    }

    @CsvBindByPosition(position = 38)
    @JsonIgnore
    private String dateNextArrivalRaw;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonProperty
    public LocalDate getNextArrivalDate() {
        return DateUtils.stringToLocaleDate(this.dateNextArrivalRaw, "yyyymmdd");
    }

}
