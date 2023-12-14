package prject;

abstract class UserDecorator extends User {
    protected User user;

    public UserDecorator(User user) {
        this.user = user;
    }

  
    @Override
    public void login() {
        super.login();
      }
}

