-- Table to store account information
-- auto-generated definition
CREATE TABLE account
(
    id INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
    username NVARCHAR(255) NOT NULL
        CONSTRAINT account_username_pk
            UNIQUE,
    password NVARCHAR(255) NOT NULL,
    register_time DATETIME NOT NULL
);

-- Table to store organization information
CREATE TABLE organization (
    id INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
    name NVARCHAR(255) NOT NULL,  -- Primary key, name of the organization
    phone NVARCHAR(50),  -- Phone number of the organization
    email NVARCHAR(255),  -- Email address of the organization
    organization_type NVARCHAR(255),  -- Organization type or additional info
    address NVARCHAR(255)  -- Address of the organization
);

-- Table to store volunteer information
CREATE TABLE volunteer (
    id INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
    account_id INT NOT NULL,  -- Primary key, references account(id)
    name NVARCHAR(255) NOT NULL,  -- Name of the volunteer
    age INT,  -- Age of the volunteer
    gender NVARCHAR(50),  -- Gender of the volunteer
    marital_status NVARCHAR(50),  -- Marital status of the volunteer
    occupation_status NVARCHAR(50),  -- Occupation status of the volunteer
    phone NVARCHAR(50),  -- Phone number of the volunteer
    email NVARCHAR(255),  -- Email address of the volunteer
    address NVARCHAR(255),  -- Address of the volunteer
    has_drivers_licence BIT,  -- Whether the volunteer has a driver's license
    skills NVARCHAR(255),  -- Skills of the volunteer
    academic_certificate NVARCHAR(255),  -- Academic certificate of the volunteer
    resume_link NVARCHAR(255),  -- Link to the volunteer's resume
    skill_tags NVARCHAR(255)  -- Tags for the volunteer's skills
);

-- Table to store volunteer activity information
CREATE TABLE volunteer_activity (
    id INT IDENTITY(1, 1) PRIMARY KEY,  -- Primary key
    title NVARCHAR(255) NOT NULL,  -- Title of the activity
    subtitle NVARCHAR(255),  -- Subtitle of the activity
    imgs NVARCHAR(255),  -- Image links for the activity
    host_id NVARCHAR(255),  -- Host organization ID, references organization(name)
    description NVARCHAR(255),  -- Description of the activity
    launch_time DATETIME,  -- Launch time of the activity
    last_edit_time DATETIME,  -- Last edit time of the activity
    likes_num INT,  -- Number of likes for the activity
    collections_num INT,  -- Number of collections for the activity
    reviews_num INT,  -- Number of reviews for the activity
    required_skill_tags NVARCHAR(255),  -- Required skill tags for the activity
    venue NVARCHAR(255),  -- Venue of the activity
    activity_start_time DATETIME,  -- Start time of the activity
    activity_end_time DATETIME  -- End time of the activity
);

-- Table to store participation records of volunteers in activities
CREATE TABLE participation_record (
    id INT IDENTITY(1, 1) PRIMARY KEY,  -- Primary key
    activity_id INT NOT NULL,  -- Activity ID, references volunteer_activity(id)
    volunteer_id INT NOT NULL,  -- Volunteer ID, references volunteer(account_id)
    participation_time DATETIME  -- Time of participation
);

-- Table to store reviews
CREATE TABLE review (
    id INT IDENTITY(1, 1) PRIMARY KEY,  -- Primary key
    account_id INT NOT NULL,  -- Account ID, references account(id)
    username NVARCHAR(255),  -- Username of the reviewer
    comment_date DATETIME,  -- Date of the comment
    comment NVARCHAR(255)  -- Comment text
);

-- Table to store volunteer reviews by organizations
CREATE TABLE volunteer_review (
    id INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
    volunteer_id INT NOT NULL,  -- Volunteer ID, references volunteer(account_id)
    organization_id NVARCHAR(255),  -- Organization ID, references organization(name)
    organization_name NVARCHAR(255)  -- Name of the organization
);

-- Table to store reviews of activities by volunteers
CREATE TABLE activities_review (
    id INT NOT NULL IDENTITY(1, 1) PRIMARY KEY,
    activity_id INT NOT NULL,  -- Activity ID, references volunteer_activity(id)
    activity_title NVARCHAR(255),  -- Title of the activity
    rate INT,  -- Rating given by the volunteer
    volunteer_id INT,  -- Volunteer ID, references volunteer(account_id)
    volunteer_username NVARCHAR(255)  -- Username of the volunteer
);
