/**
 * 
 */
function validateAdd(){
	var id=document.getElementById("id").value;
	if(id==null || id==""){
		alert("menu id field is empty");
		return false;
	}
	var name=document.getElementById("name").value;
	if(name==null || name==""){
		alert("name field is empty");
		return false;
	}else if(!isNaN(name)){
		alert("name field is numerical");
		return false;
	}
	return true;
}