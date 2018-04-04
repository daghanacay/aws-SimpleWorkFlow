/**
 * This code was generated from {@link example.swf.helloWorkflow.GreeterWorkflow}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package example.swf.helloWorkflow;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

public interface GreeterWorkflowClientExternal extends WorkflowClientExternal
{
    void greet();
    void greet(StartWorkflowOptions optionsOverride);
}