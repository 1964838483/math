function setCookie(key,value,day){
	var date =new Date();
	date.setTime(date.getTime()+day*3600*1000*24);
	var expire = "expires = " +date.toUTCString();
	document.cookie = key+"="+value+";"+expire;
	
}
function getCookie(key){
	let cookieKey = key +"=";
	let cookie=decodeURIComponent(document.cookie);
	let arr = cookie.split(";")
	for(let i =0 ;i<arr.length;i++){
		let c = arr[i].trim();
		if(c.indexOf(key)==0){
			return c.substring(key.length+1,c.length);
		}
	}
}

function loginOut(){
	name=getCookie('adminName');
	console.log(name);
	setCookie('adminName', name, -1);
	location.href='newlogin.html';
}