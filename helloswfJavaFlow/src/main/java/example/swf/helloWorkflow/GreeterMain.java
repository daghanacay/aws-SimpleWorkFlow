package example.swf.helloWorkflow;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientBuilder;

public class GreeterMain {
	public static void main(String[] args) throws Exception {
		AmazonSimpleWorkflow service = AmazonSimpleWorkflowClientBuilder.defaultClient();
		
		String domain = "helloWorldWalkthrough2";

		GreeterWorkflowClientExternalFactory factory = new GreeterWorkflowClientExternalFactoryImpl(service, domain);
		GreeterWorkflowClientExternal greeter = factory.getClient("someID");
		greeter.greet();
	}
}
