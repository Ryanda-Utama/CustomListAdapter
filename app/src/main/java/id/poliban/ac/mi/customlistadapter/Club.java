package id.poliban.ac.mi.customlistadapter;

public class Club {
private  String flag;
private String clubName;
private  String clubDescription;

    public Club(String flag, String clubName, String clubDescription) {
        this.flag = flag;
        this.clubName = clubName;
        this.clubDescription = clubDescription;
    }

    @Override
    public String toString() {
        return String.format("30s\n\n%s", getClubName(), getClubDescription());
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }
}
