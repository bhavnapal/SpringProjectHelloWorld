package in.mindgate.recdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.mindgate.recdev.bo.JobDecBo;
import in.mindgate.recdev.bo.Result;
import in.mindgate.recdev.service.IJobDecService;

@RestController
@RequestMapping("/jobDesc")
public class JobDecRestController {

	@Autowired
	private IJobDecService service;

	public void setService(IJobDecService service) {
		this.service = service;
	}

	@PostMapping(value = "/addJobDecReq")
	public Result addJobDecReq(@RequestBody JobDecBo bo) {
		System.out.println("in con");
		service.addJobDecReq(bo);
		System.out.println(bo);

		return new Result("0", "success");

	}
	
	
	@RequestMapping(value = "/getJobRequestListHome", method = RequestMethod.GET)
	public List<JobDecBo> getJobReqListHome() {
		return service.getJobRequestListHome();
	}
	

	@RequestMapping(value = "/getJobRequestList", method = RequestMethod.GET)
	public List<JobDecBo> getJobReqList() {
		return service.getJobRequestList();
	}

	@RequestMapping(value = "/getJobRequestList/{id}", method = RequestMethod.GET)
	public JobDecBo getJobRequestList(@PathVariable("id") int id) {
		return service.getJobRequestList(id);
	}

	@RequestMapping(value = "/updateJobRequestListId/{id}", method = RequestMethod.POST)
	public Result updateProductById(@PathVariable("id") int id, @RequestBody JobDecBo bo) {
		service.updateJobRequestListId(id, bo);
		return new Result("0", "success");
	}

	@RequestMapping(value = "/deleteJobRequestListId/{id}", method = RequestMethod.DELETE)
	public Result deleteProductById(@PathVariable("id") int id) {
		service.deleteJobRequestListId(id);
		;
		return new Result("0", "success");

	}

}
