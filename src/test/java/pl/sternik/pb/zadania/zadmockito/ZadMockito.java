package pl.sternik.pb.zadania.zadmockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class ZadMockito {

	UserService userService = mock(UserService.class);
	AuthService authService = new AuthService(userService);
	
	@Test/*(expected=NullPointerException.class)*/
	public void testBadLogin() throws Exception {
		
		//when(userService.findByName("xyz")).thenThrow(new NullPointerException());
		when(userService.findByName("xyz")).thenReturn(null);
		//userService.findByName("aaa");
		
		boolean authOk = authService.checkCredentials("xyz", "password");
		assertThat(authOk).isFalse();
		
		//verify(userService).findByName("xyz");
		//verifyNoMoreInteractions(userService);
		//verify(userService, never()).findByName("root");
		//verify(userService, only()).findByName("xyz");
		//verify(userService, times(1)).findByName("xyz");
		//verify(userService, atLeastOnce()).findByName("xyz");
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() throws Exception {
		when(userService.findByName(anyString())).thenThrow(new NullPointerException());
		authService.checkCredentials("abc", "aaa");
	}
}
