package com.ibmfinalpresentation.Prescription.model;

public class Prescription
{
	private String doctorId;
	private String patientId;
	private String medicines;
	
	
	@Override
	public String toString() {
		return "Prescription [doctorId=" + doctorId + ", patientId=" + patientId + ", medicines=" + medicines + "]";
	}
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prescription(String doctorId, String patientId, String medicines) {
		super();
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.medicines = medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getMedicines() {
		return medicines;
	}
	
}