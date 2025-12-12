import java.util.Date;

public class Owner {

    private String name;
    private int phoneNo;
    private Date date;

    public Owner(String name, int phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.date = new Date(); // current system time
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Owner{name='" + name + "', phoneNo=" + phoneNo + ", date=" + date + "}";
    }
}

