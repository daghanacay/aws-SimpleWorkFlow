package example.swf.hello;

public class GreeterWorkflowImpl implements GreeterWorkflow {
	private GreeterActivities operations = new GreeterActivitiesImpl();

	@Override
	public void greet() {
		String name = operations.getName();
		String greeting = operations.getGreeting(name);
		operations.say(greeting);
	}

}
