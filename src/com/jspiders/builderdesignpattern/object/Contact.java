package com.jspiders.builderdesignpattern.object;

public class Contact {
String first_name;
String middle_name;
String last_name;
String nick_name;
String email;
long mobile_no;
long landline_no;
String dob;
String company;
String address;
String gender;

public Contact(String first_name, String middle_name, String last_name, String nick_name, String email, long mobile_no,
		long landline_no, String dob, String company, String address, String gender) {
	super();
	this.first_name = first_name;
	this.middle_name = middle_name;
	this.last_name = last_name;
	this.nick_name = nick_name;
	this.email = email;
	this.mobile_no = mobile_no;
	this.landline_no = landline_no;
	this.dob = dob;
	this.company = company;
	this.address = address;
	this.gender = gender;
}

@Override
public String toString() {
	return "Contact"+ "[first_name=" + first_name + ",\nmiddle_name=" + middle_name + ",\nlast_name=" + last_name
			+ ", \nnick_name=" + nick_name + ", \nemail=" + email + ", \nmobile_no=" + mobile_no + ", \nlandline_no="
			+ landline_no + ", \ndob=" + dob + ", \ncompany=" + company + ", \naddress=" + address + ", \ngender=" + gender
			+ "\n]";
}



}
