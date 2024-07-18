// Function to get cookie by name
function getCookie(name) {
    const value = `; ${document.cookie}`;
    const parts = value.split(`; ${name}=`);
    if (parts.length === 2) return parts.pop().split(';').shift();
}

$(document).ready(function() {
    $('#nav-section').html(`
        <nav>
            <div class="nav-content">
                <div class="logo">
                    <img src="./image/logo2.jpg" alt="Logo Image" width="150px" height="auto">
                </div>
                <div class="nav-links">
                    <a href="/home.html">Home</a>
                    <a href="/about.html">About Us</a>
                    <a href="/activity_list.html">Activities</a>
                    <a href="/contact.html">Contact Us</a>
                    <a href="/login.html">Login</a>
                </div>
            </div>
        </nav>
    `);

    $('#footer-section').html(`
        <div class="footer-content">
            <div class="quick-links">
                <a href="#">Home</a>
                <a href="#">About Us</a>
                <a href="#">Contact Us</a>
                <a href="#">Privacy Policy</a>
                <a href="#">Terms of Service</a>
            </div>
            <div class="newsletter">
                <h2>Newsletter Subscription</h2>
                <input type="email" placeholder="Your Email">
                <button>Subscribe</button>
            </div>
        </div>
        <div class="footer-bottom">
            &copy; 2024 @CopyrightVolunteerorg.com
        </div>
    `);
});
