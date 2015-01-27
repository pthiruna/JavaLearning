package com.prakash.algo.fwk.rest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.prakash.algo.client.Index;
import com.prakash.algo.fwk.VisualTreeRenderer;
import com.prakash.algo.fwk.bean.Tree;
import com.prakash.algo.fwk.util.Utilities;


@Path("/Module")
public class ServiceResource {



	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/DisplayTree")
	public ArrayList<Tree> displayTree(@QueryParam("methodToInvoke") String methodToInvoke) {
		System.out.println ("Printing method requested >>>>>>>> "+methodToInvoke);

		Class objClass = Index.class;
		Method method = null;
		try {
			method = Index.class.getMethod(methodToInvoke);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Index objTgtFile = new Index();
		Object returnValue = null;
		try {
			 returnValue = method.invoke(objTgtFile,null);
			
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		VisualTreeRenderer objVTR = (VisualTreeRenderer) returnValue;
		return objVTR.getTrees();
		
		
	}
	
	

}