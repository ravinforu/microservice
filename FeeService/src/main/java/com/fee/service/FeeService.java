package com.fee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fee.bean.Fee;

@Service
public class FeeService {
	List<Fee> fee_al=new ArrayList<Fee>();
	
	public FeeService(){
		fee_al.add(new Fee(1,1000));
		fee_al.add(new Fee(2,2000));
	}
	
	public List<Fee> getAllFees(){
		System.out.println("GetAllFee="+fee_al);
			return fee_al;
	}
	
	public Fee getFees(int idParam){
		Fee fee=null;
		boolean flag=false;
		for(int i=0;i<fee_al.size();i++){
			fee=fee_al.get(i);
			if(fee.getCourseId()==idParam){
				flag=true;
				break;
			}
		}
		if(flag==false) {
			fee=new Fee();
		}
		System.out.println("GetFee="+fee);

		return fee;
		}
}