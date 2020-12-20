module patientmanagement {
	//Qualified exports:
	//only patientbilling can use it
	exports com.gil.pr to patientbilling;
	//cyclic error
	requires patientbiling;
}