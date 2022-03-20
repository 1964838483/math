//获得基础题目
function createRan () {
	let f=['+','-','x','÷']
	let num1=getRan(1,100);
	let num2=getRan(1,100);
	let oper=getRan(0,3);
	let res;
	// console.log(oper);
	if(f[oper]==='+'){
		res=num1+num2;
	}else if(f[oper]==='-'){
		res=num1-num2;
	}else if(f[oper]==='x'){
		res=num1*num2;
	}else if(f[oper]==='÷'){
		res=num1/num2;
		res=res.toFixed(2);
	}
	// console.log(num1,num2,f[oper])
	// console.log(num1+f[oper]+num2+'=?','str')
	console.log(num1+f[oper]+num2+'=?',res,'res')
	return {
		str: num1+f[oper]+num2+'=?',
		res
	};
}
//获得进阶题目
function createRan1(){
	let arg1 = getRan(1, 100);
	let arg2 = getRan(1, 100);
	let arg3 = getRan(1, 100);
	let operator1 = getOperator(getRan(1, 4)); //运算符
	let operator2 = getOperator(getRan(1, 4))
	let str;
	let res;
	if (operator1 === operator2 && (operator1 === ' + ' || operator1 === ' * ')) {
	    str = `${arg1}${operator1}${arg2}${operator2}${arg3}`;
	} else {
	    if (getRan(1, 2) === 1) {
	        str = `(${arg1}${operator1}${arg2})${operator2}${arg3}`;
	    } else {
	        str = `${arg1}${operator1}(${arg2}${operator2}${arg3})`;
	    }
	}
	
	res = getRes(arg1,arg2,arg3,operator1,operator2,str);
	return {
		str,
		res
	};
}


// 获取随机数
function getRan(a,b){
	return Math.round(Math.random() * (b - a) + a);
}

//获得结果
function getRes(arg1,arg2,arg3,operator1,operator2,testStr) {
    let res;
    let a;
    if(testStr.indexOf('(') === 0){
        a = calRes(arg1,arg2,operator1)
        console.log(a,'111');
        res = calRes(a,arg3,operator2)
    }else{
        a = calRes(arg2,arg3,operator2)
        console.log(a,'222');
        res = calRes(arg1,a,operator1)
    }
    return res
}

//获取操作字符
function getOperator(arg) {
    let operator
    if (arg === 1) {
        operator = ' + '
    } else if (arg === 2) {
        operator = ' - '
    } else if (arg === 3) {
        operator = ' * '
    } else if (arg === 4) {
        operator = ' / '
    }
    return operator
}

/* 
    计算两个操作数 一个运算符号的结果
*/
function calRes(arg1,arg2,oper){
    let res;
    // console.log(arg1,arg2,oper,'555');
    if (oper === ' + ') {
        res = arg1 + arg2
    } else if (oper === ' - ') {
        res = arg1 - arg2
    } else if (oper === ' * ') {
        res = (arg1 * arg2)
    } else if (oper === ' / ') {
        res = (arg1 / arg2).toFixed(2);
    }
    // console.log(res,'555');
    return res;
}