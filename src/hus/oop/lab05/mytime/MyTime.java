package hus.oop.lab05.mytime;

public class MyTime {
    private int hour, minute, second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0) && (hour <= 23) && (minute >= 0) && (minute <= 59) && (second >= 0) && (second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if ((hour >= 0) && (hour <= 23)) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if ((minute >= 0) && (minute <= 59)) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if ((second >= 0) && ( second <= 59)) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (getHour() < 10) {
            if (getHour() == 0) {
                stringBuilder.append("00");
            } else {
                stringBuilder.append("0").append(getHour());
            }
        } else {
            stringBuilder.append(getHour());
        }

        stringBuilder.append(":");

        if (getMinute() < 10) {
            if (getMinute() == 0) {
                stringBuilder.append("00");
            } else {
                stringBuilder.append("0").append(getMinute());
            }
        } else {
            stringBuilder.append(getMinute());
        }

        stringBuilder.append(":");

        if (getSecond() < 10) {
            if (getSecond() == 0) {
                stringBuilder.append("00");
            } else {
                stringBuilder.append("0").append(getSecond());
            }
        } else {
            stringBuilder.append(getSecond());
        }

        return stringBuilder.toString();
    }

    public MyTime nextSecond() {
        if (this.getSecond() == 59) {
            this.setSecond(0);
            if (this.getMinute() == 59) {
                this.setMinute(0);
                if (this.getHour() == 23) {
                    this.setHour(0);
                } else {
                    this.setHour(hour + 1);
                }
            } else {
                this.setMinute(minute + 1);
            }
        } else {
            this.setSecond(second + 1);
        }
        return this;
    }

    public MyTime nextMinute() {
        if (this.getMinute() == 59) {
            this.setMinute(0);
            if (this.getHour() == 23) {
                this.setHour(0);
            } else {
                this.setHour(hour + 1);
            }
        } else {
            this.setMinute(minute + 1);
        }
        return this;
    }

    public MyTime nextHour() {
        if (this.getHour() == 23) {
            this.setHour(0);
        } else {
            this.setHour(hour + 1);
        }
        return this;
    }

    public MyTime previousSecond() {
        if (this.getSecond() == 0) {
            this.setSecond(59);
            if (this.getMinute() == 0) {
                this.setMinute(59);
                if (this.getHour() == 0) {
                    this.setHour(23);
                } else {
                    this.setHour(hour - 1);
                }
            } else {
                this.setMinute(minute - 1);
            }
        } else {
            this.setSecond(second - 1);
        }
        return this;
    }

    public MyTime previousMinute() {
        if (this.getMinute() == 0) {
            this.setMinute(59);
            if (this.getHour() == 0) {
                this.setHour(23);
            } else {
                this.setHour(hour - 1);
            }
        } else {
            this.setMinute(minute - 1);
        }
        return this;
    }

    public MyTime previousHour() {
        if (this.getHour() == 0) {
            this.setHour(23);
        } else {
            this.setHour(hour - 1);
        }
        return this;
    }
}
