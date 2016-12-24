package tk.liaohongdong.service.impl;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import tk.liaohongdong.pojo.TAdmin;
import tk.liaohongdong.service.TAdminService;

@Service
public class TAdminServiceImpl implements TAdminService {

	@Override
	public List<TAdmin> findAll(TAdmin admin) {

		return null;
	}

	@Override
	public TAdmin findById(Integer id) {
		DateTime time = new DateTime();
		TAdmin admin = new TAdmin();
		admin.setId(1);
		admin.setName("liao");
		admin.setPwd("fdas");
		admin.setHeadImg("321asdf");
		admin.setLastLoginTime(time.toString());
		admin.setUpdateTime(time.toString());
		admin.setCreateTime(time.toString());
		return admin;
	}

}
