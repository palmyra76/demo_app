package com.biocliq.sample;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.handler.SaveHandler;
import com.zitlab.palmyra.cinch.pojo.Tuple;
import com.zitlab.palmyra.cinch.security.AclMask;

@Component("save/Users")
public class SaveUsers implements SaveHandler{

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return AclMask.READ_SAVE;
	}
}
