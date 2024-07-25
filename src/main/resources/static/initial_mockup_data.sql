INSERT INTO volunteer_hub.dbo.account (username, password, avatar_link, register_time, account_type)
VALUES
('john_doe', 'password123', 'https://example.com/avatar/john_doe.jpg', '2024-01-15 10:23:45', 'volunteer'),
('jane_smith', '123', 'https://example.com/avatar/jane_smith.jpg', '2024-02-10 08:15:30', 'volunteer'),
('mike_johnson', 'basketball', 'https://example.com/avatar/mike_jordan.jpg', '2024-03-10 08:15:30', 'volunteer'),
('helping_hands', '123', 'https://example.com/avatar/o1.jpg', '2024-02-10 08:15:30', 'organization'),
('green_earth', '233', 'https://example.com/avatar/o2.jpg', '2024-02-10 08:15:30', 'organization'),
('health_for_all', '234', 'https://example.com/avatar/o3.jpg', '2024-02-10 08:15:30', 'organization'),
('admin_user', '352', 'https://example.com/avatar/admin_user.jpg', '2023-12-20 09:00:00', 'admin');
INSERT INTO volunteer_hub.dbo.volunteer (account_id, name, dob, sex, nationality, marital_status, occupation_status, phone, email, address, postcode, has_drivers_licence, skills, academic_certificate, resume_link)
VALUES
(1, 'John Doe', '1990-05-20', 'Male', 'Canadian', 'Married', 'Employed', '1234567890', 'john.doe@example.com', '123 Maple Street, Toronto, Ontario, Canada', 'M5H 2N2', 1, 'First Aid, CPR', 'Bachelors Degree', 'https://linkedin.com/in/johndoe'),
(2, 'Jane Smith', '1985-08-10', 'Female', 'Canadian', 'Single', 'Student', '0987654321', 'jane.smith@example.com', '456 Oak Avenue, Ottawa, Ontario, Canada', 'K1P 1J1', 0, 'Teaching, Public Speaking', 'Masters Degree', 'https://linkedin.com/in/janesmith'),
(3,'Mike Johnson', '1995-11-30', 'Male', 'Canadian', 'Unmarried', 'Unemployed', '1112223333', 'mike.johnson@example.com', '789 Pine Road, Vancouver, British Columbia, Canada', 'V6B 1V2', 1, 'Programming, Web Development', 'Bachelors Degree', 'https://linkedin.com/in/mikejohnson');
INSERT INTO volunteer_hub.dbo.organization (name, logo_url, phone, email, official_site_link, address, postcode)
VALUES
('Helping Hands', 'https://example.com/logo/helping_hands.jpg', '2223334444', 'contact@helpinghands.org', 'https://helpinghands.org', '101 Charity Lane, Toronto, Ontario, Canada', 'M5B 2K3'),
('Green Earth', 'https://example.com/logo/green_earth.jpg', '5556667777', 'info@greenearth.org', 'https://greenearth.org', '202 Environmental Way, Ottawa, Ontario, Canada', 'K1N 9J2'),
('Health for All', 'https://example.com/logo/health_for_all.jpg', '8889990000', 'support@healthforall.org', 'https://healthforall.org', '303 Wellness Boulevard, Vancouver, British Columbia, Canada', 'V6C 2M5');
truncate table position;
INSERT INTO position (name, min_age, max_age, ideal_for, contact_name, contact_email, event_id, recruit_num, training_detail, working_condition, accessibility, description)
VALUES
    (N'Food Bank Volunteer', 18, 65, N'individual', N'Alice Brown', N'alice.brown@example.com', 1, 10, N'Basic food handling training', N'Indoors, standing for long periods', N'Wheelchair accessible',
    N'<h3>Food Bank Volunteer Description</h3>
    <p>The Food Bank Volunteer will assist in the distribution of food to individuals and families in need. Responsibilities include:</p>
    <ul>
        <li>Organizing and packing food items for distribution.</li>
        <li>Assisting clients in selecting their food items.</li>
        <li>Ensuring that the food bank area is clean and organized.</li>
        <li>Participating in food drives and donation events.</li>
    </ul>
    <p>Volunteers must be able to lift boxes and stand for extended periods. Training will be provided.</p>'),

    (N'Logistics Coordinator', 21, 55, N'individual', N'Alice Brown', N'alice.brown@example.com', 1, 2, N'On-site training', N'Indoors, some lifting required', N'Wheelchair accessible',
    N'<h3>Logistics Coordinator Description</h3>
    <p>The Logistics Coordinator will manage the setup and breakdown of events and coordinate the movement of supplies. Responsibilities include:</p>
    <ul>
        <li>Overseeing the transportation and setup of event materials.</li>
        <li>Coordinating with vendors and volunteers to ensure smooth operations.</li>
        <li>Managing inventory and ensuring all supplies are accounted for.</li>
        <li>Addressing any logistical issues that arise during events.</li>
    </ul>
    <p>Ability to lift and carry supplies is required. On-site training will be provided.</p>'),

    (N'Tree Planting Volunteer', 16, 50, N'group', N'Bob Green', N'bob.green@example.com', 2, 20, N'On-site training', N'Outdoor, variable weather', N'Not wheelchair accessible',
    N'<h3>Tree Planting Volunteer Description</h3>
    <p>The Tree Planting Volunteer will participate in tree planting and related environmental activities. Responsibilities include:</p>
    <ul>
        <li>Planting trees and maintaining planting areas.</li>
        <li>Participating in environmental conservation efforts.</li>
        <li>Working in various weather conditions and terrains.</li>
        <li>Assisting with the organization of planting events.</li>
    </ul>
    <p>Volunteers should be prepared for outdoor work and variable weather conditions. Training will be provided.</p>'),

    (N'Event Photographer', 18, 60, N'individual', N'Bob Green', N'bob.green@example.com', 2, 1, N'Photography skills required', N'Outdoor, variable weather', N'Not wheelchair accessible',
    N'<h3>Event Photographer Description</h3>
    <p>The Event Photographer will capture high-quality images during events. Responsibilities include:</p>
    <ul>
        <li>Taking professional photos of event activities and attendees.</li>
        <li>Editing and organizing photos for post-event use.</li>
        <li>Ensuring all key moments and details are documented.</li>
        <li>Working with event coordinators to understand key photo opportunities.</li>
    </ul>
    <p>Photography skills and equipment are required. Volunteers should be comfortable working outdoors in various weather conditions.</p>'),

    (N'Health Clinic Assistant', 21, 60, N'individual', N'Charlie White', N'charlie.white@example.com', 3, 5, N'First aid certification required', N'Indoors, light lifting', N'Wheelchair accessible',
    N'<h3>Health Clinic Assistant Description</h3>
    <p>The Health Clinic Assistant will support medical staff and assist patients in a clinical setting. Responsibilities include:</p>
    <ul>
        <li>Assisting with patient intake and data entry.</li>
        <li>Helping with basic medical procedures under supervision.</li>
        <li>Ensuring the clinic environment is clean and organized.</li>
        <li>Providing support and information to patients as needed.</li>
    </ul>
    <p>First aid certification is required. Training on specific clinic procedures will be provided.</p>'),

    (N'Registration Desk Volunteer', 18, 60, N'individual', N'Charlie White', N'charlie.white@example.com', 3, 3, N'Basic training provided', N'Indoors, sitting', N'Wheelchair accessible',
    N'<h3>Registration Desk Volunteer Description</h3>
    <p>The Registration Desk Volunteer will assist with the check-in and registration of event participants. Responsibilities include:</p>
    <ul>
        <li>Greeting and registering event attendees.</li>
        <li>Providing event information and assistance as needed.</li>
        <li>Handling registration forms and payments.</li>
        <li>Maintaining an organized and efficient registration area.</li>
    </ul>
    <p>Basic training will be provided. Volunteers should be comfortable with administrative tasks and interacting with attendees.</p>'),

    (N'Soup Kitchen Helper', 18, 65, N'individual', N'Dana Black', N'dana.black@example.com', 4, 15, N'Food safety training', N'Indoors, standing for long periods', N'Wheelchair accessible',
    N'<h3>Soup Kitchen Helper Description</h3>
    <p>The Soup Kitchen Helper will assist in preparing and serving meals to those in need. Responsibilities include:</p>
    <ul>
        <li>Preparing and serving food to clients.</li>
        <li>Maintaining cleanliness and hygiene in the kitchen area.</li>
        <li>Helping with food inventory and stocking supplies.</li>
        <li>Providing a welcoming and supportive environment for clients.</li>
    </ul>
    <p>Food safety training will be provided. Volunteers should be able to stand for long periods and work in a fast-paced environment.</p>'),

    (N'Cleaning Crew', 16, 55, N'group', N'Dana Black', N'dana.black@example.com', 4, 5, N'On-site training', N'Indoors, some lifting required', N'Wheelchair accessible',
    N'<h3>Cleaning Crew Description</h3>
    <p>The Cleaning Crew will ensure that event spaces are clean and ready for use. Responsibilities include:</p>
    <ul>
        <li>Cleaning and organizing event areas before and after events.</li>
        <li>Managing waste and recycling efforts.</li>
        <li>Addressing any immediate cleaning needs during events.</li>
        <li>Following safety and hygiene protocols.</li>
    </ul>
    <p>On-site training will be provided. Volunteers should be prepared for some lifting and cleaning tasks.</p>'),

    (N'Community Outreach Volunteer', 18, 60, N'individual', N'Evan White', N'evan.white@example.com', 5, 8, N'On-site training', N'Outdoors, walking', N'Not wheelchair accessible',
    N'<h3>Community Outreach Volunteer Description</h3>
    <p>The Community Outreach Volunteer will engage with local communities to promote events and services. Responsibilities include:</p>
    <ul>
        <li>Distributing flyers and promotional materials.</li>
        <li>Engaging with community members to raise awareness.</li>
        <li>Attending community events and meetings.</li>
        <li>Providing information and answering questions about upcoming events.</li>
    </ul>
    <p>Volunteers should be comfortable walking and interacting with the public. On-site training will be provided.</p>'),

    (N'Flyer Distributor', 16, 50, N'group', N'Evan White', N'evan.white@example.com', 5, 10, N'On-site training', N'Outdoors, walking', N'Not wheelchair accessible',
    N'<h3>Flyer Distributor Description</h3>
    <p>The Flyer Distributor will distribute promotional materials to various locations. Responsibilities include:</p>
    <ul>
        <li>Delivering flyers and posters to designated areas.</li>
        <li>Ensuring materials are distributed effectively.</li>
        <li>Tracking distribution progress and reporting any issues.</li>
        <li>Working with the outreach team to ensure coverage.</li>
    </ul>
    <p>Volunteers should be prepared for outdoor work and walking. On-site training will be provided.</p>'),

    (N'Animal Shelter Assistant', 18, 60, N'individual', N'Fiona Red', N'fiona.red@example.com', 6, 6, N'On-site training', N'Indoors, some lifting required', N'Wheelchair accessible',
    N'<h3>Animal Shelter Assistant Description</h3>
    <p>The Animal Shelter Assistant will help care for animals in a shelter environment. Responsibilities include:</p>
    <ul>
        <li>Feeding and cleaning up after animals.</li>
        <li>Assisting with animal adoptions and intake procedures.</li>
        <li>Maintaining the cleanliness and safety of the shelter.</li>
        <li>Providing support to animal care staff.</li>
    </ul>
    <p>Volunteers should be comfortable with some lifting and working with animals. On-site training will be provided.</p>'),

    (N'Dog Walker', 18, 60, N'individual', N'Fiona Red', N'fiona.red@example.com', 6, 4, N'On-site training', N'Outdoors, walking', N'Not wheelchair accessible',
    N'<h3>Dog Walker Description</h3>
    <p>The Dog Walker will take dogs from the shelter on walks to ensure their exercise and well-being. Responsibilities include:</p>
    <ul>
        <li>Walking dogs in various weather conditions.</li>
        <li>Ensuring dogs are properly leashed and controlled.</li>
        <li>Observing and reporting any health or behavioral issues.</li>
        <li>Maintaining a positive and safe environment for the dogs.</li>
    </ul>
    <p>Volunteers should be comfortable with outdoor walking and handling dogs. On-site training will be provided.</p>'),

    (N'Library Assistant', 18, 65, N'individual', N'Gina Blue', N'gina.blue@example.com', 7, 3, N'Basic training provided', N'Indoors, sitting and standing', N'Wheelchair accessible',
    N'<h3>Library Assistant Description</h3>
    <p>The Library Assistant will help with the daily operations of a library. Responsibilities include:</p>
    <ul>
        <li>Assisting patrons with finding and checking out books.</li>
        <li>Reshelving books and maintaining the organization of library materials.</li>
        <li>Providing support for library programs and events.</li>
        <li>Helping with administrative tasks as needed.</li>
    </ul>
    <p>Basic training will be provided. Volunteers should be comfortable with both sitting and standing tasks.</p>'),

    (N'Story Time Reader', 16, 55, N'individual', N'Gina Blue', N'gina.blue@example.com', 7, 2, N'Public speaking skills preferred', N'Indoors, sitting', N'Wheelchair accessible',
    N'<h3>Story Time Reader Description</h3>
    <p>The Story Time Reader will read stories to children in a library setting. Responsibilities include:</p>
    <ul>
        <li>Reading stories aloud to children in an engaging manner.</li>
        <li>Preparing and organizing story time materials.</li>
        <li>Interacting with children and encouraging their participation.</li>
        <li>Maintaining a welcoming and inclusive environment for all attendees.</li>
    </ul>
    <p>Public speaking skills are preferred. Volunteers should be comfortable with sitting and reading to groups of children.</p>'),

    (N'Recycling Program Volunteer', 18, 60, N'group', N'Hank Green', N'hank.green@example.com', 8, 12, N'On-site training', N'Outdoors, variable weather', N'Not wheelchair accessible',
    N'<h3>Recycling Program Volunteer Description</h3>
    <p>The Recycling Program Volunteer will assist with recycling and waste management initiatives. Responsibilities include:</p>
    <ul>
        <li>Sorting and managing recyclable materials.</li>
        <li>Promoting recycling practices within the community.</li>
        <li>Assisting with the setup and coordination of recycling events.</li>
        <li>Educating community members on recycling procedures.</li>
    </ul>
    <p>Volunteers should be prepared for outdoor work and variable weather conditions. On-site training will be provided.</p>'),

    (N'Recycling Sorter', 18, 60, N'individual', N'Hank Green', N'hank.green@example.com', 8, 8, N'On-site training', N'Indoors, standing for long periods', N'Wheelchair accessible',
    N'<h3>Recycling Sorter Description</h3>
    <p>The Recycling Sorter will work to sort and process recyclable materials in a facility. Responsibilities include:</p>
    <ul>
        <li>Sorting various recyclable materials into appropriate categories.</li>
        <li>Maintaining cleanliness and organization in the sorting area.</li>
        <li>Operating recycling equipment as needed.</li>
        <li>Reporting any issues or concerns to supervisors.</li>
    </ul>
    <p>Volunteers should be able to stand for long periods and work in an indoor environment. On-site training will be provided.</p>'),

    (N'Festival Helper', 16, 55, N'group', N'Ivy White', N'ivy.white@example.com', 9, 20, N'On-site training', N'Outdoors, variable weather', N'Not wheelchair accessible',
    N'<h3>Festival Helper Description</h3>
    <p>The Festival Helper will assist with various tasks during community festivals. Responsibilities include:</p>
    <ul>
        <li>Assisting with event setup and teardown.</li>
        <li>Helping with crowd management and guest assistance.</li>
        <li>Supporting festival organizers with event logistics.</li>
        <li>Providing information and assistance to festival attendees.</li>
    </ul>
    <p>Volunteers should be prepared for outdoor work in variable weather conditions. On-site training will be provided.</p>'),

    (N'Ticket Seller', 18, 65, N'individual', N'Ivy White', N'ivy.white@example.com', 9, 5, N'Basic training provided', N'Outdoors, sitting', N'Wheelchair accessible',
    N'<h3>Ticket Seller Description</h3>
    <p>The Ticket Seller will handle ticket sales and customer interactions at events. Responsibilities include:</p>
    <ul>
        <li>Selling tickets to event attendees.</li>
        <li>Handling cash and credit transactions accurately.</li>
        <li>Providing information about event details and policies.</li>
        <li>Maintaining a clean and organized ticketing area.</li>
    </ul>
    <p>Basic training will be provided. Volunteers should be comfortable with sitting and handling transactions.</p>'),

    (N'Art Workshop Assistant', 18, 60, N'individual', N'Jack Black', N'jack.black@example.com', 10, 4, N'Basic art skills preferred', N'Indoors, sitting', N'Wheelchair accessible',
    N'<h3>Art Workshop Assistant Description</h3>
    <p>The Art Workshop Assistant will support art instructors and participants during workshops. Responsibilities include:</p>
    <ul>
        <li>Assisting with the setup and preparation of art materials.</li>
        <li>Helping participants with art projects and providing guidance.</li>
        <li>Maintaining a clean and organized workshop space.</li>
        <li>Supporting the instructor with workshop logistics.</li>
    </ul>
    <p>Basic art skills are preferred. Volunteers should be comfortable with indoor tasks and supporting creative activities.</p>'),

    (N'Event Coordinator', 21, 55, N'individual', N'Jack Black', N'jack.black@example.com', 10, 2, N'Event management experience required', N'Indoors, some lifting required', N'Wheelchair accessible',
    N'<h3>Event Coordinator Description</h3>
    <p>The Event Coordinator will oversee and manage event planning and execution. Responsibilities include:</p>
    <ul>
        <li>Coordinating event logistics and managing schedules.</li>
        <li>Overseeing staff and volunteer activities during events.</li>
        <li>Handling any issues or emergencies that arise.</li>
        <li>Ensuring the event runs smoothly and meets all objectives.</li>
    </ul>
    <p>Event management experience is required. Volunteers should be prepared for some lifting and indoor work.</p>');
truncate table volunteer_hub.dbo.event;
INSERT INTO volunteer_hub.dbo.event (title, subtitle, desc_img_links, description, required_skill_tags, organization_id, venue, event_start_time, event_end_time, last_edit_time, create_time, likes_num, collections_num, reviews_num, reviews_json)
VALUES
('Annual Food Drive', 'Help feed the community', 'https://example.com/images/food_drive1.jpg,https://example.com/images/food_drive2.jpg', '<p>Join us for our annual food drive to help feed those in need. We will be collecting non-perishable food items and distributing them to local shelters. Your participation can make a significant difference in our community. <strong>Event Details:</strong><br><ul><li><strong>Date:</strong> November 1, 2024</li><li><strong>Time:</strong> 09:00 AM - 05:00 PM</li><li><strong>Venue:</strong> 123 Community Center, Toronto, Ontario, Canada</li></ul></p>', 'Organization, Communication', 1, '123 Community Center, Toronto, Ontario, Canada', '2024-11-01 09:00:00', '2024-11-01 17:00:00', '2024-06-15 12:00:00', '2024-06-01 08:00:00', 100, 50, 10, '[{"volunteer_avatar_link": "https://example.com/avatar/john_doe.jpg", "volunteer_name": "John Doe", "content": "Great event!", "review_time": "2024-11-02 10:00:00", "review_likes_num": 5, "organization_reply": "Thank you!", "reply_time": "2024-11-02 12:00:00", "reply_likes_num": 2}]'),
('Community Tree Planting', 'Plant trees in the local park', 'https://example.com/images/tree_planting1.jpg,https://example.com/images/tree_planting2.jpg', '<p>Help us plant trees in the local park to improve the environment. We will provide all the necessary tools and instructions. <strong>Event Details:</strong><br><ul><li><strong>Date:</strong> September 10, 2024</li><li><strong>Time:</strong> 08:00 AM - 04:00 PM</li><li><strong>Venue:</strong> 456 Local Park, Ottawa, Ontario, Canada</li></ul></p>', 'Gardening, Teamwork', 2, '456 Local Park, Ottawa, Ontario, Canada', '2024-09-10 08:00:00', '2024-09-10 16:00:00', '2024-07-20 14:00:00', '2024-07-01 09:00:00', 75, 30, 5, '[{"volunteer_avatar_link": "https://example.com/avatar/jane_smith.jpg", "volunteer_name": "Jane Smith", "content": "Loved helping out!", "review_time": "2024-09-11 11:00:00", "review_likes_num": 3, "organization_reply": "We appreciate it!", "reply_time": "2024-09-11 13:00:00", "reply_likes_num": 1}]'),
('Free Health Clinic', 'Providing free health services', 'https://example.com/images/health_clinic1.jpg,https://example.com/images/health_clinic2.jpg', 'Volunteer at our free health clinic to assist with various tasks.', 'Medical, Organizational', 3, '789 Health Center, Vancouver, British Columbia, Canada', '2024-10-15 08:00:00', '2024-10-15 18:00:00', '2024-07-10 10:00:00', '2024-07-05 09:00:00', 50, 20, 8, '[{"volunteer_avatar_link": "https://example.com/avatar/mike_johnson.jpg", "volunteer_name": "Mike Johnson", "content": "Very rewarding experience!", "review_time": "2024-10-16 12:00:00", "review_likes_num": 4, "organization_reply": "Thank you for your help!", "reply_time": "2024-10-16 14:00:00", "reply_likes_num": 2}]'),
('Soup Kitchen Service', 'Serve meals to the homeless', 'https://example.com/images/soup_kitchen1.jpg,https://example.com/images/soup_kitchen2.jpg', 'Assist in serving meals at our soup kitchen.', 'Food Service, Teamwork', 4, '101 Shelter Avenue, Toronto, Ontario, Canada', '2024-08-20 11:00:00', '2024-08-20 15:00:00', '2024-06-25 11:00:00', '2024-06-15 08:00:00', 85, 40, 12, '[{"volunteer_avatar_link": "https://example.com/avatar/jane_smith.jpg", "volunteer_name": "Jane Smith", "content": "Enjoyed helping out!", "review_time": "2024-08-21 10:00:00", "review_likes_num": 3, "organization_reply": "We appreciate your support!", "reply_time": "2024-08-21 12:00:00", "reply_likes_num": 1}]'),
('Community Outreach', 'Help spread awareness', 'https://example.com/images/community_outreach1.jpg,https://example.com/images/community_outreach2.jpg', 'Join our team in spreading awareness about our cause.', 'Communication, Public Speaking', 5, '202 Outreach Street, Ottawa, Ontario, Canada', '2024-09-25 10:00:00', '2024-09-25 14:00:00', '2024-07-15 12:00:00', '2024-07-01 08:00:00', 65, 30, 7, '[{"volunteer_avatar_link": "https://example.com/avatar/john_doe.jpg", "volunteer_name": "John Doe", "content": "Great experience!", "review_time": "2024-09-26 11:00:00", "review_likes_num": 2, "organization_reply": "Thank you for your help!", "reply_time": "2024-09-26 13:00:00", "reply_likes_num": 1}]'),
('Animal Shelter Day', 'Assist at the animal shelter', 'https://example.com/images/animal_shelter1.jpg,https://example.com/images/animal_shelter2.jpg', 'Help out at the animal shelter with various tasks.', 'Animal Care, Organizational', 6, '303 Shelter Road, Vancouver, British Columbia, Canada', '2024-08-30 09:00:00', '2024-08-30 17:00:00', '2024-07-05 10:00:00', '2024-06-20 09:00:00', 70, 25, 6, '[{"volunteer_avatar_link": "https://example.com/avatar/mike_johnson.jpg", "volunteer_name": "Mike Johnson", "content": "Loved working with the animals!", "review_time": "2024-08-31 10:00:00", "review_likes_num": 4, "organization_reply": "We appreciate your help!", "reply_time": "2024-08-31 12:00:00", "reply_likes_num": 2}]'),
('Library Assistance', 'Help with library tasks', 'https://example.com/images/library1.jpg,https://example.com/images/library2.jpg', 'Assist with various tasks at the local library.', 'Organizational, Customer Service', 7, '404 Library Lane, Toronto, Ontario, Canada', '2024-10-05 09:00:00', '2024-10-05 15:00:00', '2024-08-01 12:00:00', '2024-07-01 08:00:00', 55, 20, 4, '[{"volunteer_avatar_link": "https://example.com/avatar/jane_smith.jpg", "volunteer_name": "Jane Smith", "content": "Enjoyed helping out!", "review_time": "2024-10-06 10:00:00", "review_likes_num": 2, "organization_reply": "Thank you for your support!", "reply_time": "2024-10-06 12:00:00", "reply_likes_num": 1}]'),
('Recycling Program', 'Assist with recycling efforts', 'https://example.com/images/recycling1.jpg,https://example.com/images/recycling2.jpg', 'Help us with our recycling program to promote sustainability.', 'Environmental, Organizational', 8, '505 Green Street, Ottawa, Ontario, Canada', '2024-11-15 09:00:00', '2024-11-15 17:00:00', '2024-09-01 12:00:00', '2024-08-01 08:00:00', 40, 15, 5, '[{"volunteer_avatar_link": "https://example.com/avatar/mike_johnson.jpg", "volunteer_name": "Mike Johnson", "content": "Great initiative!", "review_time": "2024-11-16 10:00:00", "review_likes_num": 3, "organization_reply": "We appreciate your help!", "reply_time": "2024-11-16 12:00:00", "reply_likes_num": 1}]'),
('Community Festival', 'Help organize the community festival', 'https://example.com/images/festival1.jpg,https://example.com/images/festival2.jpg', 'Assist in organizing and running the community festival.', 'Organizational, Customer Service', 9, '606 Festival Road, Vancouver, British Columbia, Canada', '2024-12-01 09:00:00', '2024-12-01 18:00:00', '2024-09-20 14:00:00', '2024-09-01 09:00:00', 90, 35, 8, '[{"volunteer_avatar_link": "https://example.com/avatar/jane_smith.jpg", "volunteer_name": "Jane Smith", "content": "Had a great time!", "review_time": "2024-12-02 11:00:00", "review_likes_num": 4, "organization_reply": "Thank you for your support!", "reply_time": "2024-12-02 13:00:00", "reply_likes_num": 2}]'),
('Art Workshop', 'Assist with art workshops', 'https://example.com/images/art_workshop1.jpg,https://example.com/images/art_workshop2.jpg', 'Help organize and run art workshops for the community.', 'Artistic, Organizational', 10, '707 Art Lane, Toronto, Ontario, Canada', '2024-11-20 10:00:00', '2024-11-20 16:00:00', '2024-09-25 12:00:00', '2024-09-01 08:00:00', 50, 20, 6, '[{"volunteer_avatar_link": "https://example.com/avatar/john_doe.jpg", "volunteer_name": "John Doe", "content": "Loved the art activities!", "review_time": "2024-11-21 10:00:00", "review_likes_num": 3, "organization_reply": "Thank you for your help!", "reply_time": "2024-11-21 12:00:00", "reply_likes_num": 1}]');
INSERT INTO volunteer_hub.dbo.participation_record (event_id, position_id, volunteer_id, participation_time, present, arrive_time, leave_time)
VALUES
(1, 1, 1, '2024-11-01 09:00:00', 1, '2024-11-01 08:45:00', '2024-11-01 17:15:00'),
(1, 2, 1, '2024-11-01 09:00:00', 1, '2024-11-01 08:50:00', '2024-11-01 17:10:00'),
(2, 3, 2, '2024-09-10 08:00:00', 1, '2024-09-10 07:50:00', '2024-09-10 16:10:00'),
(2, 4, 2, '2024-09-10 08:00:00', 1, '2024-09-10 07:55:00', '2024-09-10 16:05:00'),
(3, 5, 3, '2024-10-15 08:00:00', 1, '2024-10-15 07:45:00', '2024-10-15 18:15:00'),
(3, 6, 3, '2024-10-15 08:00:00', 1, '2024-10-15 07:50:00', '2024-10-15 18:10:00'),
(4, 7, 4, '2024-08-20 11:00:00', 1, '2024-08-20 10:45:00', '2024-08-20 15:15:00'),
(4, 8, 4, '2024-08-20 11:00:00', 1, '2024-08-20 10:50:00', '2024-08-20 15:10:00'),
(5, 9, 5, '2024-09-25 10:00:00', 1, '2024-09-25 09:45:00', '2024-09-25 14:15:00'),
(5, 10, 5, '2024-09-25 10:00:00', 1, '2024-09-25 09:50:00', '2024-09-25 14:10:00'),
(6, 11, 6, '2024-08-30 09:00:00', 1, '2024-08-30 08:45:00', '2024-08-30 17:15:00'),
(6, 12, 6, '2024-08-30 09:00:00', 1, '2024-08-30 08:50:00', '2024-08-30 17:10:00'),
(7, 13, 7, '2024-10-05 09:00:00', 1, '2024-10-05 08:45:00', '2024-10-05 15:15:00'),
(7, 14, 7, '2024-10-05 09:00:00', 1, '2024-10-05 08:50:00', '2024-10-05 15:10:00'),
(8, 15, 8, '2024-11-15 09:00:00', 1, '2024-11-15 08:45:00', '2024-11-15 17:15:00'),
(8, 16, 8, '2024-11-15 09:00:00', 1, '2024-11-15 08:50:00', '2024-11-15 17:10:00'),
(9, 17, 9, '2024-12-01 09:00:00', 1, '2024-12-01 08:45:00', '2024-12-01 18:15:00'),
(9, 18, 9, '2024-12-01 09:00:00', 1, '2024-12-01 08:50:00', '2024-12-01 18:10:00'),
(10, 19, 10, '2024-11-20 10:00:00', 1, '2024-11-20 09:45:00', '2024-11-20 16:15:00'),
(10, 20, 10, '2024-11-20 10:00:00', 1, '2024-11-20 09:50:00', '2024-11-20 16:10:00');
