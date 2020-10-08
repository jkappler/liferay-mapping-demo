create index IX_13EA01BE on StarshipEntry (companyId);
create index IX_1F875F7F on StarshipEntry (groupId, name[$COLUMN_LENGTH:75$]);
create index IX_51ABDE9D on StarshipEntry (groupId, urlTitle[$COLUMN_LENGTH:75$]);
create index IX_E6742F9E on StarshipEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_97E005A0 on StarshipEntry (uuid_[$COLUMN_LENGTH:75$], groupId);