package web.model;

// 2. Создайте модель Car с тремя произвольными полями.
public class Car {
    private int id;
    private String model;
    private int series;

    public void setId(int id) {
        this.id = id;
    }

    public Car() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public Car(int id, String model, int series ) {
        this.id = id;
        this.model = model;
        this.series = series;
    }
}
