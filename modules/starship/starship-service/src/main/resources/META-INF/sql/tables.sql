create table StarshipEntry (
	uuid_ VARCHAR(75) null,
	starshipEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description STRING null,
	starshipFileImageId LONG,
	urlTitle VARCHAR(255) null,
	status INTEGER
);