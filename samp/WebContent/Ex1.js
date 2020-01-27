function fun1()
{
	var a=document.registration.username.value;
	var b=document.registration.userid.value;
	var c=document.registration.pass.value;
	var d=document.registration.email.value;
	var e=document.registration.country.value;

	var genders = document.getElementsByName('gender');
	var f;
	for(var i = 0; i < genders.length; i++){
	if(genders[i].checked){
	f = genders[i].value;
	}
	}
	var g=document.registration.contact.value;
	var h=document.registration.pincode.value;
	var i=document.registration.language.value;
	var j=document.registration.about.value;
	alert("hi hello how are you"+a+""+b+""+c+""+d+""+e+""+f+""+g+""+h+""+i+""+j);
if(fun2(a,5,12))
	if(fun3(b,5,12))
		{
		if(countryselect(e))
{
return true;
}
		}


function fun2(a,mx,my)
{
	var userid_len=a.length;
	if(userid_len==0||userid_len>=my||userid_len<mx)
		{
alert("user id should not be empty/length be between"+mx+" to "+my);
userid.focus();
return false;
}
return true;
}



function fun3(b,mx,my)
{
var password_len=b.length;
if(password_len==0||password_len>=my||password_len<mx)
	{
alert("password should not be empty/length be between"+mx+" to "+my);
password.focus();
return false;
}
return true;
}
function countryselect(country)
{
if(e=="Default")
	{
	alert("select your country from the list");
	country.focus();
	return false;
	}
return true;
}
}
	





 
