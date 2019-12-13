class Unites  {

    private String name;
    private Type genre;

    public Unites(String name, Type genre) {
        this.name = name;
        this.genre = genre;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getGenre() {
        return genre;
    }

    public void setGenre(Type genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Unites [genre=" + genre + ", name=" + name + "]";
    }

    


    

    
    

 

}