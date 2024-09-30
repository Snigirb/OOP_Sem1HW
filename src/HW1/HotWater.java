package HW1;

public class HotWater extends Product {

    private int temperature;

    public HotWater(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotWater{" +
                "name='" + super.getName() + '\'' +
                "temperature='" + this.temperature + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotWater)) {
            return false;
        }

        HotWater that = (HotWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getTemperature() == that.getTemperature();
    }
}
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
// реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре