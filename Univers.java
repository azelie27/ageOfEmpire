class Univers {

   
    private String name;
    private double length = 0.0;
    private double width  = 0.0;
    private Carte carte;

    public Univers(String name, double length, double width, Carte carte) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.carte = carte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    } 
    
    
   
}