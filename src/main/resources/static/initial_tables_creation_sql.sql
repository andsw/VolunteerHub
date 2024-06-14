-- Table to store account information
CREATE TABLE account (
  id INT PRIMARY KEY,  -- Primary key
  username NVARCHAR(255) NOT NULL,  -- Username of the account
  password NVARCHAR(255) NOT NULL,  -- Password of the account
  registerTime DATETIME NOT NULL  -- Registration time of the account
);
-- Table to store organization information
CREATE TABLE organization (
  name NVARCHAR(255) PRIMARY KEY,  -- Primary key, name of the organization
  phone NVARCHAR(50),  -- Phone number of the organization
  email NVARCHAR(255),  -- Email address of the organization
  organization NVARCHAR(255),  -- Organization type or additional info
  address NVARCHAR(255)  -- Address of the organization
);
-- Table to store volunteer information
CREATE TABLE volunteer (
  accountId INT PRIMARY KEY,  -- Primary key, references account(id)
  name NVARCHAR(255) NOT NULL,  -- Name of the volunteer
  age INT,  -- Age of the volunteer
  gender NVARCHAR(50),  -- Gender of the volunteer
  maritalStatus NVARCHAR(50),  -- Marital status of the volunteer
  occupationStatus NVARCHAR(50),  -- Occupation status of the volunteer
  phone NVARCHAR(50),  -- Phone number of the volunteer
  email NVARCHAR(255),  -- Email address of the volunteer
  address NVARCHAR(255),  -- Address of the volunteer
  hasDriversLicence BIT,  -- Whether the volunteer has a driver's license
  skills NVARCHAR(255),  -- Skills of the volunteer
  academicCertificate NVARCHAR(255),  -- Academic certificate of the volunteer
  resumeLink NVARCHAR(255),  -- Link to the volunteer's resume
  skillTags NVARCHAR(255),  -- Tags for the volunteer's skills
  FOREIGN KEY (accountId) REFERENCES account(id)  -- Foreign key to account table
);
-- Table to store volunteer activity information
CREATE TABLE volunteer_activity (
  id INT PRIMARY KEY,  -- Primary key
  title NVARCHAR(255) NOT NULL,  -- Title of the activity
  subtitle NVARCHAR(255),  -- Subtitle of the activity
  imgs NVARCHAR(255),  -- Image links for the activity
  hostId NVARCHAR(255),  -- Host organization ID, references organization(name)
  description NVARCHAR(255),  -- Description of the activity
  launchTime DATETIME,  -- Launch time of the activity
  lastEditTime DATETIME,  -- Last edit time of the activity
  likesNum INT,  -- Number of likes for the activity
  collectionsNum INT,  -- Number of collections for the activity
  reviewsNum INT,  -- Number of reviews for the activity
  requiredSkillTags NVARCHAR(255),  -- Required skill tags for the activity
  venue NVARCHAR(255),  -- Venue of the activity
  activityStartTime DATETIME,  -- Start time of the activity
  activityEndTime DATETIME,  -- End time of the activity
  FOREIGN KEY (hostId) REFERENCES organization(name)  -- Foreign key to organization table
);
-- Table to store participation records of volunteers in activities
CREATE TABLE participation_record (
  id INT PRIMARY KEY,  -- Primary key
  activityId INT,  -- Activity ID, references volunteer_activity(id)
  volunteerId INT,  -- Volunteer ID, references volunteer(accountId)
  participationTime DATETIME,  -- Time of participation
  FOREIGN KEY (activityId) REFERENCES volunteer_activity(id),  -- Foreign key to volunteer_activity table
  FOREIGN KEY (volunteerId) REFERENCES volunteer(accountId)  -- Foreign key to volunteer table
);
-- Table to store reviews
CREATE TABLE review (
  id INT PRIMARY KEY,  -- Primary key
  accountId INT,  -- Account ID, references account(id)
  username NVARCHAR(255),  -- Username of the reviewer
  commentDate DATETIME,  -- Date of the comment
  comment NVARCHAR(255),  -- Comment text
  FOREIGN KEY (accountId) REFERENCES account(id)  -- Foreign key to account table
);
-- Table to store volunteer reviews by organizations
CREATE TABLE volunteer_review (
  volunteerId INT,  -- Volunteer ID, references volunteer(accountId)
  organizationId NVARCHAR(255),  -- Organization ID, references organization(name)
  organizationName NVARCHAR(255),  -- Name of the organization
  PRIMARY KEY (volunteerId, organizationId),  -- Composite primary key
  FOREIGN KEY (volunteerId) REFERENCES volunteer(accountId),  -- Foreign key to volunteer table
  FOREIGN KEY (organizationId) REFERENCES organization(name)  -- Foreign key to organization table
);
-- Table to store reviews of activities by volunteers
CREATE TABLE activities_review (
  activityId INT,  -- Activity ID, references volunteer_activity(id)
  activityTitle NVARCHAR(255),  -- Title of the activity
  rate INT,  -- Rating given by the volunteer
  volunteerId INT,  -- Volunteer ID, references volunteer(accountId)
  volunteerUsername NVARCHAR(255),  -- Username of the volunteer
  PRIMARY KEY (activityId, volunteerId),  -- Composite primary key
  FOREIGN KEY (activityId) REFERENCES volunteer_activity(id),  -- Foreign key to volunteer_activity table
  FOREIGN KEY (volunteerId) REFERENCES volunteer(accountId)  -- Foreign key to volunteer table
);
