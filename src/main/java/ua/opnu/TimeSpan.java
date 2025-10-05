package ua.opnu;


public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            int sumMinutes = hours * 60 + minutes;
            this.hours = sumMinutes / 60;
            this.minutes = sumMinutes % 60;
        }
    }

    public TimeSpan(int sumMinutes) {
        if (sumMinutes < 0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = sumMinutes / 60;
            this.minutes = sumMinutes % 60;
        }
    }

    public TimeSpan(TimeSpan ts2) {
        this.hours = ts2.hours;
        this.minutes = ts2.minutes;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void add(int minutes) {
        this.add(0, minutes);
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            return;
        }

        int newTotalMinutes = this.getTotalMinutes() + (hours * 60 + minutes);

        this.hours = newTotalMinutes / 60;
        this.minutes = newTotalMinutes % 60;
    }

    public void add(TimeSpan timespan) {
        this.add(timespan.getHours(), timespan.getMinutes());
    }

    public double getTotalHours() {
        return (this.hours + this.minutes / 60.0);
    }

    public int getTotalMinutes() {
        return (this.hours * 60 + this.minutes);
    }

    public void subtract(TimeSpan span) {
        this.subtract(span.getHours(), span.getMinutes());
    }

    public void subtract(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            return;
        }
        int minuendTotalMinutes = this.getTotalMinutes();
        int subtrahendTotalMinutes = hours * 60 + minutes;

        if (minuendTotalMinutes < subtrahendTotalMinutes) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            int differenceTotalMinutes = minuendTotalMinutes - subtrahendTotalMinutes;
            this.hours = differenceTotalMinutes / 60;
            this.minutes = differenceTotalMinutes % 60;
        }
    }

    public void subtract(int minutes) {
        this.subtract(0, minutes);
    }

    public void scale(int factor) {
        if (factor <= 0) {
            this.hours = 0;
            this.minutes = 0;
            return;
        }

        int factoredTotalMinutes = this.getTotalMinutes() * factor;

        this.hours = factoredTotalMinutes / 60;
        this.minutes = factoredTotalMinutes % 60;
    }
}
