public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;

    }

    // SETTERS
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // GETTERS
    public String getFirstname() {
        return firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public String whoAmI() {
        if (this.aware) {
            return "je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            return "je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}
