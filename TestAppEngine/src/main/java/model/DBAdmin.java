package model;

import java.util.HashSet;
import java.util.Set;

public class DBAdmin implements AdminServices {

	@Override
	public Admin findAdmin(int adminId) {
		
		return getMockAdmin((int)Math.random()*100, "Example" +adminId);
	}
	
	@Override
	public Set<Admin> findAllAdmin() {
	
		int size = (int) (Math.random()*100);
		HashSet<Admin> list = new HashSet<Admin>(size);
		
		for(int i=1;i<=size;i++){
			int random = (int) (Math.random()*999);
			Admin admin = getMockAdmin(i, "Admin_0"+random);
			list.add(admin);
		}
		
		return list;
	}
	

	
	private Admin getMockAdmin(int id, String name){
		
		Admin admin = new Admin();
		admin.setName(name);
		admin.setId(id);
		
		return admin;
	}


}
