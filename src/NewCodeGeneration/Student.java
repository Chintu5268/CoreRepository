package NewCodeGeneration;

public class Student {

  private String name;
  private String lastname;
  private long mobile;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  public long getMobile() {
    return mobile;
  }
  public void setMobile(long mobile) {
    this.mobile = mobile;
  }
  @Override
  public String toString() {
    return "Student [name=" + name + ", lastname=" + lastname + ", mobile=" + mobile + "]";
  }

  
}
