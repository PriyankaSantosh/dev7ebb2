package Overall;

import PatientManagement.Crossmatch;
import PatientManagement.CrossmatchWithExpired;
import PatientManagement.CrossmatchmismachBlood;
import PatientManagement.NameBlank;
import PatientManagement.createPatient;

public class Adding {
	public static void main(String[] args) throws InterruptedException {
		
		createPatient cr =new createPatient();
		cr.createPatient();
		Crossmatch cro=new Crossmatch();
		cro.Crossmatch();
		CrossmatchmismachBlood cros=new CrossmatchmismachBlood();
		cros.CrossmatchmismachBlood();
		CrossmatchWithExpired crossmatch=new CrossmatchWithExpired();
		 crossmatch.CrossmatchWithExpired();
		 NameBlank name=new NameBlank();
		 name.NameBlank();
		
}
}