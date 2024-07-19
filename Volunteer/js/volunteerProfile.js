document.addEventListener('DOMContentLoaded', () => {
    // Fetch the volunteer profile data from the backend API
    fetch('/api/volunteer/profile', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            // Include any authentication tokens if required
            // 'Authorization': 'Bearer your_token'
        },
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        // Handle the data received from the server
        displayProfile(data);
    })
    .catch(error => {
        console.error('Error fetching volunteer profile data:', error);
        document.querySelector('.container').innerHTML = '<p>Error loading profile data. Please try again later.</p>';
    });
});

function displayProfile(data) {
    // Extract data from the response
    const profile = data.profile;

    // Profile Header (excluding the image)
    document.querySelector('.profileHeader h2').textContent = profile.name || 'Name not available';
    document.querySelector('.profileHeader p:nth-of-type(1)').textContent = `Location: ${profile.location || 'Location not available'}`;
    document.querySelector('.profileHeader p:nth-of-type(2)').textContent = `Contact: ${profile.email || 'Email not available'}`;

    // Biography
    document.querySelector('.profileBio p').textContent = profile.bio || 'Biography not available';

    // Skills and Interests
    document.querySelector('.profileSkills p').textContent = profile.skills || 'Skills not available';

    // Volunteer Experience
    const experienceList = document.querySelector('.profileExperience ul');
    experienceList.innerHTML = ''; // Clear existing items
    profile.experience.forEach(exp => {
        const li = document.createElement('li');
        li.textContent = `${exp.name} - ${exp.details || 'Details not available'}`;
        experienceList.appendChild(li);
    });

    // Involvement with Volunteer Hub
    document.querySelector('.profileVolunteerHub p:nth-of-type(1)').textContent = `Joined Volunteer Hub on: ${profile.join_date || 'Join date not available'}`;
    document.querySelector('.profileVolunteerHub p:nth-of-type(2)').textContent = `Favorite Activities: ${profile.favorite_activities || 'Favorite activities not available'}`;

    // Volunteering Activities
    const volunteeringList = document.querySelector('.profileVolunteering ul');
    volunteeringList.innerHTML = ''; // Clear existing items
    profile.volunteering.forEach(activity => {
        const li = document.createElement('li');
        li.textContent = `${activity.name} - ${activity.details || 'Details not available'}`;
        volunteeringList.appendChild(li);
    });

    // Feedback and Endorsements
    const feedbackList = document.querySelector('.profileFeedback ul');
    feedbackList.innerHTML = ''; // Clear existing items
    profile.feedback.forEach(fb => {
        const li = document.createElement('li');
        li.textContent = `${fb.comment} - ${fb.host_name || 'Host name not available'}`;
        feedbackList.appendChild(li);
    });

    // Media Gallery
    const gallery = document.querySelector('.profileGallery .gallery');
    gallery.innerHTML = ''; // Clear existing items
    profile.gallery_images.forEach(image => {
        const img = document.createElement('img');
        img.src = image || '../image/default_gallery.jpg';
        img.alt = 'Gallery Image';
        gallery.appendChild(img);
    });

    // Social Media Links
    const socialMediaLinks = document.querySelector('.profileSocialMedia');
    socialMediaLinks.innerHTML = `
        <a href="${profile.linkedin || '#'}">LinkedIn</a> |
        <a href="${profile.twitter || '#'}">Twitter</a> |
        <a href="${profile.facebook || '#'}">Facebook</a> |
        <a href="${profile.instagram || '#'}">Instagram</a>
    `;

    // Achievements
    const achievementsList = document.querySelector('.profileAchievements ul');
    achievementsList.innerHTML = ''; // Clear existing items
    profile.achievements.forEach(achievement => {
        const li = document.createElement('li');
        li.textContent = achievement || 'Achievement not available';
        achievementsList.appendChild(li);
    });

    // Blog/Articles
    const blogList = document.querySelector('.profileEngagement ul');
    blogList.innerHTML = ''; // Clear existing items
    profile.articles.forEach(article => {
        const li = document.createElement('li');
        li.textContent = `${article.title} - ${article.date || 'Date not available'}`;
        blogList.appendChild(li);
    });
}
