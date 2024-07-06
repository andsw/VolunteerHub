insert into dbo.account (id, username, password, register_time, account_type)
values  (1, 'hsw', '123', '2023-01-15 00:00:00.000', 'volunteer'),
        (2, 'jane_smith', 'password456', '2023-02-20 00:00:00.000', 'volunteer'),
        (3, 'sam_brown', 'password789', '2023-03-10 00:00:00.000', 'volunteer'),
        (4, 'alice_white', 'password321', '2023-01-25 00:00:00.000', 'volunteer'),
        (5, 'mike_green', 'password654', '2023-04-05 00:00:00.000', 'volunteer'),
        (6, 'lucy_black', 'password987', '2023-05-01 00:00:00.000', 'volunteer'),
        (7, 'tom_blue', 'password147', '2023-06-10 00:00:00.000', 'volunteer'),
        (8, 'sara_gray', 'password258', '2023-07-15 00:00:00.000', 'volunteer'),
        (9, 'chris_yellow', 'password369', '2023-08-20 00:00:00.000', 'volunteer'),
        (10, 'kate_purple', 'password753', '2023-09-30 00:00:00.000', 'volunteer'),
        (11, 'Shaowen He', '123', '2024-07-05 17:01:11.920', 'volunteer'),
        (12, 'asdf', '123', '2024-07-05 17:11:49.267', 'volunteer'),
        (13, 'Shaowen', '123', '2024-07-05 22:36:52.747', 'volunteer');

INSERT INTO dbo.activities_review (activity_id, activity_title, rate, volunteer_id, volunteer_username)
VALUES
(1, 'Beach Cleanup', 5, 1, 'john_doe'),
(2, 'Food Drive', 4, 2, 'jane_smith'),
(1, 'Beach Cleanup', 5, 3, 'sam_brown'),
(3, 'Tree Planting', 4, 4, 'alice_white'),
(4, 'Soup Kitchen', 5, 5, 'mike_green'),
(2, 'Food Drive', 3, 6, 'lucy_black'),
(5, 'Park Maintenance', 4, 7, 'tom_blue'),
(6, 'Community Garden', 5, 8, 'sara_gray'),
(3, 'Tree Planting', 4, 9, 'chris_yellow'),
(4, 'Soup Kitchen', 5, 10, 'kate_purple');

INSERT INTO dbo.organization (name, phone, email, organization_type, address)
VALUES
('Green Earth', '123-456-7890', 'contact@greenearth.org', 'Non-Profit', '123 Green St, Toronto, ON'),
('Food for All', '987-654-3210', 'info@foodforall.org', 'Charity', '456 Food Ave, Toronto, ON'),
('Tree Lovers', '234-567-8901', 'contact@treelovers.org', 'Non-Profit', '789 Tree Blvd, Toronto, ON'),
('Soup Kitchens United', '345-678-9012', 'info@soupkitchens.org', 'Charity', '101 Soup St, Toronto, ON'),
('Park Friends', '456-789-0123', 'info@parkfriends.org', 'Community', '202 Park Ln, Toronto, ON'),
('Garden Growers', '567-890-1234', 'contact@gardengrowers.org', 'Non-Profit', '303 Garden Way, Toronto, ON'),
('Animal Helpers', '678-901-2345', 'info@animalhelpers.org', 'Charity', '404 Animal Rd, Toronto, ON'),
('Education for All', '789-012-3456', 'info@educationforall.org', 'Charity', '505 Education Dr, Toronto, ON'),
('Health Heroes', '890-123-4567', 'contact@healthheroes.org', 'Non-Profit', '606 Health Blvd, Toronto, ON'),
('Clean Water Initiative', '901-234-5678', 'info@cleanwater.org', 'Non-Profit', '707 Water St, Toronto, ON');

INSERT INTO dbo.participation_record (activity_id, volunteer_id, participation_time)
VALUES
(1, 1, '2023-04-10'),
(2, 2, '2023-05-15'),
(1, 3, '2023-04-10'),
(3, 4, '2023-06-20'),
(4, 5, '2023-07-25'),
(2, 6, '2023-08-30'),
(5, 7, '2023-09-05'),
(6, 8, '2023-10-10'),
(3, 9, '2023-11-15'),
(4, 10, '2023-12-20');

