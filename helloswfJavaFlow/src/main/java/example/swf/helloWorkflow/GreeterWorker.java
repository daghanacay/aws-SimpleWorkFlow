package example.swf.helloWorkflow;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientBuilder;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;

public class GreeterWorker {
	 public static void main(String[] args) throws Exception {
	     AmazonSimpleWorkflow service = AmazonSimpleWorkflowClientBuilder.defaultClient();

	     String domain = "helloWorldWalkthrough2";
	     String taskListToPoll = "HelloWorldList";

	     ActivityWorker aw = new ActivityWorker(service, domain, taskListToPoll);
	     aw.addActivitiesImplementation(new GreeterActivitiesImpl());
	     aw.start();

	     WorkflowWorker wfw = new WorkflowWorker(service, domain, taskListToPoll);
	     wfw.addWorkflowImplementationType(GreeterWorkflowImpl.class);
	     wfw.start();
	   }
}
