package com.cxr.service;

import java.util.List;

import com.cxr.bean.PbAdmin;
import com.cxr.bean.PbAdminLog;

public interface LoginService {

	List<PbAdminLog> getListLog(PbAdminLog log);

}
