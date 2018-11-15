package io.lewandowski.tutorial.spring.jsonformatting;

import java.time.*;

public final class Clock {

    private final LocalDate localDate;

    private final LocalTime localTime;

    private final Instant localDateTime;

    public Clock() {
        this.localDate = LocalDate.of(2016, 1, 1);
        this.localTime = LocalTime.of(10, 24);
        this.localDateTime = Instant.now();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public Instant getLocalDateTime() {
        return localDateTime;
    }

}
