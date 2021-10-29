package com.biocliq.sample;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.handler.QueryHandler;
import com.zitlab.palmyra.cinch.pojo.QueryFilter;
import com.zitlab.palmyra.cinch.pojo.Tuple;
import com.zitlab.palmyra.cinch.security.AclMask;

@Component("query/Users")
public class TupleQueryUsers implements QueryHandler{

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return AclMask.READ;
	}

	@Override
	public QueryFilter applyPreFilter(QueryFilter filter) {
		return filter;
	}

}