INSERT INTO dbo.review (account_id, username, comment_date, comment)
VALUES
(1, 'john_doe', '2023-06-20', 'Great organization to volunteer with!'),
(2, 'jane_smith', '2023-06-21', 'Very well organized activities.'),
(3, 'sam_brown', '2023-06-22', 'Loved the experience!'),
(4, 'alice_white', '2023-06-23', 'Will volunteer again.'),
(5, 'mike_green', '2023-06-24', 'Amazing support from staff.'),
(6, 'lucy_black', '2023-06-25', 'Highly recommend to others.'),
(7, 'tom_blue', '2023-06-26', 'Good experience overall.'),
(8, 'sara_gray', '2023-06-27', 'Well managed and fun.'),
(9, 'chris_yellow', '2023-06-28', 'Great cause to support.'),
(10, 'kate_purple', '2023-06-29', 'Fulfilling and rewarding.');

INSERT INTO dbo.volunteer (account_id, name, age, gender, marital_status, occupation_status, phone, email, address, has_drivers_licence, skills, academic_certificate, resume_link, skill_tags)
VALUES
(1, 'John Doe', 30, 'Male', 'Single', 'Employed', '123-456-7890', 'john.doe@example.com', '123 Elm St, Toronto, ON', 1, 'First Aid, CPR', 'Bachelor of Science', 'http://resume.com/johndoe', 'Medical, Safety'),
(2, 'Jane Smith', 25, 'Female', 'Married', 'Self-Employed', '987-654-3210', 'jane.smith@example.com', '456 Oak St, Toronto, ON', 0, 'Cooking, Event Planning', 'Diploma in Culinary Arts', 'http://resume.com/janesmith', 'Culinary, Events'),
(3, 'Sam Brown', 28, 'Male', 'Single', 'Student', '555-555-5555', 'sam.brown@example.com', '789 Pine St, Toronto, ON', 1, 'Organizing, Fundraising', 'Master of Business Administration', 'http://resume.com/sambrown', 'Management, Fundraising'),
(4, 'Alice White', 32, 'Female', 'Married', 'Employed', '111-222-3333', 'alice.white@example.com', '101 Birch St, Toronto, ON', 0, 'Teaching, Mentoring', 'Bachelor of Education', 'http://resume.com/alicewhite', 'Education, Mentoring'),
(5, 'Mike Green', 27, 'Male', 'Single', 'Employed', '444-555-6666', 'mike.green@example.com', '202 Maple St, Toronto, ON', 1, 'Driving, Logistics', 'Certificate in Logistics', 'http://resume.com/mikegreen', 'Logistics, Driving'),
(6, 'Lucy Black', 29, 'Female', 'Single', 'Self-Employed', '777-888-9999', 'lucy.black@example.com', '303 Cedar St, Toronto, ON', 0, 'Cooking, Nutrition', 'Diploma in Nutrition', 'http://resume.com/lucyblack', 'Nutrition, Culinary'),
(7, 'Tom Blue', 26, 'Male', 'Single', 'Employed', '222-333-4444', 'tom.blue@example.com', '404 Ash St, Toronto, ON', 1, 'Sports Coaching, Fitness', 'Bachelor of Physical Education', 'http://resume.com/tomblue', 'Sports, Fitness'),
(8, 'Sara Gray', 31, 'Female', 'Married', 'Employed', '555-666-7777', 'sara.gray@example.com', '505 Willow St, Toronto, ON', 0, 'Gardening, Landscaping', 'Diploma in Horticulture', 'http://resume.com/saragray', 'Gardening, Horticulture'),
(9, 'Chris Yellow', 35, 'Male', 'Married', 'Employed', '888-999-0000', 'chris.yellow@example.com', '606 Spruce St, Toronto, ON', 1, 'Photography, Videography', 'Bachelor of Fine Arts', 'http://resume.com/chrisyellow', 'Photography, Media'),
(10, 'Kate Purple', 33, 'Female', 'Single', 'Employed', '999-000-1111', 'kate.purple@example.com', '707 Fir St, Toronto, ON', 1, 'Writing, Editing', 'Bachelor of Arts in English', 'http://resume.com/katepurple', 'Writing, Editing');

