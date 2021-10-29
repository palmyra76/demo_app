package com.acme.myapp.marks;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.base.annotations.ApiMapping;
import com.zitlab.palmyra.api2db.handler.QueryHandler;
import com.zitlab.palmyra.cinch.pojo.QueryFilter;
import com.zitlab.palmyra.cinch.pojo.Tuple;
import com.zitlab.palmyra.cinch.security.ACLRights;

@Component
@ApiMapping("Marks")
public class MarksQueryHandler implements QueryHandler {

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return ACLRights.READ;
	}

	@Override
	public QueryFilter applyPreFilter(QueryFilter filter) {
		return filter;
	}

	@Override
	public Tuple onQueryResult(Tuple item, String action) {
		Float english = getMarks(item,"english");
		Float maths = getMarks(item,"maths");
		Float tamil = getMarks(item,"tamil");
		Float science = getMarks(item,"science");
		Float history = getMarks(item,"history");
		Float total = english + maths + tamil + science + history;
		
		item.set("total", total);
		return item;
	}
	
	private Float getMarks(Tuple item, String subject) {
		Float mark = item.getAttributeAsFloat(subject);
		return null != mark ?mark : 0;
	}

}
