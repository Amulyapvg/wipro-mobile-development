document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    let username = document.getElementById('username').value;
    let password = document.getElementById('password').value;
    let email = document.getElementById('email').value;
    let errorMessage = document.getElementById('error-message');

    // Reset the error message
    errorMessage.textContent = '';

    // Validate the username to contain only characters
    if (!validateUsername(username)) {
        errorMessage.textContent = 'Username should contain only letters.';
        return;
    }

    if (!validateEmail(email)) {
        errorMessage.textContent = 'Please enter a valid email address.';
        return;
    }

    // Check if the password is correct (for demo purposes, the correct password is "password123")
    if (password !== '123') {
        errorMessage.textContent = 'Wrong password. Please try again.';
        return;
    }

    // Redirect to myapp.html on successful login
    window.location.href = 'index.html';
});

function validateEmail(email) {
    const re = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    return re.test(email);
}

function validateUsername(username) {
    const re = /^[a-zA-Z]+$/;
    return re.test(username);
}