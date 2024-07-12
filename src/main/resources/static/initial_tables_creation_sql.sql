CREATE TABLE volunteer_hub.dbo.account (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  username NVARCHAR(255) NOT NULL,
  password NVARCHAR(255) NOT NULL,
  register_time DATETIME NOT NULL,
  account_type VARCHAR(10) DEFAULT ('volunteer') NOT NULL
);
CREATE UNIQUE INDEX account_username_pk ON account (username);
GO

CREATE TABLE volunteer_hub.dbo.activities_review (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  activity_id INT NOT NULL,
  activity_title NVARCHAR(255),
  rate INT,
  volunteer_id INT,
  volunteer_username NVARCHAR(255)
);
GO

CREATE TABLE volunteer_hub.dbo.organization (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  name NVARCHAR(255) NOT NULL,
  phone NVARCHAR(50),
  email NVARCHAR(255),
  organization_type NVARCHAR(255),
  address NVARCHAR(255)
);
GO

CREATE TABLE volunteer_hub.dbo.participation_record (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  activity_id INT NOT NULL,
  volunteer_id INT NOT NULL,
  participation_time DATETIME
);
GO

CREATE TABLE volunteer_hub.dbo.review (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  account_id INT NOT NULL,
  username NVARCHAR(255),
  comment_date DATETIME,
  comment NVARCHAR(255)
);
GO

CREATE TABLE volunteer_hub.dbo.volunteer (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  account_id INT NOT NULL,
  name NVARCHAR(255) NOT NULL,
  age INT,
  gender NVARCHAR(50),
  marital_status NVARCHAR(50),
  occupation_status NVARCHAR(50),
  phone NVARCHAR(50),
  email NVARCHAR(255),
  address NVARCHAR(255),
  has_drivers_licence BIT,
  skills NVARCHAR(255),
  academic_certificate NVARCHAR(255),
  resume_link NVARCHAR(255),
  skill_tags NVARCHAR(255)
);
GO

CREATE TABLE volunteer_hub.dbo.volunteer_activity (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  title NVARCHAR(255) NOT NULL,
  subtitle NVARCHAR(255),
  imgs NVARCHAR(255),
  host_id NVARCHAR(255),
  description NVARCHAR(255),
  launch_time DATETIME,
  last_edit_time DATETIME,
  likes_num INT,
  collections_num INT,
  reviews_num INT,
  required_skill_tags NVARCHAR(255),
  venue NVARCHAR(255),
  activity_start_time DATETIME,
  activity_end_time DATETIME
);
GO

CREATE TABLE volunteer_hub.dbo.volunteer_review (
  id INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  volunteer_id INT NOT NULL,
  organization_id NVARCHAR(255),
  organization_name NVARCHAR(255)
);
GO
