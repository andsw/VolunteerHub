document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    fetchData('/account/login', 'POST', { username, password }, (data) => {
        if (data.success) {
            // Set username in cookie
            document.cookie = `username=${username}; path=/`;
    
            alert('Login successful');
            // Redirect to home page
            window.location.href = '/home';
        } else {
            alert(data.message); // Display error message from backend
        }
    });
})