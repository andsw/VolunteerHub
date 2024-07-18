// Function to get cookie by name
function getCookie(name) {
    const value = `; ${document.cookie}`;
    const parts = value.split(`; ${name}=`);
    if (parts.length === 2) return parts.pop().split(';').shift();
}

$(document).ready(function() {
    $('#nav-section').html(`
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src="./image/logo2.jpg" alt="Logo Image" width="150" height="auto">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="/about">About Us</a></li>
                    <li class="nav-item"><a class="nav-link" href="/activity_list">Activities</a></li>
                    <li class="nav-item"><a class="nav-link" href="/contact">Contact Us</a></li>
                    <li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
                </ul>
            </div>
        </nav>
    `);

    $('#footer-section').html(`
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <ul class="list-unstyled">
                        <li><a href="#" class="text-white">Home</a></li>
                        <li><a href="#" class="text-white">About Us</a></li>
                        <li><a href="#" class="text-white">Contact Us</a></li>
                        <li><a href="#" class="text-white">Privacy Policy</a></li>
                        <li><a href="#" class="text-white">Terms of Service</a></li>
                    </ul>
                </div>
                <div class="col-md-6 text-right">
                    <h5>Newsletter Subscription</h5>
                    <form class="form-inline">
                        <div class="form-group mb-2">
                            <input type="email" class="form-control" placeholder="Your Email">
                        </div>
                        <button type="submit" class="btn btn-primary mb-2">Subscribe</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="bg-dark text-center py-3">
            &copy; 2024 @CopyrightVolunteerorg.com
        </div>
    `);
});
