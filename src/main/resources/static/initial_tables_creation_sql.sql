use volunteer_hub
go

create table dbo.account
(
    id            int identity
        primary key,
    username      nvarchar(255)                    not null,
    avatar_link   nvarchar(255)                    not null,
    register_time datetime                         not null,
    account_type  varchar(100) default 'volunteer' not null
)
go

create table dbo.event
(
    id                  int identity
        primary key,
    title               nvarchar(255)  not null,
    subtitle            nvarchar(255),
    desc_img_links      nvarchar(2048),
    description         nvarchar(1024) not null,
    required_skill_tags nvarchar(255),
    organization_id     int            not null,
    venue               nvarchar(255)  not null,
    event_start_time    datetime       not null,
    event_end_time      datetime       not null,
    last_edit_time      datetime       not null,
    create_time         datetime       not null,
    likes_num           int default 0  not null,
    collections_num     int default 0  not null,
    reviews_num         int default 0  not null,
    reviews_json        nvarchar(2048) not null
)
go

create table dbo.organization
(
    id                 int identity
        primary key,
    name               nvarchar(255),
    logo_url           nvarchar(255),
    phone              nvarchar(50),
    email              nvarchar(255) not null,
    official_site_link nvarchar(255),
    address            nvarchar(255),
    city               nvarchar(255),
    province           nvarchar(255),
    country            nvarchar(255),
    postcode           nvarchar(50),
    account_id         int           not null
)
go

create unique index organization_name_pk
    on dbo.organization (name)
go

create table dbo.participation_record
(
    id                 int identity
        primary key,
    event_id           int      not null,
    position_id        int,
    volunteer_id       int      not null,
    participation_time datetime not null,
    present            bit,
    arrive_time        datetime,
    leave_time         datetime
)
go

create unique index idx_eventVolunteer
    on dbo.participation_record (position_id, event_id, volunteer_id)
go

create table dbo.position
(
    id                         int identity
        primary key,
    name                       nvarchar(255)                                     not null,
    min_age                    int           default 16                          not null,
    max_age                    int           default 80                          not null,
    ideal_for                  nvarchar(255) default 'individual'                not null,
    contact_name               nvarchar(255),
    contact_email              nvarchar(255),
    event_id                   int                                               not null,
    recruit_num                int           default 1                           not null,
    training_detail            nvarchar(255) default 'None'                      not null,
    working_condition          nvarchar(255) default 'None'                      not null,
    accessibility              nvarchar(255)                                     not null,
    description                varchar(1024),
    application_available_time datetime      default getdate()                   not null,
    application_deadline       datetime      default dateadd(day, 10, getdate()) not null
)
go

create table dbo.position_application
(
    id              int identity
        constraint position_application_pk
            primary key,
    volunteer_id    int                           not null,
    position_id     int                           not null,
    apply_time      datetime                      not null,
    status          varchar(19) default 'pending' not null,
    organization_id int                           not null,
    declined_msg    varchar(255)
)
go

exec sp_addextendedproperty 'MS_Description', '4 status: approved, declined, pending, expired', 'SCHEMA', 'dbo',
     'TABLE', 'position_application', 'COLUMN', 'status'
go

create table dbo.volunteer
(
    id                   int identity
        primary key,
    first_name           varchar(255),
    last_name            varchar(255),
    dob                  datetime,
    sex                  varchar(50),
    nationality          varchar(50),
    marital_status       varchar(50),
    occupation_status    varchar(50),
    phone                varchar(50),
    email                varchar(255) not null,
    address              varchar(255),
    postcode             varchar(50),
    has_drivers_licence  bit,
    skills               varchar(255),
    academic_certificate varchar(255),
    resume_link          varchar(255),
    city                 varchar(255),
    province             varchar(255),
    country              varchar(255),
    account_id           int          not null
)
go

create unique index volunteer_name_pk
    on dbo.volunteer (email)
go

create table dbo.volunteer_review
(
    id              int identity
        primary key,
    volunteer_id    int           not null,
    position_id     int           not null,
    event_id        int           not null,
    organization_id int           not null,
    rate            int default 5 not null,
    content         nvarchar(255) not null,
    review_time     datetime
)
go

create unique index idx_HostVolunteerEvent
    on dbo.volunteer_review (organization_id, volunteer_id, position_id)
go

