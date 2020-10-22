package com.behl.app.ws.userservice;

import com.behl.app.ws.ui.model.request.UserDetailsRequestModel;
import com.behl.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
