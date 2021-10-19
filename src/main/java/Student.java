public class Student {

    public String name;
    public Double avarage_score;
    public Boolean blc_chn;

    public Student(String name, Double avarage_score, Boolean blc_chn){
        this.name=name;
        this.avarage_score = avarage_score;
        this.blc_chn=blc_chn;
    }

    public Student(){}

    public String getName() {return name;}

    public Boolean getBlc_chn() {return blc_chn;}

    public Double getAvarage_score() {return avarage_score;}

    public void setAvarage_score(Double avarage_score) {
        this.avarage_score = avarage_score;
    }

    public void setBlc_chn(Boolean blc_chn) {
        this.blc_chn = blc_chn;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return true;

    }
}
