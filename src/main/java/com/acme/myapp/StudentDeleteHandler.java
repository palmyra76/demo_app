package com.acme.myapp;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.base.annotations.ApiMapping;
import com.zitlab.palmyra.api2db.handler.DeleteHandler;
import com.zitlab.palmyra.cinch.pojo.Tuple;
import com.zitlab.palmyra.cinch.security.AclMask;

@Component
@ApiMapping("Student")
public class StudentDeleteHandler implements DeleteHandler{

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return AclMask.DELETE;
	}

}
