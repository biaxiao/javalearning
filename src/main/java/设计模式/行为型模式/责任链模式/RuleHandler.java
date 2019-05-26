package 设计模式.行为型模式.责任链模式;

public abstract class RuleHandler {
	//后继节点
	protected RuleHandler successor;
	
	public abstract void apply(Context context);

	public RuleHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(RuleHandler successor) {
		this.successor = successor;
	}
	
}

//检验是否为新用户
class NewUserRuleHandler extends RuleHandler{

	@Override
	public void apply(Context context) {
		if(context.isNewUser()) {
			//如果有后续节点的话，传递下去
			if(this.getSuccessor()!=null) {
				this.getSuccessor().apply(context);
			}
		}else {
			throw new RuntimeException("该活动仅限新用户参加");
		}
	}
}

//检验用户地区是否可以参加
class LocationRuleHandler extends RuleHandler{

	@Override
	public void apply(Context context) {
		//boolean allowed=activityService.isSupportedLocation(context.getLoaction);
		/*if(allowed) {
			if(this.getSuccessor()!=null) {
				this.getSuccessor().apply(context);
			}
		}else {
			throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动");
		}*/
	}
	
}

//检验奖品是否已领完
class LimitRuleHandler extends RuleHandler{

	@Override
	public void apply(Context context) {
		/* int remainedTimes = activityService.queryRemainedTimes(context); // 查询剩余奖品
	        if (remainedTimes > 0) {
	            if (this.getSuccessor() != null) {
	                this.getSuccessor().apply(userInfo);
	            }
	        } else {
	            throw new RuntimeException("您来得太晚了，奖品被领完了");
	        }
*/
		
	}
	
}








