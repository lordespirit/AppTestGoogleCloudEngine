package model;

import java.util.Set;

public interface AdminServices {

	public Admin findAdmin(int adminId);
	public Set<Admin> findAllAdmin();
	
}
