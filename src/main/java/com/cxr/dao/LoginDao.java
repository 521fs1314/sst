package com.cxr.dao;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;

import com.cxr.bean.PbAdminLog;

public interface LoginDao  extends Repository<PbAdminLog, Long>{


	/*List<PbAdmin> findAll(Specification<PbAdmin> specification);*/

	List<PbAdminLog> findAll(Specification<PbAdminLog> specification);
	
	
}
