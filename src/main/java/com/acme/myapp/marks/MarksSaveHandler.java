package com.acme.myapp.marks;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.base.annotations.ApiMapping;
import com.zitlab.palmyra.api2db.handler.SaveHandler;
import com.zitlab.palmyra.cinch.pojo.Tuple;
import com.zitlab.palmyra.cinch.security.ACLRights;

@Component
@ApiMapping("Marks")
public class MarksSaveHandler implements SaveHandler{

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return ACLRights.ALL;
	}

}
