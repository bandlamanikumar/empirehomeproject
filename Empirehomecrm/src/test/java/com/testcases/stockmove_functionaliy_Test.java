package com.testcases;

import javax.annotation.Tainted;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.StockmoveFunctionality;

public class stockmove_functionaliy_Test extends Basetest {

	Loginfunctionality log;
	StockmoveFunctionality move;

	public stockmove_functionaliy_Test() {

		super();

	}
@BeforeMethod
	public void setup() {

		initialization();
		log = new Loginfunctionality();
		move = new StockmoveFunctionality();

	}
@Test
	public void stockmove_verify() throws Throwable {

		log.verifylogin();
		move.verifyaddinventrypage();

	}

	public void teardown() {

	}

}
