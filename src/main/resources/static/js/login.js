document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    fetch(`/account/login`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password })
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            // Set username in cookie
            document.cookie = `username=${username}; path=/`;

            alert('Login successful');
            // You can redirect to another page or perform other actions upon successful login
            window.location.href = '/home'; // Redirect to home page

        } else {
            alert(data.message); // Display error message from backend
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('An error occurred while logging in');
    });
});