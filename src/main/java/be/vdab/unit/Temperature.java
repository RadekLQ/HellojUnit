package be.vdab.unit;

public class Temperature {

    private float temp;

    public Temperature(float temp) {
        this.setValue(temp);
    }

    public float getValue() {
        return temp;
    }

    public void setValue(float temp) throws InvalidTemperatureException{
        if (temp < -273.15F) {
            throw new InvalidTemperatureException("Deze temperatuur bestaat niet");
        } else {
            this.temp = temp;
        }
    }

    public boolean isBoiling() {
        return temp >= 100;
    }

    public boolean isFreezing() {
        return temp <= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Temperature that = (Temperature) o;

        return Float.compare(that.temp, temp) == 0;
    }

    @Override
    public int hashCode() {
        return (temp != +0.0f ? Float.floatToIntBits(temp) : 0);
    }
}
