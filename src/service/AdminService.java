package service;
import domain.MemberBean;
import domain.PatientBean;
import domain.DoctorBean;
import domain.NurseBean;
public interface AdminService {
	public String getBmi(PatientBean pat);
	//비지니스 로직 = DB 데이터와 일치
		//qurey 문에 들어가는 키워드는 사용하지 마라.
		/**
		* CREATE : INSERT
		*
		*/
		public void regist(MemberBean member);  //regist해라 MemberBean 을
		
		/**
		* READ : SELECT
		*
		*/
		// read one
		// read some
		// read all
		// read special
		public MemberBean findById(MemberBean member); 
		public MemberBean[] findByName(MemberBean member); 
		public DoctorBean[] dotctorlist();
		public NurseBean[] nurselist();
		
		public int docCount();
		public int nurCount();
		/**
		* UPDATE : UPDATE
		*
		*/
		public void change(MemberBean member); //change해라 MemberBean을
		/**
		* DELETE : DELETE
		*
		*/
		public void remove(MemberBean member); //remove해라 id을 넣어서 
		// util
		// validation
		public boolean exist(MemberBean member);
		public int countByName(MemberBean member); //이름을 카운트 이름 숫자 (랭스를 정해줘야 배열을 불러올수있다.)
		
		
	}

