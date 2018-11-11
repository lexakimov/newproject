create unique index IX_B9E4F6E3 on SB_FirstEntity (userId);
create index IX_436991EB on SB_FirstEntity (uuid_);

create index IX_D93822F9 on SB_PRRegistration (groupId);
create index IX_D2182ACC on SB_PRRegistration (groupId, datePurchased);
create index IX_22EB9F95 on SB_PRRegistration (groupId, prUserId);
create index IX_CBA8C04A on SB_PRRegistration (groupId, serialNumber);

create index IX_269182C5 on SB_PRUser (groupId, email);
create index IX_5DC35EDC on SB_PRUser (groupId, lastName);
create index IX_6E5A2FE1 on SB_PRUser (groupId, userId);