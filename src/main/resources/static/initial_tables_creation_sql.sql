create table volunteer_hub.dbo.account (
  id int primary key not null,
  username nvarchar(255) not null,
  password nvarchar(255) not null,
  register_time datetime not null,
  account_type varchar(10) default ('volunteer') not null
);
create unique index account_username_pk on account (username);
GO

create table volunteer_hub.dbo.activities_review (
  id int primary key not null,
  activity_id int not null,
  activity_title nvarchar(255),
  rate int,
  volunteer_id int,
  volunteer_username nvarchar(255)
);
GO

create table volunteer_hub.dbo.organization (
  id int primary key not null,
  name nvarchar(255) not null,
  phone nvarchar(50),
  email nvarchar(255),
  organization_type nvarchar(255),
  address nvarchar(255)
);
GO

create table volunteer_hub.dbo.participation_record (
  id int primary key not null,
  activity_id int not null,
  volunteer_id int not null,
  participation_time datetime
);
GO

create table volunteer_hub.dbo.review (
  id int primary key not null,
  account_id int not null,
  username nvarchar(255),
  comment_date datetime,
  comment nvarchar(255)
);
GO

create table volunteer_hub.dbo.volunteer (
  id int primary key not null,
  account_id int not null,
  name nvarchar(255) not null,
  age int,
  gender nvarchar(50),
  marital_status nvarchar(50),
  occupation_status nvarchar(50),
  phone nvarchar(50),
  email nvarchar(255),
  address nvarchar(255),
  has_drivers_licence bit,
  skills nvarchar(255),
  academic_certificate nvarchar(255),
  resume_link nvarchar(255),
  skill_tags nvarchar(255)
);
GO

create table volunteer_hub.dbo.volunteer_activity (
  id int primary key not null,
  title nvarchar(255) not null,
  subtitle nvarchar(255),
  imgs nvarchar(255),
  host_id nvarchar(255),
  description nvarchar(255),
  launch_time datetime,
  last_edit_time datetime,
  likes_num int,
  collections_num int,
  reviews_num int,
  required_skill_tags nvarchar(255),
  venue nvarchar(255),
  activity_start_time datetime,
  activity_end_time datetime
);
GO

create table volunteer_hub.dbo.volunteer_review (
  id int primary key not null,
  volunteer_id int not null,
  organization_id nvarchar(255),
  organization_name nvarchar(255)
);
GO

