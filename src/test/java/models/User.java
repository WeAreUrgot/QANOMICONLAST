package models;

public class User {
    private String login;
    private String password;

    public static class Builder {
        private User newUser;

        public Builder() {
            newUser = new User();
        }

        public Builder bLogin(String email) {
            newUser.login = email;
            return this;
        }

        public Builder bPass(String password) {
            newUser.password = password;
            return this;
        }

        public User build() {
            return newUser;
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return password;
    }
}
