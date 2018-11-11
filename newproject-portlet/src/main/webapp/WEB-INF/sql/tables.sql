create table SB_FirstEntity (
	Id LONG not null primary key,
	testId LONG
);

create table SB_PRRegistration (
	registrationId LONG not null primary key,
	prUserId LONG,
	datePurchased DATE null,
	howHear VARCHAR(75) null,
	wherePurchased VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	productId LONG,
	companyId LONG,
	groupId LONG
);

create table SB_PRUser (
	prUserId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	postalCode VARCHAR(75) null,
	country VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	email VARCHAR(75) null,
	birthDate DATE null,
	male BOOLEAN,
	userId LONG,
	companyId LONG,
	groupId LONG
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