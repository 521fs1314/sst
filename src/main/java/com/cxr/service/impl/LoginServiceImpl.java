package com.cxr.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.cxr.bean.PbAdminLog;
import com.cxr.dao.LoginDao;
import com.cxr.service.LoginService;

/**
 * @author Administrator
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	@Override
	public List<PbAdminLog> getListLog(PbAdminLog log) {
		List<PbAdminLog> result = loginDao.findAll(method1(log));
		return result;
	}

	@SuppressWarnings("serial")
	public Specification<PbAdminLog> method1(PbAdminLog log) {
		//新建Specification
		return new Specification<PbAdminLog>() {
			@Override
			public Predicate toPredicate(Root<PbAdminLog> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				if (log.getLogId() != null) {
					predicates.add(cb.equal(root.join("admin").get("adminId"), log.getLogId()));
				}
				return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
			}

		};
	}
}
