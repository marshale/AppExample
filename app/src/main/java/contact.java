/**
 * Created by erinmay on 2/25/15.
 */
public class contact {

    private String _name, _nickname, _phone, _email, _newsletter;

    public contact (String name, String nickname, String phone, String email, String newsletter) {
        _name = name;
        _nickname = nickname;
        _phone = phone;
        _email = email;
        _newsletter = newsletter;

    }

    public String getName() {
        return _name;
    }

    public String getNickname() {
        return _nickname;
    }

    public String getPhone() {
        return _phone;
    }

    public String getEmail() {
        return _email;
    }

    public String getNewsletter() {
        return _newsletter;
    }
}
