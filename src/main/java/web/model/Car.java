package web.model;

// 2. Создайте модель Car с тремя произвольными полями.
public class Car {
    private Long id;
    private String model;
    private int series;

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

    public Long getId() {
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

    public Car(String model, int series) {
        this.id = (long) (Math.random() * 2);
        this.model = model;
        this.series = series;
    }
}
