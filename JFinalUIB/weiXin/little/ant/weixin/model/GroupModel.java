package little.ant.weixin.model;

import little.ant.pingtai.annotation.Table;
import little.ant.pingtai.model.BaseModel;

import org.apache.log4j.Logger;

@SuppressWarnings("unused")
@Table(tableName="wx_group")
public class GroupModel extends BaseModel<GroupModel> {
	
	private static final long serialVersionUID = 2051998642258015518L;

	private static Logger log = Logger.getLogger(GroupModel.class);
	
	public static final GroupModel dao = new GroupModel();
	
}