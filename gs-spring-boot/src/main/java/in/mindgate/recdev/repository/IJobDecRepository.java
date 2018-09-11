package in.mindgate.recdev.repository;

import java.util.List;


import in.mindgate.recdev.bo.JobDecBo;

public interface IJobDecRepository {

	public void addJobDecReq(JobDecBo bo);

	public List<JobDecBo> getJobRequestList();
	
	public List<JobDecBo> getJobRequestListHome();
	
	public JobDecBo getJobRequestList(final int id);

	public void updateJobRequestListId(final int id,JobDecBo bo);
	
	public void deleteJobRequestListId(final int id);
}
