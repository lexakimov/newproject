package com.example.sb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Entity1 service. Represents a row in the &quot;SB_Entity1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.example.sb.model.impl.Entity1ModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.example.sb.model.impl.Entity1Impl}.
 * </p>
 *
 * @author akimov
 * @see Entity1
 * @see com.example.sb.model.impl.Entity1Impl
 * @see com.example.sb.model.impl.Entity1ModelImpl
 * @generated
 */
public interface Entity1Model extends BaseModel<Entity1> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a entity1 model instance should use the {@link Entity1} interface instead.
     */

    /**
     * Returns the primary key of this entity1.
     *
     * @return the primary key of this entity1
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this entity1.
     *
     * @param primaryKey the primary key of this entity1
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this entity1.
     *
     * @return the ID of this entity1
     */
    public long getId();

    /**
     * Sets the ID of this entity1.
     *
     * @param id the ID of this entity1
     */
    public void setId(long id);

    /**
     * Returns the field1 of this entity1.
     *
     * @return the field1 of this entity1
     */
    @AutoEscape
    public String getField1();

    /**
     * Sets the field1 of this entity1.
     *
     * @param Field1 the field1 of this entity1
     */
    public void setField1(String Field1);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.example.sb.model.Entity1 entity1);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.example.sb.model.Entity1> toCacheModel();

    @Override
    public com.example.sb.model.Entity1 toEscapedModel();

    @Override
    public com.example.sb.model.Entity1 toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}