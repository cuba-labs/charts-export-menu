-- begin DEMO_VALUE_DESCRIPTION
create table DEMO_VALUE_DESCRIPTION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALUE_ integer not null,
    DESCRIPTION varchar(255) not null,
    --
    primary key (ID)
)^
-- end DEMO_VALUE_DESCRIPTION
