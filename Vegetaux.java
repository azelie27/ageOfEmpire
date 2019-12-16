

public class Vegetaux {

    private int calorie;
    private boolean comestible;

    public Vegetaux(int calorie, boolean comestible) {
        this.calorie = calorie;
        this.comestible = comestible;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    @Override
    public String toString() {
        return "Vegetaux [calorie=" + calorie + ", comestible=" + comestible + "]";
    }

    

    

}
