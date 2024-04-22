package edu.gatech.chai.omopv5.dba.service;

import java.sql.Connection;
import java.sql.SQLException;

import edu.gatech.chai.omopv5.model.entity.BaseEntity;

public interface ISqlGeneratingService<T extends BaseEntity> {
    String constructSqlSelectWithoutWhere(String rootTableName, boolean getCount, BaseEntityServiceImp.AliasCallback callback);
    Class<T> getEntityClass();
    BaseEntity getEntity();
    Connection getConnection() throws SQLException;

}
