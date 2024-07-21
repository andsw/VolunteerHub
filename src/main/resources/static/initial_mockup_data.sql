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
INSERT INTO volunteer_hub.dbo.position (name, min_age, max_age, ideal_for, contact_name, contact_email, event_id, recruit_num, training_detail, working_condition, accessibility)
VALUES
('Food Bank Volunteer', 18, 65, 'individual', 'Alice Brown', 'alice.brown@example.com', 1, 10, 'Basic food handling training', 'Indoors, standing for long periods', 'Wheelchair accessible'),
('Logistics Coordinator', 21, 55, 'individual', 'Alice Brown', 'alice.brown@example.com', 1, 2, 'On-site training', 'Indoors, some lifting required', 'Wheelchair accessible'),
('Tree Planting Volunteer', 16, 50, 'group', 'Bob Green', 'bob.green@example.com', 2, 20, 'On-site training', 'Outdoor, variable weather', 'Not wheelchair accessible'),
('Event Photographer', 18, 60, 'individual', 'Bob Green', 'bob.green@example.com', 2, 1, 'Photography skills required', 'Outdoor, variable weather', 'Not wheelchair accessible'),
('Health Clinic Assistant', 21, 60, 'individual', 'Charlie White', 'charlie.white@example.com', 3, 5, 'First aid certification required', 'Indoors, light lifting', 'Wheelchair accessible'),
('Registration Desk Volunteer', 18, 60, 'individual', 'Charlie White', 'charlie.white@example.com', 3, 3, 'Basic training provided', 'Indoors, sitting', 'Wheelchair accessible'),
('Soup Kitchen Helper', 18, 65, 'individual', 'Dana Black', 'dana.black@example.com', 4, 15, 'Food safety training', 'Indoors, standing for long periods', 'Wheelchair accessible'),
('Cleaning Crew', 16, 55, 'group', 'Dana Black', 'dana.black@example.com', 4, 5, 'On-site training', 'Indoors, some lifting required', 'Wheelchair accessible'),
('Community Outreach Volunteer', 18, 60, 'individual', 'Evan White', 'evan.white@example.com', 5, 8, 'On-site training', 'Outdoors, walking', 'Not wheelchair accessible'),
('Flyer Distributor', 16, 50, 'group', 'Evan White', 'evan.white@example.com', 5, 10, 'On-site training', 'Outdoors, walking', 'Not wheelchair accessible'),
('Animal Shelter Assistant', 18, 60, 'individual', 'Fiona Red', 'fiona.red@example.com', 6, 6, 'On-site training', 'Indoors, some lifting required', 'Wheelchair accessible'),
('Dog Walker', 18, 60, 'individual', 'Fiona Red', 'fiona.red@example.com', 6, 4, 'On-site training', 'Outdoors, walking', 'Not wheelchair accessible'),
('Library Assistant', 18, 65, 'individual', 'Gina Blue', 'gina.blue@example.com', 7, 3, 'Basic training provided', 'Indoors, sitting and standing', 'Wheelchair accessible'),
('Story Time Reader', 16, 55, 'individual', 'Gina Blue', 'gina.blue@example.com', 7, 2, 'Public speaking skills preferred', 'Indoors, sitting', 'Wheelchair accessible'),
('Recycling Program Volunteer', 18, 60, 'group', 'Hank Green', 'hank.green@example.com', 8, 12, 'On-site training', 'Outdoors, variable weather', 'Not wheelchair accessible'),
('Recycling Sorter', 18, 60, 'individual', 'Hank Green', 'hank.green@example.com', 8, 8, 'On-site training', 'Indoors, standing for long periods', 'Wheelchair accessible'),
('Festival Helper', 16, 55, 'group', 'Ivy White', 'ivy.white@example.com', 9, 20, 'On-site training', 'Outdoors, variable weather', 'Not wheelchair accessible'),
('Ticket Seller', 18, 65, 'individual', 'Ivy White', 'ivy.white@example.com', 9, 5, 'Basic training provided', 'Outdoors, sitting', 'Wheelchair accessible'),
('Art Workshop Assistant', 18, 60, 'individual', 'Jack Black', 'jack.black@example.com', 10, 4, 'Basic art skills preferred', 'Indoors, sitting', 'Wheelchair accessible'),
('Event Coordinator', 21, 55, 'individual', 'Jack Black', 'jack.black@example.com', 10, 2, 'Event management experience required', 'Indoors, some lifting required', 'Wheelchair accessible');
INSERT INTO volunteer_hub.dbo.event (title, subtitle, desc_img_links, description, required_skill_tags, organization_id, venue, event_start_time, event_end_time, last_edit_time, create_time, likes_num, collections_num, reviews_num, reviews_json)
VALUES
('Annual Food Drive', 'Help feed the community', 'https://example.com/images/food_drive1.jpg,https://example.com/images/food_drive2.jpg', 'Join us for our annual food drive to help feed those in need.', 'Organization, Communication', 1, '123 Community Center, Toronto, Ontario, Canada', '2024-11-01 09:00:00', '2024-11-01 17:00:00', '2024-06-15 12:00:00', '2024-06-01 08:00:00', 100, 50, 10, '[{"volunteer_avatar_link": "https://example.com/avatar/john_doe.jpg", "volunteer_name": "John Doe", "content": "Great event!", "review_time": "2024-11-02 10:00:00", "review_likes_num": 5, "organization_reply": "Thank you!", "reply_time": "2024-11-02 12:00:00", "reply_likes_num": 2}]'),
('Community Tree Planting', 'Plant trees in the local park', 'https://example.com/images/tree_planting1.jpg,https://example.com/images/tree_planting2.jpg', 'Help us plant trees in the local park to improve the environment.', 'Gardening, Teamwork', 2, '456 Local Park, Ottawa, Ontario, Canada', '2024-09-10 08:00:00', '2024-09-10 16:00:00', '2024-07-20 14:00:00', '2024-07-01 09:00:00', 75, 30, 5, '[{"volunteer_avatar_link": "https://example.com/avatar/jane_smith.jpg", "volunteer_name": "Jane Smith", "content": "Loved helping out!", "review_time": "2024-09-11 11:00:00", "review_likes_num": 3, "organization_reply": "We appreciate it!", "reply_time": "2024-09-11 13:00:00", "reply_likes_num": 1}]'),
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
