module patientbilling {
	requires patientclinicals;
	
	//Using static and cyclic dependencies
	//only available at compile time, not at runtime
	requires static patientamanagement;
}