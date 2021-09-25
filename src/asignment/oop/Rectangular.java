package asignment.oop;

public class Rectangular {
    private float longs;
    private float width;

    public Rectangular() {
    }

    public Rectangular(float longs, float width) {
        this.longs = longs;
        this.width = width;
    }

    public float getLongs() {
        return longs;
    }

    public void setLongs(float longs) {
        this.longs = longs;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double perimeter(){
        return (this.longs + this.width) * 2; // cast convert
    }

    public double area() {
        return this.longs * this.width;
    }
}

// [object 1 , object 2]
