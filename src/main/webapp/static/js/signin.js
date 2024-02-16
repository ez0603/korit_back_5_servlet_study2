
async function handleLoginClick() {
	const inputs = document.querySelectorAll("input");
	
	const loginUser = {
		username: inputs[0].value,
		password: inputs[1].value
	}
	
	try{
		const response = await fetch("/product/auth/signin" , {
			method: "post",
			headers: {
				"Content-Type": "application/json"
			},
			body: JSON.stringify(loginUser)
		});
		
		if(!response.ok) {
			throw await response.json();
		}
		
		alert("로그인 성공");
		location.href = "/product/home.do"; // 대입만 해줘도 get요청 됨
		
	} catch(error) {
		alert(error?.errorMessage);
	}
}