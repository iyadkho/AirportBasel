package src.dto;

import java.util.Date;

public class RequestDto {

    private String date;
    private String time;
    private String to;
    private String airline;
    private String flightNo;
    private String remarks;

    public RequestDto(String date, String time, String to, String airline, String flightNo, String remarks) {
        this.date = date;
        this.time = time;
        this.to = to;
        this.airline = airline;
        this.flightNo = flightNo;
        this.remarks = remarks;
    }

    public String getDate() {
        return date;
    }

    public RequestDto setDate(String date) {
        this.date = date;
        return this;
    }

    public String getTime() {
        return time;
    }

    public RequestDto setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTo() {
        return to;
    }

    public RequestDto setTo(String to) {
        this.to = to;
        return this;
    }

    public String getAirline() {
        return airline;
    }

    public RequestDto setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public RequestDto setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public RequestDto setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
}
