create table SB_FirstEntity (
	Id LONG not null primary key,
	testId LONG
);

create table SB_PRRegistration (
	registrationId LONG not null primary key,
	prUserId LONG,
	groupId LONG
);

create table SB_PRUser (
	prUserId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null
);

create table SB_SecondEntity (
	Id LONG not null primary key,
	Name VARCHAR(75) null,
	createDate DATE null
);

create table SB_TestEntity (
	Id LONG not null primary key,
	field VARCHAR(75) null
);