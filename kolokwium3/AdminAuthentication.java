public class AdminAuthentication implements Authentication{
    private String username;
    private String password;
    public AdminAuthentication(String username, String password){
        this.username=username;
        this.password=password;
    }
    @Override
    public boolean login(String username, String password) {
        return this.username==username && this.password==password;
    }

    @Override
    public void logout() {
        System.out.printf("Poprawnie wylogowano");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(this.username==username&&this.password==oldPassword){
            this.password=newPassword;
            return true;
        }
        return false;
    }
}
