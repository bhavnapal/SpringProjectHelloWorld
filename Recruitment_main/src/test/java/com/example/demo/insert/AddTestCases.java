package com.example.demo.insert;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import in.mindgate.recdev.bo.JobDecBo;
import in.mindgate.recdev.repository.JobDecRepositoryIMPL;
import in.mindgate.recdev.service.JobDecServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class AddTestCases {

	@InjectMocks
	private JobDecServiceImpl repository;
	
	@Mock
	private JobDecRepositoryIMPL rep;
	
	@Test
	public void testAdd() {

		JobDecBo bo = new JobDecBo();
		
		// bo.setJobDescApprovedRejectDate(new Date(2018, 9, 9));
		// bo.setJobDescBudget(222);
		
		// bo.setJobDescCheckerId(1);
		// bo.setJobDescComments("xjdhfgjkchgf");
		// bo.setJobDescEmployee("sdkjfh");
		// bo.setJobDescStatus("true");
		 bo.setJobDescId(101);
		// bo.setJobDescMakerId(100);
		// bo.setJobDescNumberOfCandidates(1);
		bo.setJobDescExpectedDateOfJoining(new Date(2018, 9, 9));
		bo.setJobDescExperience(10);
		bo.setJobDescCertification("101");
		bo.setJobDescProfile("Developer");
		bo.setJobDescProject("asdfgh");
		bo.setJobDescRaisedOnDate(new Date(2018, 9, 9));
		bo.setJobDescResponsibility("ajsdksa");
		bo.setJobDescSkillsSetMandatory("asdx");
		bo.setJobDescSkillsSetOptional("asda");
		bo.setJobDesQualification("B>E>");
		
		JobDecBo data=repository.addJobDecReq(bo);
		
		Assert.assertEquals("failure","101",data.getJobDescCertification());
	}

	@Test
	public void deleteTest() {
		repository.deleteJobRequestListId(22);
		
	}

	@Test
	public void testForSelectingDataById() {
		
		JobDecBo data = repository.getJobRequestList(101);
		Assert.assertEquals("Support_engg",data.getJobDescProfile());
	}
	
}
