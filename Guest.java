//Sample code for Guest Login


class Guest{

String guestname;
String guesttype;
String usertype;
Guest(){}
Guest( String guestname, String guesttype, string usertype){
if(usertype.equals("superuser") || usertype.equals("admin"){
this.guestname = guestname;
this.guesttype = guesttype;
}
}
}
