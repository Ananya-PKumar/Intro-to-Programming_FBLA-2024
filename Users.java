package gpacalculator;

public class Users {

    private String studentId;
    private String password;
    private String fullName;
    private String currentAcdYear;

    public static int indexUser;

    public static void setIndex(int i) {
        indexUser = i;
    }

    public Users(String i, String p, String n) {
        studentId = i;
        password = p;
        fullName = n;
    }
            
    public String getStudentId() {
        return studentId;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setCurrentAcdYear(String c) {
        currentAcdYear = c;
    }

    public String getCurrentAcdYear() {
        return currentAcdYear;
    }

}
