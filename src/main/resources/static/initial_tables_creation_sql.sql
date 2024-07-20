CREATE TABLE volunteer_hub.dbo.account (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  username NVARCHAR(255) NOT NULL,
  password NVARCHAR(255) NOT NULL,
  avatar_link NVARCHAR(255) NOT NULL,
  register_time DATETIME NOT NULL,
  account_type VARCHAR(10) DEFAULT ('volunteer') NOT NULL
);
CREATE UNIQUE INDEX account_username_pk ON account (username);
GO

CREATE TABLE volunteer_hub.dbo.volunteer (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  name NVARCHAR(255) NOT NULL,
  dob DATETIME NOT NULL,
  sex NVARCHAR(50) NOT NULL,
  nationality NVARCHAR(50) NOT NULL,
-- single, unmarried, married
  marital_status NVARCHAR(50),
-- student, unemployed, employed
  occupation_status NVARCHAR(50) not null,
-- only one number
  phone NVARCHAR(50) NOT NULL,
  email NVARCHAR(255) NOT NULL,
-- detailed address, city, province, country
  address NVARCHAR(255) NOT NULL,
  postcode NVARCHAR(50) NOT NULL,
-- 1 yes, 0 no
  has_drivers_licence BIT,
-- separated multiple skill with comma
  skills NVARCHAR(255),
  academic_certificate NVARCHAR(255),
-- or linkedin link
  resume_link NVARCHAR(255)
);
CREATE UNIQUE INDEX volunteer_name_pk ON volunteer (name);
GO

CREATE TABLE volunteer_hub.dbo.organization (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  name NVARCHAR(255) NOT NULL,
  logo_url NVARCHAR(255) NOT NULL,
-- Comma separates multiple numbers
  phone NVARCHAR(50) NOT NULL,
  email NVARCHAR(255) NOT NULL,
  official_site_link NVARCHAR(255),
-- detailed address, city, province, country
  address NVARCHAR(255),
  postcode NVARCHAR(50)
);
CREATE UNIQUE INDEX organization_name_pk ON organization (name);
GO

CREATE TABLE volunteer_hub.dbo.host (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  name NVARCHAR(255) NOT NULL,
  email NVARCHAR(255) NOT NULL,
  emp_id NVARCHAR(255),
  organization_id INT NOT NULL
);
CREATE UNIQUE INDEX host_name_pk ON host (name);
GO

CREATE TABLE volunteer_hub.dbo.activity (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  title NVARCHAR(255) NOT NULL,
  subtitle NVARCHAR(255),
-- comma separates multiple links
  desc_img_links NVARCHAR(2048),
  description NVARCHAR(255) NOT NULL,
-- separated by comma
  required_skill_tags NVARCHAR(255),
  host_id INT NOT NULL,
  venue NVARCHAR(255) NOT NULL,
  activity_start_time DATETIME NOT NULL,
  activity_end_time DATETIME NOT NULL,
-- default value is create time
  last_edit_time DATETIME NOT NULL,
  create_time DATETIME NOT NULL,
  likes_num INT DEFAULT(0) NOT NULL,
  collections_num INT DEFAULT(0) NOT NULL,
  reviews_num INT DEFAULT(0) NOT NULL,
-- json string of review content
  reviews_json NVARCHAR(2048) NOT NULL
);
GO
-- the content of the last one table, host_id is suppose to be the id of host, not the email. and the review in the activity, value format should be : {
--   volunteer_avatar_link: '',
--   volunteer_name: '',
--   content: '',
--   review_time: '',
--   review_likes_nul: 0,
--   hosts_reply: '',
--   reply_time: ''
--   reply_liks_num: 0
-- }

CREATE TABLE volunteer_hub.dbo.participation_record (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  activity_id INT NOT NULL,
  volunteer_id INT NOT NULL,
  participation_time DATETIME NOT NULL,
-- 0: absent, 1: present on the day of activity
  present BIT,
  arrive_time DATETIME,
  leave_time DATETIME
);
CREATE UNIQUE INDEX idx_ActivityVolunteer
ON participation_record (activity_id, volunteer_id);
GO

CREATE TABLE volunteer_hub.dbo.volunteer_review (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  host_id INT,
  volunteer_id INT NOT NULL,
  activity_id INT NOT NULL,
  review_time DATETIME
);
CREATE UNIQUE INDEX idx_HostVolunteerActivity
ON volunteer_review (host_id, volunteer_id, activity_id);
GO