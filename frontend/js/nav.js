// Check if the login flag cookie is set

const loginFlag = getCookie('loginFlag');
if (loginFlag === 'true') {
    document.querySelector('a[href="/login"]').style.display = 'none';

    // Show avatar
    const avatar = document.createElement('img');
    avatar.src = '../static/image/avatar.png'; // Path to your avatar image
    avatar.alt = 'Avatar';
    avatar.style.width = '50px'; // Adjust size as needed
    avatar.style.height = '50px';
    avatar.style.borderRadius = '50%';
    avatar.style.backgroundColor = 'white';
    avatar.style.marginTop = "-18px"
    avatar.style.marginRight = "23px"
    document.getElementsByClassName("nav-links")[0].appendChild(avatar);
}