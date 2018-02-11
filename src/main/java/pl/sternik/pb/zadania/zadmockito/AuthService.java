package pl.sternik.pb.zadania.zadmockito;

public class AuthService {

	private UserService userService;

	public AuthService(UserService userService) {
		this.userService = userService;
	}

	public boolean checkCredentials(String userName, String userPassword) {
		
		String user = userService.findByName(userName);
        if (user != null && !"null".equals(user)) {
            return true;
        }
        else{
            return false;
        }
	}
}