INSERT INTO dbo.volunteer_activity (title, subtitle, imgs, host_id, description, launch_time, last_edit_time, likes_num, collections_num, reviews_num, required_skill_tags, venue, activity_start_time, activity_end_time)
VALUES
('Beach Cleanup', 'Help keep our beaches clean', 'img1.jpg', '1', 'Join us for a beach cleanup event.', '2023-05-01', '2023-05-02', 100, 50, 10, 'Environmental, Cleaning', 'Beach Park', '2023-06-01 09:00', '2023-06-01 12:00'),
('Food Drive', 'Collect food for the needy', 'img2.jpg', '2', 'Participate in our food drive to help those in need.', '2023-06-01', '2023-06-02', 80, 40, 8, 'Organizing, Packing', 'Community Center', '2023-07-01 10:00', '2023-07-01 14:00'),
('Tree Planting', 'Plant trees in the community', 'img3.jpg', '3', 'Help us plant trees in the neighborhood.', '2023-07-01', '2023-07-02', 120, 60, 12, 'Gardening, Environmental', 'City Park', '2023-08-01 08:00', '2023-08-01 12:00'),
('Soup Kitchen', 'Serve meals to the homeless', 'img4.jpg', '4', 'Volunteer at our soup kitchen to serve meals.', '2023-08-01', '2023-08-02', 90, 45, 9, 'Cooking, Serving', 'Soup Kitchen', '2023-09-01 11:00', '2023-09-01 14:00'),
('Park Maintenance', 'Maintain local parks', 'img5.jpg', '5', 'Help maintain and clean local parks.', '2023-09-01', '2023-09-02', 70, 35, 7, 'Cleaning, Maintenance', 'Central Park', '2023-10-01 09:00', '2023-10-01 13:00'),
('Community Garden', 'Work in the community garden', 'img6.jpg', '6', 'Join us in working on the community garden.', '2023-10-01', '2023-10-02', 85, 42, 8, 'Gardening, Planting', 'Community Garden', '2023-11-01 10:00', '2023-11-01 14:00'),
('Animal Shelter', 'Help at the animal shelter', 'img7.jpg', '7', 'Volunteer at the animal shelter.', '2023-11-01', '2023-11-02', 110, 55, 11, 'Animal Care, Cleaning', 'Animal Shelter', '2023-12-01 09:00', '2023-12-01 12:00'),
('Education Fair', 'Support the education fair', 'img8.jpg', '8', 'Assist in organizing the education fair.', '2023-12-01', '2023-12-02', 95, 47, 9, 'Organizing, Teaching', 'Education Hall', '2024-01-01 10:00', '2024-01-01 15:00'),
('Health Camp', 'Participate in the health camp', 'img9.jpg', '9', 'Join the health camp to support community health.', '2024-01-01', '2024-01-02', 105, 52, 10, 'Medical, First Aid', 'Health Center', '2024-02-01 09:00', '2024-02-01 13:00'),
('Clean Water Drive', 'Promote clean water initiatives', 'img10.jpg', '10', 'Support clean water initiatives in the community.', '2024-02-01', '2024-02-02', 115, 57, 11, 'Environmental, Organizing', 'Waterfront', '2024-03-01 10:00', '2024-03-01 14:00');

INSERT INTO dbo.volunteer_review (volunteer_id, organization_id, organization_name)
VALUES
(1, '1', 'Green Earth'),
(2, '2', 'Food for All'),
(3, '3', 'Tree Lovers'),
(4, '4', 'Soup Kitchens United'),
(5, '5', 'Park Friends'),
(6, '6', 'Garden Growers'),
(7, '7', 'Animal Helpers'),
(8, '8', 'Education for All'),
(9, '9', 'Health Heroes'),
(10, '10', 'Clean Water Initiative');

INSERT INTO dbo.activities_review (activity_id, activity_title, rate, volunteer_id, volunteer_username)
VALUES
(1, 'Beach Cleanup', 5, 1, 'john_doe'),
(2, 'Food Drive', 4, 2, 'jane_smith'),
(3, 'Tree Planting', 4, 3, 'sam_brown'),
(4, 'Soup Kitchen', 5, 4, 'alice_white'),
(5, 'Park Maintenance', 4, 5, 'mike_green'),
(6, 'Community Garden', 5, 6, 'lucy_black'),
(7, 'Animal Shelter', 5, 7, 'tom_blue'),
(8, 'Education Fair', 4, 8, 'sara_gray'),
(9, 'Health Camp', 5, 9, 'chris_yellow'),
(10, 'Clean Water Drive', 5, 10, 'kate_purple');

INSERT INTO dbo.participation_record (activity_id, volunteer_id, participation_time)
VALUES
(1, 1, '2023-06-01 09:00'),
(2, 2, '2023-07-01 10:00'),
(3, 3, '2023-08-01 08:00'),
(4, 4, '2023-09-01 11:00'),
(5, 5, '2023-10-01 09:00'),
(6, 6, '2023-11-01 10:00'),
(7, 7, '2023-12-01 09:00'),
(8, 8, '2024-01-01 10:00'),
(9, 9, '2024-02-01 09:00'),
(10, 10, '2024-03-01 10:00');