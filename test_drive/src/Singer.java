public class Singer {

    private String name;
    private String gender;
    private String nationality;
    private Date BirthDate;

    Singer(String name, String gender,  String nationality, Date BirthDate){

        this.name = name;
        this.gender =gender;
        this.nationality = nationality;
        this.BirthDate = BirthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String toString(){
        return String.format("%s %s %s %s \n",name,gender,nationality, BirthDate);

    }
}
