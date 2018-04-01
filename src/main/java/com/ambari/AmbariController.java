package com.ambari;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SuppressWarnings("deprecation")
public class AmbariController {
	
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpSession session;
	
	//hadoop
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startHadoop")
	@ResponseBody
	public String startHadoop(){
		String scriptPath = request.getRealPath(File.separator) + "script/hadoop-cluster.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopHadoop")
	@ResponseBody
	public String stopHadoop(){
		String scriptPath = request.getRealPath(File.separator) + "script/hadoop-cluster.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//zookeeper
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startZookeeper")
	@ResponseBody
	public String startZookeeper(){
		String scriptPath = request.getRealPath(File.separator) + "script/zookeeper-cluster.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopZookeeper")
	@ResponseBody
	public String stopZookeeper(){
		String scriptPath = request.getRealPath(File.separator) + "script/zookeeper-cluster.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//hbase
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startHBase")
	@ResponseBody
	public String startHBase(){
		String scriptPath = request.getRealPath(File.separator) + "script/hbase-cluster.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopHBase")
	@ResponseBody
	public String stopHBase(){
		String scriptPath = request.getRealPath(File.separator) + "script/hbase-cluster.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//spark
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startSpark")
	@ResponseBody
	public String startSpark(){
		String scriptPath = request.getRealPath(File.separator) + "script/spark-cluster.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopSpark")
	@ResponseBody
	public String stopSpark(){
		String scriptPath = request.getRealPath(File.separator) + "script/spark-cluster.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//hive-metastore
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startHiveMetastore")
	@ResponseBody
	public String startHiveMetastore(){
		String scriptPath = request.getRealPath(File.separator) + "script/hive-metastore.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopHiveMetastore")
	@ResponseBody
	public String stopHiveMetastore(){
		String scriptPath = request.getRealPath(File.separator) + "script/hive-metastore.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//hbase-thirft
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startHBaseThrift")
	@ResponseBody
	public String startHBaseThrift(){
		String scriptPath = request.getRealPath(File.separator) + "script/hbase-thrift.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopHBaseThrift")
	@ResponseBody
	public String stopHBaseThrift(){
		String scriptPath = request.getRealPath(File.separator) + "script/hbase-thrift.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//hue
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startHue")
	@ResponseBody
	public String startHue(){
		String scriptPath = request.getRealPath(File.separator) + "script/hue-manager.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopHue")
	@ResponseBody
	public String stopHue(){
		String scriptPath = request.getRealPath(File.separator) + "script/hue-manager.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	//kafka
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/startKafka")
	@ResponseBody
	public String startKafka(){
		String scriptPath = request.getRealPath(File.separator) + "script/kafka-cluster.sh start";
		return CommonUtils.executeScript(scriptPath);
	}
	
	@RequestMapping("/stopKafka")
	@ResponseBody
	public String stopKafka(){
		String scriptPath = request.getRealPath(File.separator) + "script/kafka-cluster.sh stop";
		return CommonUtils.executeScript(scriptPath);
	}
	//-------------------------------------------------------------------------------------------//
	
	//shell command
	//-------------------------------------------------------------------------------------------//
	@RequestMapping("/executeCommand")
	@ResponseBody
	public String executeCommand(@RequestParam("command") String command){
		return CommonUtils.executeShellCommand(command);
	}
	
}
