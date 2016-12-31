package tk.liaohongdong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.liaohongdong.dao.TAdminDao;
import tk.liaohongdong.pojo.TAdmin;
import tk.liaohongdong.service.TAdminService;

@Service
public class TAdminServiceImpl implements TAdminService {
	
	@Autowired
	private TAdminDao tadminDao;
	
	public List<TAdmin> selectTadminAll() {
		List<TAdmin> selectTadminAll = tadminDao.selectTadminAll();
		return selectTadminAll;
	}

//	@Override
//	public TAdmin findById(Integer id) {
//		DateTime time = new DateTime();
//		TAdmin admin = new TAdmin();
//		admin.setId(1);
//		admin.setName("liao");
//		admin.setPwd("fdas");
//		admin.setHeadImg("321asdf");
//		admin.setLastLoginTime(time.toString());
//		admin.setUpdateTime(time.toString());
//		admin.setCreateTime(time.toString());
//		return admin;
//	}

}
