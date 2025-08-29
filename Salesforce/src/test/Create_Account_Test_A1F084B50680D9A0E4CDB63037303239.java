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

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
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
public class Create_Account_Test_A1F084B50680D9A0E4CDB63037303239 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(6);
	private DataVar[] vars = new DataVar[3];
	
    
    
	
	public Create_Account_Test_A1F084B50680D9A0E4CDB63037303239(IContainer container, String invocationId) {
		super(container, "Create Account", invocationId, "A1F084B50680D9A0E4CDB63037303239", "/Salesforce/Create Account.testsuite", "C:/Users/stuart.walker/HCL/devopstest/workspace/Salesforce/Create Account.testsuite");
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
	
	
	        	this.add(datapool_1(this));
	this.add(datapool_2(this));
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
	this.add(applicationContext_19(this));
	this.add(applicationContext_20(this));
	this.add(applicationContext_21(this));
	this.add(applicationContext_22(this));
	this.add(applicationContext_23(this));
	this.add(applicationContext_24(this));
	this.add(applicationContext_25(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Create_Account_Test_A1F084B50680D9A0E4CDB63037303239 ",e);
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
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "Accounts.csv", "A1F084BD9F1208D0E4CDB63037303239", false);
		Datapool dp = new Datapool(
				 "/L1NhbGVzZm9yY2UvQWNjb3VudHMuY3N2.csv",
				 "C:\\Users\\stuart.walker\\HCL\\devopstest\\workspace\\Salesforce\\Accounts.csv",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("accountname", dcVars[0], false);
dp.addHarvestInstruction("country", dcVars[1], false);
dp.addHarvestInstruction("streetaddress", dcVars[2], false);
dp.addHarvestInstruction("postalcode", dcVars[3], false);
dp.addHarvestInstruction("phone", dcVars[4], false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}


	private DatapoolAction datapool_2(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "salesforce logins.csv", "A1F084BE4F6C5DC0E4CDB63037303239", false);
		Datapool dp = new Datapool(
				 "/L1NhbGVzZm9yY2Uvc2FsZXNmb3JjZSBsb2dpbnMuY3N2.csv",
				 "C:\\Users\\stuart.walker\\HCL\\devopstest\\workspace\\Salesforce\\salesforce logins.csv",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("password", dcVars[5], false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F084B50680D9BEE4CDB63037303239");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("password", "", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("accountname", "", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B506867EF0E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1F084B506867EF0E4CDB63037303239\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Email field whose Label is Username - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50688F006E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Email field<\\/b> whose <b>Label<\\/b> is <b>Username<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50688F006E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username\"},\"name\":\"label\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:361;left:309;bottom:404;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 361 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 404, \\\"class\\\": \\\"input r4 wide mb16 mt8 username\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"username\\\", \\\"label\\\": \\\"Username\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputemail\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 361, \\\"type\\\": \\\"email\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"66\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='username']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputemail\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'stuart.walker651@agentforce.com' in Email field whose Label is Username - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B5068DAAF2E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B5068DAAF2E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1413,\"isWeb\":false,\"description\":\"Think <i>1,413<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>stuart.walker651@agentforce.com<\\/b>' in <b>Email field<\\/b> whose <b>Label<\\/b> is <b>Username<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B5068DAAF2E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"stuart.walker651@agentforce.com\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Username\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:361;left:309;bottom:404;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 361 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 404, \\\"class\\\": \\\"input r4 wide mb16 mt8 username\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"username\\\", \\\"label\\\": \\\"Username\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"username\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputemail\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 361, \\\"type\\\": \\\"email\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"96\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='username']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputemail\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Password field whose Label is Password - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B506901BFCE4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B506901BFCE4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2063,\"isWeb\":false,\"description\":\"Think <i>2,063<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B506901BFCE4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:443;left:309;bottom:486;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 443 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"aria-required\\\": \\\"true\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 486, \\\"class\\\": \\\"input r4 wide mb16 mt8 password\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"password\\\", \\\"label\\\": \\\"Password\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"pw\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 443, \\\"type\\\": \\\"password\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"160\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='password']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'password' in Password field whose Label is Password - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50694D6E2E4CDB63037303239",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"password\",\"key\":\"MOEB_FIELD\\/TPM:A1F084B5069B1867E4CDB63037303239\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50694D6E2E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1090,\"isWeb\":false,\"description\":\"Think <i>1,090<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1F084B5069B1867E4CDB63037303239\\\">password<\\/subst><\\/b>' in <b>Password field<\\/b> whose <b>Label<\\/b> is <b>Password<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50694D6E2E4CDB63037303239\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1F084B5069B1867E4CDB63037303239\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"password\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Password\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:443;left:309;bottom:486;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 443 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:16px;margin-left:0px;margin-right:0px;margin-top:8px;opacity:1;padding-bottom:12px;padding-left:12px;padding-right:12px;padding-top:12px;text-align:start;text-decoration:none solid rgb(0, 0, 0);visibility:visible;z-index:auto;\\\", \\\"aria-describedby\\\": \\\"error\\\", \\\"aria-required\\\": \\\"true\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 486, \\\"class\\\": \\\"input r4 wide mb16 mt8 password\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"password\\\", \\\"label\\\": \\\"Password\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 16, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 8, \\\"name\\\": \\\"pw\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputpassword\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(0, 0, 0)\\\", \\\"top\\\": 443, \\\"type\\\": \\\"password\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"190\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='password']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputpassword\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1F084B5069B1867E4CDB63037303239", 0, 8, false, (IDCCoreVar)dcVars[5], false, "password", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Submit button whose Content is Log In - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B5069C77F4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B5069C77F4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":3262,\"isWeb\":false,\"description\":\"Think <i>3,262<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Submit button<\\/b> whose <b>Content<\\/b> is <b>Log In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B5069C77F4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Log In\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:502;left:309;bottom:545;right:647\\\", \\\"Geometry\\\": { \\\"height\\\": 43, \\\"width\\\": 338, \\\"x\\\": 309, \\\"y\\\": 502 }, \\\"Style$array$\\\": \\\"background-color:rgb(0, 95, 178);background-repeat:repeat;color:rgb(255, 255, 255);font-family:SFS, Arial, sans-serif;font-size:13px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:12px;padding-left:24px;padding-right:24px;padding-top:12px;text-align:center;text-decoration:none solid rgb(255, 255, 255);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"005FB2FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 545, \\\"class\\\": \\\"button r4 wide primary\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Log In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"SFS, Arial, sans-serif\\\", \\\"font-size\\\": 13, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"Login\\\", \\\"left\\\": 309, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"name\\\": \\\"Login\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 12, \\\"padding-left\\\": 24, \\\"padding-right\\\": 24, \\\"padding-top\\\": 12, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"inputsubmit\\\", \\\"right\\\": 647, \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(255, 255, 255)\\\", \\\"top\\\": 502, \\\"type\\\": \\\"submit\\\", \\\"value\\\": \\\"Log In\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"251\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/input[@id='Login']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputsubmit\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is View Accounts - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B506A2B984E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B506A2B984E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":9244,\"isWeb\":false,\"description\":\"Think <i>9,244<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>View Accounts<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B506A2B984E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"View Accounts\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:454;left:657;bottom:492;right:775\\\", \\\"Geometry\\\": { \\\"height\\\": 38, \\\"width\\\": 117, \\\"x\\\": 657, \\\"y\\\": 454 }, \\\"bottom\\\": 492, \\\"class\\\": \\\"slds-card__footer-action viewMoreLink\\\", \\\"content\\\": \\\"View Accounts\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 657, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 775, \\\"tabindex\\\": \\\"0\\\", \\\"tagName\\\": \\\"a\\\", \\\"top\\\": 454, \\\"visible\\\": false, \\\"xpath\\\": \\\"1044\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose Content is New - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B506CE5D64E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B506CE5D64E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":3833,\"isWeb\":false,\"description\":\"Think <i>3,833<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>Content<\\/b> is <b>New<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B506CE5D64E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:125;left:1660;bottom:155;right:1686\\\", \\\"Geometry\\\": { \\\"height\\\": 30, \\\"width\\\": 25, \\\"x\\\": 1660, \\\"y\\\": 125 }, \\\"bottom\\\": 155, \\\"content\\\": \\\"New\\\", \\\"data-aura-rendered-by\\\": \\\"1061:0\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 1660, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 1686, \\\"tagName\\\": \\\"div\\\", \\\"title\\\": \\\"New\\\", \\\"top\\\": 125, \\\"visible\\\": false, \\\"xpath\\\": \\\"1811\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is *Account Name - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B506FD83B4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B506FD83B4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":3362,\"isWeb\":false,\"description\":\"Think <i>3,362<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>*Account Name<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B506FD83B4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"*Account Name\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:278;left:578;bottom:310;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 278 }, \\\"aria-describedby\\\": \\\"help-message-337\\\", \\\"bottom\\\": 310, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-337\\\", \\\"label\\\": \\\"*Account Name\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"255\\\", \\\"name\\\": \\\"Name\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 278, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"3043\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'accountname' in Edit text whose Label is *Account Name - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B5074C8E14E4CDB63037303239",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"accountname\",\"key\":\"MOEB_FIELD\\/TPM:A1F084B5079B4A57E4CDB63037303239\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B5074C8E14E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2667,\"isWeb\":false,\"description\":\"Think <i>2,667<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1F084B5079B4A57E4CDB63037303239\\\">accountname<\\/subst><\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>*Account Name<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B5074C8E14E4CDB63037303239\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1F084B5079B4A57E4CDB63037303239\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"accountname\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"*Account Name\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:278;left:578;bottom:310;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 278 }, \\\"aria-describedby\\\": \\\"help-message-337\\\", \\\"bottom\\\": 310, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-337\\\", \\\"label\\\": \\\"*Account Name\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"255\\\", \\\"name\\\": \\\"Name\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 278, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"4596\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TPM:A1F084B5079B4A57E4CDB63037303239", 0, 11, false, (IDCCoreVar)dcVars[0], false, "accountname", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is Phone - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B5079DBB54E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B5079DBB54E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":4826,\"isWeb\":false,\"description\":\"Think <i>4,826<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Phone<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B5079DBB54E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Phone\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:278;left:964;bottom:310;right:1319\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 964, \\\"y\\\": 278 }, \\\"aria-describedby\\\": \\\"help-message-340\\\", \\\"bottom\\\": 310, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-340\\\", \\\"label\\\": \\\"Phone\\\", \\\"left\\\": 964, \\\"maxlength\\\": \\\"40\\\", \\\"name\\\": \\\"Phone\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1319, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 278, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"7729\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'phone' in Edit text whose Label is Phone - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B507EF5DC4E4CDB63037303239",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"phone\",\"key\":\"MOEB_FIELD\\/TPM:A1F084B5083D2FA7E4CDB63037303239\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B507EF5DC4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1170,\"isWeb\":false,\"description\":\"Think <i>1,170<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1F084B5083D2FA7E4CDB63037303239\\\">phone<\\/subst><\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Phone<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B507EF5DC4E4CDB63037303239\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1F084B5083D2FA7E4CDB63037303239\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"phone\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Phone\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:278;left:964;bottom:310;right:1319\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 964, \\\"y\\\": 278 }, \\\"aria-describedby\\\": \\\"help-message-340\\\", \\\"bottom\\\": 310, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-340\\\", \\\"label\\\": \\\"Phone\\\", \\\"left\\\": 964, \\\"maxlength\\\": \\\"40\\\", \\\"name\\\": \\\"Phone\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 1319, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 278, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"9288\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_3 = new DataSub();
		stepBatch.addDataSub(subContainer_3);
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TPM:A1F084B5083D2FA7E4CDB63037303239", 0, 5, false, (IDCCoreVar)dcVars[4], false, "phone", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Name is country located at position 1 - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B508443484E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B508443484E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":4346,\"isWeb\":false,\"description\":\"Think <i>4,346<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Name<\\/b> is <b>country<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B508443484E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"name\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"country\"},\"name\":\"name\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:503;left:582;bottom:535;right:928\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 346, \\\"x\\\": 582, \\\"y\\\": 503 }, \\\"aria-autocomplete\\\": \\\"list\\\", \\\"aria-controls\\\": \\\"dropdown-element-409\\\", \\\"aria-disabled\\\": \\\"false\\\", \\\"aria-expanded\\\": \\\"false\\\", \\\"aria-haspopup\\\": \\\"listbox\\\", \\\"aria-label\\\": \\\"Billing Country\\\", \\\"aria-readonly\\\": \\\"false\\\", \\\"autocomplete\\\": \\\"country\\\", \\\"bottom\\\": 535, \\\"class\\\": \\\"slds-combobox__input slds-input slds-combobox__input-value\\\", \\\"content\\\": \\\"--None--\\\", \\\"data-value\\\": \\\"--None--\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"combobox-input-409\\\", \\\"left\\\": 582, \\\"name\\\": \\\"country\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 928, \\\"role\\\": \\\"combobox\\\", \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 503, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"12680\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_14(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on SFL Combo Item whose Content is country - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50899CE94E4CDB63037303239",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"country\",\"key\":\"MOEB_FIELD\\/IDB:A1F084B76C08E810E4CDB63037303239\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50899CE94E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":7933,\"isWeb\":false,\"description\":\"Think <i>7,933<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>SFL Combo Item<\\/b> whose <b>Content<\\/b> is <b><subst key=\\\"MOEB_FIELD\\/IDB:A1F084B76C08E810E4CDB63037303239\\\">country<\\/subst><\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50899CE94E4CDB63037303239\",\"substitutionParameters\":[{\"name\":\"content\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1F084B76C08E810E4CDB63037303239\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"country\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"$ref\":\"3\"},\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:877;left:583;bottom:911;right:912\\\", \\\"Geometry\\\": { \\\"height\\\": 34, \\\"width\\\": 329, \\\"x\\\": 583, \\\"y\\\": 877 }, \\\"aria-checked\\\": \\\"false\\\", \\\"aria-selected\\\": \\\"false\\\", \\\"bottom\\\": 911, \\\"class\\\": \\\"slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain slds-has-focus\\\", \\\"content\\\": \\\"United Kingdom\\\", \\\"data-item-id\\\": \\\"combobox-input-409-223\\\", \\\"data-value\\\": \\\"GB\\\", \\\"domainName\\\": \\\"sfl\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"exportparts\\\": \\\"option\\\", \\\"id\\\": \\\"combobox-input-409-223-409\\\", \\\"left\\\": 583, \\\"proxyClass\\\": \\\"SFLBaseComboboxItem\\\", \\\"proxyName\\\": \\\"lightning-base-combobox-item\\\", \\\"right\\\": 912, \\\"role\\\": \\\"option\\\", \\\"tagName\\\": \\\"lightning-base-combobox-item\\\", \\\"top\\\": 877, \\\"visible\\\": false, \\\"xpath\\\": \\\"15157\\\" }\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.lightning-base-combobox-item\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_4 = new DataSub();
		stepBatch.addDataSub(subContainer_4);
	ISubRule sub_3 = new SubRule("MOEB_FIELD/IDB:A1F084B76C08E810E4CDB63037303239", 0, 7, false, (IDCCoreVar)dcVars[1], false, "country", null, 0, false);
	subContainer_4.addSubInstruction(sub_3);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_15(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Text area whose Autocomplete is street-address located at position 1 - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B5092370F4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B5092370F4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2065,\"isWeb\":false,\"description\":\"Think <i>2,065<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Text area<\\/b> whose <b>Autocomplete<\\/b> is <b>street-address<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B5092370F4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"autocomplete\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"street-address\"},\"name\":\"autocomplete\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:560;left:578;bottom:617;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 57, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 560 }, \\\"autocomplete\\\": \\\"street-address\\\", \\\"bottom\\\": 617, \\\"class\\\": \\\"slds-textarea\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-412\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"255\\\", \\\"name\\\": \\\"street\\\", \\\"part\\\": \\\"textarea\\\", \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"textarea\\\", \\\"top\\\": 560, \\\"visible\\\": false, \\\"xpath\\\": \\\"16790\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_16(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'streetaddress' in Text area whose Autocomplete is street-address located at position 1 - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50980FA44E4CDB63037303239",
												  "{\"variables\":[{\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"streetaddress\",\"key\":\"MOEB_FIELD\\/TPM:A1F084B509CF1A56E4CDB63037303239\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50980FA44E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1295,\"isWeb\":false,\"description\":\"Think <i>1,295<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1F084B509CF1A56E4CDB63037303239\\\">streetaddress<\\/subst><\\/b>' in <b>Text area<\\/b> whose <b>Autocomplete<\\/b> is <b>street-address<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50980FA44E4CDB63037303239\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1F084B509CF1A56E4CDB63037303239\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"streetaddress\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"autocomplete\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"street-address\"},\"name\":\"autocomplete\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:560;left:578;bottom:617;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 57, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 560 }, \\\"autocomplete\\\": \\\"street-address\\\", \\\"bottom\\\": 617, \\\"class\\\": \\\"slds-textarea\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-412\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"255\\\", \\\"name\\\": \\\"street\\\", \\\"part\\\": \\\"textarea\\\", \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"textarea\\\", \\\"top\\\": 560, \\\"visible\\\": false, \\\"xpath\\\": \\\"18361\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_5 = new DataSub();
		stepBatch.addDataSub(subContainer_5);
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TPM:A1F084B509CF1A56E4CDB63037303239", 0, 13, false, (IDCCoreVar)dcVars[2], false, "streetaddress", null, 0, false);
	subContainer_5.addSubInstruction(sub_4);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_17(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is Billing City - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B509D49884E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B509D49884E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":3334,\"isWeb\":false,\"description\":\"Think <i>3,334<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Billing City<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B509D49884E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Billing City\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:659;left:578;bottom:691;right:811\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 233, \\\"x\\\": 578, \\\"y\\\": 659 }, \\\"aria-describedby\\\": \\\"help-message-414\\\", \\\"autocomplete\\\": \\\"address-level2\\\", \\\"bottom\\\": 691, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-414\\\", \\\"label\\\": \\\"Billing City\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"40\\\", \\\"name\\\": \\\"city\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 811, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 659, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"21509\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_18(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'London' in Edit text whose Label is Billing City - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50A263AF4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50A263AF4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1002,\"isWeb\":false,\"description\":\"Think <i>1,002<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>London<\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Billing City<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50A263AF4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"London\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Billing City\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:659;left:578;bottom:691;right:811\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 233, \\\"x\\\": 578, \\\"y\\\": 659 }, \\\"aria-describedby\\\": \\\"help-message-414\\\", \\\"autocomplete\\\": \\\"address-level2\\\", \\\"bottom\\\": 691, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-414\\\", \\\"label\\\": \\\"Billing City\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"40\\\", \\\"name\\\": \\\"city\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 811, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 659, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"23080\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_19(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Edit text whose Label is Billing Zip/Postal Code - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50A7AC394E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50A7AC394E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1504,\"isWeb\":false,\"description\":\"Think <i>1,504<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Billing Zip\\/Postal Code<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50A7AC394E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Billing Zip\\/Postal Code\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:718;left:578;bottom:750;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 718 }, \\\"aria-describedby\\\": \\\"help-message-421\\\", \\\"autocomplete\\\": \\\"postal-code\\\", \\\"bottom\\\": 750, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-421\\\", \\\"label\\\": \\\"Billing Zip\\\\\\/Postal Code\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"20\\\", \\\"name\\\": \\\"postalCode\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 718, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"26253\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_20(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'postalcode' in Edit text whose Label is Billing Zip/Postal Code - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50ACB5494E4CDB63037303239",
												  "{\"variables\":[{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"postalcode\",\"key\":\"MOEB_FIELD\\/TPM:A1F084B50B15A407E4CDB63037303239\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50ACB5494E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":1632,\"isWeb\":false,\"description\":\"Think <i>1,632<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b><subst key=\\\"MOEB_FIELD\\/TPM:A1F084B50B15A407E4CDB63037303239\\\">postalcode<\\/subst><\\/b>' in <b>Edit text<\\/b> whose <b>Label<\\/b> is <b>Billing Zip\\/Postal Code<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50ACB5494E4CDB63037303239\",\"substitutionParameters\":[{\"name\":\"newtext\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1F084B50B15A407E4CDB63037303239\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"postalcode\"}],\"isWeb\":true,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"$ref\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Billing Zip\\/Postal Code\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:718;left:578;bottom:750;right:932\\\", \\\"Geometry\\\": { \\\"height\\\": 32, \\\"width\\\": 354, \\\"x\\\": 578, \\\"y\\\": 718 }, \\\"aria-describedby\\\": \\\"help-message-421\\\", \\\"autocomplete\\\": \\\"postal-code\\\", \\\"bottom\\\": 750, \\\"class\\\": \\\"slds-input\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"id\\\": \\\"input-421\\\", \\\"label\\\": \\\"Billing Zip\\\\\\/Postal Code\\\", \\\"left\\\": 578, \\\"maxlength\\\": \\\"20\\\", \\\"name\\\": \\\"postalCode\\\", \\\"part\\\": \\\"input\\\", \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 932, \\\"tagName\\\": \\\"input\\\", \\\"top\\\": 718, \\\"type\\\": \\\"text\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"27824\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");
		IDataSub subContainer_6 = new DataSub();
		stepBatch.addDataSub(subContainer_6);
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TPM:A1F084B50B15A407E4CDB63037303239", 0, 10, false, (IDCCoreVar)dcVars[3], false, "postalcode", null, 0, false);
	subContainer_6.addSubInstruction(sub_5);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_21(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Save - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50B17EDF4E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50B17EDF4E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":6003,\"isWeb\":false,\"description\":\"Think <i>6,003<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Save<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50B17EDF4E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Save\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:906;left:1018;bottom:937;right:1077\\\", \\\"Geometry\\\": { \\\"height\\\": 31, \\\"width\\\": 58, \\\"x\\\": 1018, \\\"y\\\": 906 }, \\\"aria-disabled\\\": \\\"false\\\", \\\"bottom\\\": 937, \\\"class\\\": \\\"slds-button slds-button_brand\\\", \\\"content\\\": \\\"Save\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"kx-scope\\\": \\\"button-brand\\\", \\\"kx-type\\\": \\\"ripple\\\", \\\"left\\\": 1018, \\\"name\\\": \\\"SaveEdit\\\", \\\"part\\\": \\\"button\\\", \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1077, \\\"tagName\\\": \\\"button\\\", \\\"top\\\": 906, \\\"type\\\": \\\"button\\\", \\\"visible\\\": false, \\\"xpath\\\": \\\"31279\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_22(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Span element whose Content is Home - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50B64FC84E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50B64FC84E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":6244,\"isWeb\":false,\"description\":\"Think <i>6,244<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Span element<\\/b> whose <b>Content<\\/b> is <b>Home<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50B64FC84E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Home\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:58;left:144;bottom:78;right:178\\\", \\\"Geometry\\\": { \\\"height\\\": 19, \\\"width\\\": 34, \\\"x\\\": 144, \\\"y\\\": 58 }, \\\"bottom\\\": 78, \\\"class\\\": \\\"slds-truncate\\\", \\\"content\\\": \\\"Home\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 144, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"span\\\", \\\"right\\\": 178, \\\"tagName\\\": \\\"span\\\", \\\"top\\\": 58, \\\"visible\\\": false, \\\"xpath\\\": \\\"31486\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.span\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_23(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is View Accounts - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50B99A114E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50B99A114E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":2690,\"isWeb\":false,\"description\":\"Think <i>2,690<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>View Accounts<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50B99A114E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"View Accounts\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:454;left:657;bottom:492;right:775\\\", \\\"Geometry\\\": { \\\"height\\\": 38, \\\"width\\\": 117, \\\"x\\\": 657, \\\"y\\\": 454 }, \\\"bottom\\\": 492, \\\"class\\\": \\\"slds-card__footer-action viewMoreLink\\\", \\\"content\\\": \\\"View Accounts\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 657, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 775, \\\"tabindex\\\": \\\"0\\\", \\\"tagName\\\": \\\"a\\\", \\\"top\\\": 454, \\\"visible\\\": false, \\\"xpath\\\": \\\"32888\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_24(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Span element whose Content is Home - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50BBFEDD2E4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F084B50BBFEDD2E4CDB63037303239\",\"preferredThinktime\":0,\"thinktime\":6684,\"isWeb\":false,\"description\":\"Think <i>6,684<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Span element<\\/b> whose <b>Content<\\/b> is <b>Home<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50BBFEDD2E4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Home\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:58;left:144;bottom:78;right:178\\\", \\\"Geometry\\\": { \\\"height\\\": 19, \\\"width\\\": 34, \\\"x\\\": 144, \\\"y\\\": 58 }, \\\"bottom\\\": 78, \\\"class\\\": \\\"slds-truncate\\\", \\\"content\\\": \\\"Home\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"left\\\": 144, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"span\\\", \\\"right\\\": 178, \\\"tagName\\\": \\\"span\\\", \\\"top\\\": 58, \\\"visible\\\": false, \\\"xpath\\\": \\\"33396\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.span\"}}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_25(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - orgfarm-6c8dad11eb-dev-ed.develop.my.salesforce.com",
												  "A1F084B50BEBDFCEE4CDB63037303239",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"e2b4fdc3-d3f4-470e-ab5c-70b6941f9d34\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F084B50BEBDFCEE4CDB63037303239\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Salesforce/Create Account.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
