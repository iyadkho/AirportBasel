package src.dto;

public class Flight {

    private String date;
    private String time;
    private String to;
    private String airline;
    private String flightNo;
    private String remarks;

    public Flight(String date, String time, String to, String airline, String flightNo, String remarks) {
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

    public Flight setDate(String date) {
        this.date = date;
        return this;
    }

    public String getTime() {
        return time;
    }

    public Flight setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTo() {
        return to;
    }

    public Flight setTo(String to) {
        this.to = to;
        return this;
    }

    public String getAirline() {
        return airline;
    }

    public Flight setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Flight setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public Flight setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
}
