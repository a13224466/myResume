package tk.liaohongdong.service;

import java.util.List;

import tk.liaohongdong.pojo.TAdmin;

public interface TAdminService {

	List<TAdmin> findAll(TAdmin admin);
	
	TAdmin findById(Integer id);
}
