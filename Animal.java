

public class Animal {

    private String lapin;
    private String chat;
    private String oiseau;
    private String poisson;
    private String ours;

    public Animal() {
        
    }

    public String getLapin() {
        return lapin;
    }

    public void setLapin(String lapin) {
        this.lapin = lapin;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getOiseau() {
        return oiseau;
    }

    public void setOiseau(String oiseau) {
        this.oiseau = oiseau;
    }

    public String getPoisson() {
        return poisson;
    }

    public void setPoisson(String poisson) {
        this.poisson = poisson;
    }

    public String getOurs() {
        return ours;
    }

    public void setOurs(String ours) {
        this.ours = ours;
    }

    @Override
    public String toString() {
        return "Animal [chat=" + chat + ", lapin=" + lapin + ", oiseau=" + oiseau + ", ours=" + ours + ", poisson="
                + poisson + "]";
    }


    

}
