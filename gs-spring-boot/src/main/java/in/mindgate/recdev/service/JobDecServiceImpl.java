package in.mindgate.recdev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mindgate.recdev.bo.JobDecBo;
import in.mindgate.recdev.repository.IJobDecRepository;

@Service
public class JobDecServiceImpl implements IJobDecService{
	
	@Autowired
	private IJobDecRepository repository;

	@Override
	public void addJobDecReq(JobDecBo bo) {
		// TODO Auto-generated method stub productrepository.addProduct(product);
		
		System.out.println("in service");
		repository.addJobDecReq(bo);
		System.out.println(bo);
	}

	@Override
	public List<JobDecBo> getJobRequestList() {
		return repository.getJobRequestList();
	}

	@Override
	public JobDecBo getJobRequestList(int id) {
		return repository.getJobRequestList(id);
	}

	@Override
	public void updateJobRequestListId(int id, JobDecBo bo) {
		repository.updateJobRequestListId(id, bo);
	}

	@Override
	public void deleteJobRequestListId(int id) {
		repository.deleteJobRequestListId(id);		
	}

	@Override
	public List<JobDecBo> getJobRequestListHome() {
		// TODO Auto-generated method stub
		return repository.getJobRequestListHome();
	}

}
