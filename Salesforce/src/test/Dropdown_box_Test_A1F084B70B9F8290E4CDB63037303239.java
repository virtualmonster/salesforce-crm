/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Dropdown_box_Test_A1F084B70B9F8290E4CDB63037303239 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Dropdown_box_Test_A1F084B70B9F8290E4CDB63037303239(IContainer container, String invocationId) {
		super(container, "dropdown box", invocationId, "A1F084B70B9F8290E4CDB63037303239", "/Salesforce/dropdown box.testsuite", "C:/Users/stuart.walker/HCL/devopstest/workspace/Salesforce/dropdown box.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
	this.add(applicationContext_12(this));
	this.add(applicationContext_13(this));
	this.add(applicationContext_14(this));
	this.add(applicationContext_15(this));
	this.add(applicationContext_16(this));
	this.add(applicationContext_17(this));
	this.add(applicationContext_18(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Dropdown_box_Test_A1F084B70B9F8290E4CDB63037303239 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F084B70B9F82AEE4CDB63037303239");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BA91F80E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1F084B70BA91F80E4CDB63037303239\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Email field whose Label is Username - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BAC05B4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Email field<\\/b> whose <b>Label<\\/b> is <b>Username<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70BAC05B4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username\"},\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:361;left:309;bottom:404;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 361 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 404, \\\"class\\\": \\\"input r4 wide mb16 mt8 username\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"username\\\", \\\"label\\\": \\\"Username\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputemail\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 361, \\\"type\\\": \\\"email\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"66\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='username']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputemail\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'stuart.walker651@agentforce.com' in Email field whose Label is Username - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BB1D214E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70BB1D214E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1812,\"isWeb\":false,\"description\":\"Think <i>1,812<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>stuart.walker651@agentforce.com<\\/b>' in <b>Email field<\\/b> whose <b>Label<\\/b> is <b>Username<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70BB1D214E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"stuart.walker651@agentforce.com\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:361;left:309;bottom:404;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 361 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 404, \\\"class\\\": \\\"input r4 wide mb16 mt8 username\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"username\\\", \\\"label\\\": \\\"Username\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputemail\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 361, \\\"type\\\": \\\"email\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"96\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='username']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputemail\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Password field whose Label is Password - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BB79E74E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70BB79E74E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2737,\"isWeb\":false,\"description\":\"Think <i>2,737<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70BB79E74E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:443;left:309;bottom:486;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 443 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"aria-required\\\": \\\"true\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 486, \\\"class\\\": \\\"input r4 wide mb16 mt8 password\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"password\\\", \\\"label\\\": \\\"Password\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"pw\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 443, \\\"type\\\": \\\"password\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"160\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='password']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'Gr33nhat!!' in Password field whose Label is Password - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BBDB8F4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70BBDB8F4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":964,\"isWeb\":false,\"description\":\"Think <i>964<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>Gr33nhat!!<\\/b>' in <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70BBDB8F4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Gr33nhat!!\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:443;left:309;bottom:486;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 443 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"aria-required\\\": \\\"true\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 486, \\\"class\\\": \\\"input r4 wide mb16 mt8 password\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"password\\\", \\\"label\\\": \\\"Password\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"pw\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 443, \\\"type\\\": \\\"password\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"190\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='password']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Content is Log In - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BC3FA94E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70BC3FA94E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2929,\"isWeb\":false,\"description\":\"Think <i>2,929<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Log In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70BC3FA94E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Log In\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:502;left:309;bottom:545;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 502 }, \\\"Style$array$\\\": \\\"background-color:rgb(0, 95, 178);background-repeat:repeat;color:rgb(255, 255, 255);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12px;padding-left:24px;padding-right:24px;padding-top:12px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"005FB2FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 545, \\\"class\\\": \\\"button r4 wide primary\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Log In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"Login\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"Login\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 24, \\\"padding-right\\\": 24, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 502, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Log In\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"251\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='Login']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is View Accounts - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70BCDBE84E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70BCDBE84E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":8231,\"isWeb\":false,\"description\":\"Think <i>8,231<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>View Accounts<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70BCDBE84E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"View Accounts\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:454;left:657;bottom:492;right:775\\\", \\\"Geometry\\\": { \\\"height\\\": 38, \\\"width\\\": 117, \\\"x\\\": 657, \\\"y\\\": 454 }, \\\"bottom\\\": 492, \\\"class\\\": \\\"slds-card__footer-action viewMoreLink\\\", \\\"content\\\": \\\"View Accounts\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 657, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 775, \\\"tabindex\\\": \\\"0\\\", \\\"tagName\\\": \\\"a\\\", \\\"top\\\": 454, \\\"visible\\\": false, \\\"xpath\\\": \\\"1984\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose Content is New - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70C0BD8F4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70C0BD8F4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":6164,\"isWeb\":false,\"description\":\"Think <i>6,164<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>Content<\\/b> is <b>New<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70C0BD8F4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:125;left:1660;bottom:155;right:1686\\\", \\\"Geometry\\\": { \\\"height\\\": 30, \\\"width\\\": 25, \\\"x\\\": 1660, \\\"y\\\": 125 }, \\\"bottom\\\": 155, \\\"content\\\": \\\"New\\\", \\\"data-aura-rendered-by\\\": \\\"1063:0\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 1660, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 1686, \\\"tagName\\\": \\\"div\\\", \\\"title\\\": \\\"New\\\", \\\"top\\\": 125, \\\"visible\\\": false, \\\"xpath\\\": \\\"2769\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is *Account Name - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70C589964E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70C589964E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":3490,\"isWeb\":false,\"description\":\"Think <i>3,490<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>*Account Name<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70C589964E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"*Account Name\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:278;left:578;bottom:310;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 278 }, \\\"aria-describedby\\\": \\\"help-message-363\\\", \\\"bottom\\\": 310, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-363\\\", \\\"label\\\": \\\"*Account Name\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"255\\\", \\\"name\\\": \\\"Name\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 278, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"4277\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'Account 4' in Edit text whose Label is *Account Name - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70CE91994E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70CE91994E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":3210,\"isWeb\":false,\"description\":\"Think <i>3,210<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>Account 4<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>*Account Name<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70CE91994E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Account 4\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"*Account Name\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:278;left:578;bottom:310;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 278 }, \\\"aria-describedby\\\": \\\"help-message-363\\\", \\\"bottom\\\": 310, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-363\\\", \\\"label\\\": \\\"*Account Name\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"255\\\", \\\"name\\\": \\\"Name\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 278, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"5968\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Name is country located at position 1 - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70D6E0104E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70D6E0104E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":15495,\"isWeb\":false,\"description\":\"Think <i>15,495<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Name<\\/b> is <b>country<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70D6E0104E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"country\"},\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:403;left:582;bottom:435;right:928\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 346, \\\"x\\\": 582, \\\"y\\\": 403 }, \\\"aria-autocomplete\\\": \\\"list\\\", \\\"aria-controls\\\": \\\"dropdown-element-435\\\", \\\"aria-disabled\\\": \\\"false\\\", \\\"aria-expanded\\\": \\\"false\\\", \\\"aria-haspopup\\\": \\\"listbox\\\", \\\"aria-label\\\": \\\"Billing Country\\\", \\\"aria-readonly\\\": \\\"false\\\", \\\"autocomplete\\\": \\\"country\\\", \\\"bottom\\\": 435, \\\"class\\\": \\\"slds-combobox__input slds-input slds-combobox__input-value\\\", \\\"content\\\": \\\"--None--\\\", \\\"data-value\\\": \\\"--None--\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"combobox-input-435\\\", \\\"left\\\": 582, \\\"name\\\": \\\"country\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 928, \\\"role\\\": \\\"combobox\\\", \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 403, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"9639\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on SFL Combo Item whose Content is United Kingdom - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70DF1FE14E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70DF1FE14E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":12826,\"isWeb\":false,\"description\":\"Think <i>12,826<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>SFL Combo Item<\\/b> whose <b>Content<\\/b> is <b>United Kingdom<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70DF1FE14E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"United Kingdom\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:709;left:583;bottom:743;right:912\\\", \\\"Geometry\\\": { \\\"height\\\": 34, \\\"width\\\": 329, \\\"x\\\": 583, \\\"y\\\": 709 }, \\\"aria-checked\\\": \\\"false\\\", \\\"aria-selected\\\": \\\"false\\\", \\\"bottom\\\": 743, \\\"class\\\": \\\"slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain slds-has-focus\\\", \\\"content\\\": \\\"United Kingdom\\\", \\\"data-item-id\\\": \\\"combobox-input-435-223\\\", \\\"data-value\\\": \\\"GB\\\", \\\"domainName\\\": \\\"sfl\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"exportparts\\\": \\\"option\\\", \\\"id\\\": \\\"combobox-input-435-223-435\\\", \\\"left\\\": 583, \\\"proxyClass\\\": \\\"SFLBaseComboboxItem\\\", \\\"proxyName\\\": \\\"lightning-base-combobox-item\\\", \\\"right\\\": 912, \\\"role\\\": \\\"option\\\", \\\"tagName\\\": \\\"lightning-base-combobox-item\\\", \\\"top\\\": 709, \\\"visible\\\": false, \\\"xpath\\\": \\\"12248\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.lightning-base-combobox-item\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Save - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B70F4BC1B4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B70F4BC1B4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":16029,\"isWeb\":false,\"description\":\"Think <i>16,029<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Save<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B70F4BC1B4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Save\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:906;left:1018;bottom:937;right:1077\\\", \\\"Geometry\\\": { \\\"height\\\": 31, \\\"width\\\": 58, \\\"x\\\": 1018, \\\"y\\\": 906 }, \\\"aria-disabled\\\": \\\"false\\\", \\\"bottom\\\": 937, \\\"class\\\": \\\"slds-button slds-button_brand\\\", \\\"content\\\": \\\"Save\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"kx-scope\\\": \\\"button-brand\\\", \\\"kx-type\\\": \\\"ripple\\\", \\\"left\\\": 1018, \\\"name\\\": \\\"SaveEdit\\\", \\\"part\\\": \\\"button\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1077, \\\"tagName\\\": \\\"button\\\", \\\"top\\\": 906, \\\"type\\\": \\\"button\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"14363\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_14(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Span element whose Content is Home - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B710615064E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B710615064E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":7808,\"isWeb\":false,\"description\":\"Think <i>7,808<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Span element<\\/b> whose <b>Content<\\/b> is <b>Home<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B710615064E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Home\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:58;left:144;bottom:78;right:178\\\", \\\"Geometry\\\": { \\\"height\\\": 19, \\\"width\\\": 34, \\\"x\\\": 144, \\\"y\\\": 58 }, \\\"bottom\\\": 78, \\\"class\\\": \\\"slds-truncate\\\", \\\"content\\\": \\\"Home\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 144, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"span\\\", \\\"right\\\": 178, \\\"tagName\\\": \\\"span\\\", \\\"top\\\": 58, \\\"visible\\\": false, \\\"xpath\\\": \\\"14570\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.span\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_15(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose Content is Setup containing SFL Icon whose iconName is utility:setup - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B71114E8F4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B71114E8F4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":18108,\"isWeb\":false,\"description\":\"Think <i>18,108<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>Content<\\/b> is <b>Setup<\\/b> containing SFL Icon whose <b>iconName<\\/b> is <b>utility:setup<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B71114E8F4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Setup\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:15;left:1775;bottom:35;right:1795\\\", \\\"Geometry\\\": { \\\"height\\\": 20, \\\"width\\\": 20, \\\"x\\\": 1775, \\\"y\\\": 15 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(110, 110, 110);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, Helvetica, Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\";font-size:13px;font-style:normal;font-weight:400;line-height:13px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(110, 110, 110);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"tt-for-149:224;a\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 35, \\\"class\\\": \\\"headerTrigger tooltip-trigger uiTooltip\\\", \\\"color\\\": \\\"6E6E6EFF\\\", \\\"content\\\": \\\"Setup\\\", \\\"data-aura-class\\\": \\\"uiTooltip\\\", \\\"data-aura-rendered-by\\\": \\\"155:224;a\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, Helvetica, Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\"\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"155:224;a\\\", \\\"left\\\": 1775, \\\"line-height\\\": \\\"13\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 1795, \\\"tabindex\\\": \\\"-1\\\", \\\"tagName\\\": \\\"div\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(110, 110, 110)\\\", \\\"top\\\": 15, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"15610\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='155:224;a']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"iconName\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"utility:setup\"},\"name\":\"iconName\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.lightning-icon\"}},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_16(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose Content is Setup located at position 4 - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B7118F4914E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B7118F4914E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2824,\"isWeb\":false,\"description\":\"Think <i>2,824<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>Content<\\/b> is <b>Setup<\\/b> located at position 4\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B7118F4914E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Setup\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:15;left:1775;bottom:35;right:1795\\\", \\\"Geometry\\\": { \\\"height\\\": 20, \\\"width\\\": 20, \\\"x\\\": 1775, \\\"y\\\": 15 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(116, 116, 116);font-family:-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, Helvetica, Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\";font-size:13px;font-style:normal;font-weight:400;line-height:13px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:center;text-decoration:none solid rgb(116, 116, 116);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"tt-for-149:224;a\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 35, \\\"class\\\": \\\"headerTrigger activated tooltip-trigger uiTooltip\\\", \\\"color\\\": \\\"747474FF\\\", \\\"content\\\": \\\"Setup\\\", \\\"data-aura-class\\\": \\\"uiTooltip\\\", \\\"data-aura-rendered-by\\\": \\\"155:224;a\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"-apple-system, BlinkMacSystemFont, \\\\\\\"Segoe UI\\\\\\\", Roboto, Helvetica, Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\"\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"155:224;a\\\", \\\"left\\\": 1775, \\\"line-height\\\": \\\"13\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 1795, \\\"tabindex\\\": \\\"-1\\\", \\\"tagName\\\": \\\"div\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(116, 116, 116)\\\", \\\"top\\\": 15, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"16467\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='155:224;a']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"4\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_17(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Span element whose Content is Home - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B7122806A4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B7122806A4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":4656,\"isWeb\":false,\"description\":\"Think <i>4,656<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Span element<\\/b> whose <b>Content<\\/b> is <b>Home<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B7122806A4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Home\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:58;left:144;bottom:78;right:178\\\", \\\"Geometry\\\": { \\\"height\\\": 19, \\\"width\\\": 34, \\\"x\\\": 144, \\\"y\\\": 58 }, \\\"bottom\\\": 78, \\\"class\\\": \\\"slds-truncate\\\", \\\"content\\\": \\\"Home\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 144, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"span\\\", \\\"right\\\": 178, \\\"tagName\\\": \\\"span\\\", \\\"top\\\": 58, \\\"visible\\\": false, \\\"xpath\\\": \\\"17510\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.span\"}}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_18(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B712926130E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B712926130E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Salesforce/dropdown box.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
