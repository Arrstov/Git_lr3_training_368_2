package Model.gamefield;

public class Direction {

    private final int _hours; // Направление хранится как "часы" на циферблате (0, 3, 6, 9)

    private Direction(int hours) {

        hours = hours % 12;
        if (hours < 0) { hours += 12; }

        _hours = hours;
    }

    public static Direction north() {
        return new Direction(0); // Север соответствует 0 часов (12 часов)
    }

    public static Direction south() {
        return new Direction(6);
    }

    public static Direction east() {
        return new Direction(3);
    }

    public static Direction west() {
        return new Direction(9);
    }

    public Direction clockwise() {
        return new Direction(this._hours + 3);
    }

    public Direction anticlockwise() {
        return new Direction(this._hours - 3);
    }

    public Direction opposite() {
        return new Direction(this._hours + 6);
    }

    public Direction onRight() {
        return clockwise();
    }

    public Direction onLeft() {
        return anticlockwise();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Direction)) {
            return false;
        }

        Direction direct = (Direction) other;
        return _hours == direct._hours;
    }

    public boolean isOpposite(Direction other) {
        return this.opposite().equals(other); // Проверяем, что переданное направление противоположно текущему
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this._hours;
        return hash;
    }

    @Override
    public String toString() {
        String msg = "";

        if(_hours == 0) {
            msg = "N";
        } else if(_hours == 3) {
            msg = "E";
        } else if (_hours == 6) {
            msg = "S";
        } else if(_hours == 9) {
            msg = "W"; // West (Запад)
        }

        return msg;
    }
}