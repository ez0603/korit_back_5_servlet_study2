async function handleSignUpSubmit() {
	const inputs = document.querySelectorAll("input");
	
	const user = {
		username: inputs[0].value,
		password: inputs[1].value,
		name: inputs[2].value,
		email: inputs[3].value
	};
	try {
		const response = await fetch("/Product/user", {
			method: "POST",
			headers: {
				"content-Type": "application/json"
			},
			body: JSON.stringify(user)
		});
		const responseData = await response.json();
		console.log(responseData);
	} catch(error) {
		console.log(error);
	};
}