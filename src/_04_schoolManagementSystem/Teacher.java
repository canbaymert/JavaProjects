package _04_schoolManagementSystem;

public class Teacher extends Member {
    private Integer registryNumber;
    private String branch;

    public Teacher() {
    }

    public Teacher(String nameSurname, String IDNo, Integer age, String branch, Integer registryNumber) {
        super.setNameSurname(nameSurname);
        super.setIDNo(IDNo);
        super.setAge(age);
        this.branch = branch;
        this.registryNumber = registryNumber;
    }

    public String getBranch() {
        return branch;
    }

    public Integer getRegistryNumber() {
        return registryNumber;
    }


    @Override
    public String toString() {
        return getNameSurname() + ", " + getIDNo() + ", " + getAge() + ", " + getBranch();
    }
}

