import jdk.jshell.spi.ExecutionControl;

public class Employee {
    private String employeeNumber;
    private String name;
    private String englishName;
    private String position;
    private String gender;
    private String birthDay;
    private String entryDate;
    private String address;
    private String city;
    private String area;
    private String homeTelephone;
    private String superiorNumber;
    private String departmentNumber;

    public Employee() {
    }

    public Employee(String employeeNumber, String name, String englishName,
                    String position, String gender, String birthDay, String entryDate,
                    String address, String city, String area, String homeTelephone,
                    String superiorNumber, String departmentNumber) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.englishName = englishName;
        this.position = position;
        this.gender = gender;
        this.birthDay = birthDay;
        this.entryDate = entryDate;
        this.address = address;
        this.city = city;
        this.area = area;
        this.homeTelephone = homeTelephone;
        this.superiorNumber = superiorNumber;
        this.departmentNumber = departmentNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return gender;
    }

    public void setBirthDay(String gender) {
        this.gender = gender;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return
    }
}