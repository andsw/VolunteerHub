document.addEventListener('DOMContentLoaded', function() {
    // Fetch the host data from the server
    fetch('/api/hostProfile')
        .then(response => response.json())
        .then(data => {
            populateProfile(data);
        })
        .catch(error => {
            console.error('Error fetching host profile data:', error);
            alert('Failed to load host profile data.');
        });
});

function populateProfile(profile) {
    // Profile Header
    const profileImageElement = document.querySelector('.profileHeader img');
    profileImageElement.src = profile.profileImage || 'path/to/default/profile_image.jpg';
    profileImageElement.alt = `${profile.name}'s profile image`;

    document.querySelector('.profileHeader h2').textContent = profile.name;
    document.querySelector('.profileHeader p:nth-of-type(1)').textContent = `Location: ${profile.location}`;
    document.querySelector('.profileHeader p:nth-of-type(2)').textContent = `Contact: ${profile.email}`;

    // Biography
    document.querySelector('.profileBio p').textContent = profile.bio || 'No biography available';

    // Experience
    document.querySelector('.profileExperience p').textContent = profile.experience || 'No experience details available';

    // Involvement with Volunteer Hub
    document.querySelector('.profileVolunteerHub p:nth-of-type(1)').textContent = `Associated with Volunteer Hub since: ${profile.associatedSince}`;
    document.querySelector('.profileVolunteerHub p:nth-of-type(2)').textContent = `Favorite Aspect: ${profile.favoriteAspect}`;
    document.querySelector('.profileVolunteerHub p:nth-of-type(3)').textContent = `Started on: ${profile.startDate}`;

    // Upcoming Activities
    const upcomingActivitiesList = document.querySelector('.profileActivities ul:nth-of-type(1)');
    upcomingActivitiesList.innerHTML = '';
    profile.upcomingActivities.forEach(activity => {
        const li = document.createElement('li');
        li.textContent = `${activity.name} - ${activity.date}: ${activity.details}`;
        upcomingActivitiesList.appendChild(li);
    });

    // Past Activities
    const pastActivitiesList = document.querySelector('.profileActivities ul:nth-of-type(2)');
    pastActivitiesList.innerHTML = '';
    profile.pastActivities.forEach(activity => {
        const li = document.createElement('li');
        li.textContent = `${activity.name} - ${activity.date}: ${activity.feedback}`;
        pastActivitiesList.appendChild(li);
    });

    // Testimonials
    const testimonialsList = document.querySelector('.profileTestimonials ul');
    testimonialsList.innerHTML = '';
    profile.testimonials.forEach(testimonial => {
        const li = document.createElement('li');
        li.textContent = `${testimonial.feedback} - ${testimonial.volunteerName}`;
        testimonialsList.appendChild(li);
    });

    // Media Gallery
    const gallery = document.querySelector('.profileGallery .gallery');
    gallery.innerHTML = '';
    profile.galleryImages.forEach(image => {
        const img = document.createElement('img');
        img.src = image;
        img.alt = 'Event Image';
        gallery.appendChild(img);
    });

    // Social Media Links
    const socialMedia = document.querySelector('.profileSocialMedia');
    socialMedia.innerHTML = `
        <a href="${profile.linkedin || '#'}">LinkedIn</a> |
        <a href="${profile.twitter || '#'}">Twitter</a> |
        <a href="${profile.facebook || '#'}">Facebook</a> |
        <a href="${profile.instagram || '#'}">Instagram</a>
    `;

    // Achievements
    const achievementsList = document.querySelector('.profileAchievements ul');
    achievementsList.innerHTML = '';
    profile.achievements.forEach(achievement => {
        const li = document.createElement('li');
        li.textContent = achievement;
        achievementsList.appendChild(li);
    });

    // Upcoming Events
    document.querySelector('.profileEvents p').textContent = 'Calendar view with reminders...'; // Customize as needed

    // Blog/Articles
    const blogList = document.querySelector('.profileEngagement ul');
    blogList.innerHTML = '';
    profile.articles.forEach(article => {
        const li = document.createElement('li');
        li.textContent = `${article.title} - ${article.date}`;
        blogList.appendChild(li);
    });
}
