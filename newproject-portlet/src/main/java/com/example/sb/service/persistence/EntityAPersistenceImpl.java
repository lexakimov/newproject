package com.example.sb.service.persistence;

import com.example.sb.NoSuchEntityAException;
import com.example.sb.model.EntityA;
import com.example.sb.model.impl.EntityAImpl;
import com.example.sb.model.impl.EntityAModelImpl;
import com.example.sb.service.persistence.EntityAPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the entity a service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see EntityAPersistence
 * @see EntityAUtil
 * @generated
 */
public class EntityAPersistenceImpl extends BasePersistenceImpl<EntityA>
    implements EntityAPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EntityAUtil} to access the entity a persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EntityAImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EntityAModelImpl.ENTITY_CACHE_ENABLED,
            EntityAModelImpl.FINDER_CACHE_ENABLED, EntityAImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EntityAModelImpl.ENTITY_CACHE_ENABLED,
            EntityAModelImpl.FINDER_CACHE_ENABLED, EntityAImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EntityAModelImpl.ENTITY_CACHE_ENABLED,
            EntityAModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITYA = "SELECT entityA FROM EntityA entityA";
    private static final String _SQL_COUNT_ENTITYA = "SELECT COUNT(entityA) FROM EntityA entityA";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entityA.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EntityA exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EntityAPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static EntityA _nullEntityA = new EntityAImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EntityA> toCacheModel() {
                return _nullEntityACacheModel;
            }
        };

    private static CacheModel<EntityA> _nullEntityACacheModel = new CacheModel<EntityA>() {
            @Override
            public EntityA toEntityModel() {
                return _nullEntityA;
            }
        };

    public EntityAPersistenceImpl() {
        setModelClass(EntityA.class);
    }

    /**
     * Caches the entity a in the entity cache if it is enabled.
     *
     * @param entityA the entity a
     */
    @Override
    public void cacheResult(EntityA entityA) {
        EntityCacheUtil.putResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
            EntityAImpl.class, entityA.getPrimaryKey(), entityA);

        entityA.resetOriginalValues();
    }

    /**
     * Caches the entity as in the entity cache if it is enabled.
     *
     * @param entityAs the entity as
     */
    @Override
    public void cacheResult(List<EntityA> entityAs) {
        for (EntityA entityA : entityAs) {
            if (EntityCacheUtil.getResult(
                        EntityAModelImpl.ENTITY_CACHE_ENABLED,
                        EntityAImpl.class, entityA.getPrimaryKey()) == null) {
                cacheResult(entityA);
            } else {
                entityA.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity as.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EntityAImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EntityAImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity a.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EntityA entityA) {
        EntityCacheUtil.removeResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
            EntityAImpl.class, entityA.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EntityA> entityAs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EntityA entityA : entityAs) {
            EntityCacheUtil.removeResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
                EntityAImpl.class, entityA.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity a with the primary key. Does not add the entity a to the database.
     *
     * @param id the primary key for the new entity a
     * @return the new entity a
     */
    @Override
    public EntityA create(long id) {
        EntityA entityA = new EntityAImpl();

        entityA.setNew(true);
        entityA.setPrimaryKey(id);

        return entityA;
    }

    /**
     * Removes the entity a with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the entity a
     * @return the entity a that was removed
     * @throws com.example.sb.NoSuchEntityAException if a entity a with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityA remove(long id)
        throws NoSuchEntityAException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the entity a with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity a
     * @return the entity a that was removed
     * @throws com.example.sb.NoSuchEntityAException if a entity a with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityA remove(Serializable primaryKey)
        throws NoSuchEntityAException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EntityA entityA = (EntityA) session.get(EntityAImpl.class,
                    primaryKey);

            if (entityA == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntityAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entityA);
        } catch (NoSuchEntityAException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EntityA removeImpl(EntityA entityA) throws SystemException {
        entityA = toUnwrappedModel(entityA);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entityA)) {
                entityA = (EntityA) session.get(EntityAImpl.class,
                        entityA.getPrimaryKeyObj());
            }

            if (entityA != null) {
                session.delete(entityA);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entityA != null) {
            clearCache(entityA);
        }

        return entityA;
    }

    @Override
    public EntityA updateImpl(com.example.sb.model.EntityA entityA)
        throws SystemException {
        entityA = toUnwrappedModel(entityA);

        boolean isNew = entityA.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entityA.isNew()) {
                session.save(entityA);

                entityA.setNew(false);
            } else {
                session.merge(entityA);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
            EntityAImpl.class, entityA.getPrimaryKey(), entityA);

        return entityA;
    }

    protected EntityA toUnwrappedModel(EntityA entityA) {
        if (entityA instanceof EntityAImpl) {
            return entityA;
        }

        EntityAImpl entityAImpl = new EntityAImpl();

        entityAImpl.setNew(entityA.isNew());
        entityAImpl.setPrimaryKey(entityA.getPrimaryKey());

        entityAImpl.setId(entityA.getId());

        return entityAImpl;
    }

    /**
     * Returns the entity a with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity a
     * @return the entity a
     * @throws com.example.sb.NoSuchEntityAException if a entity a with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityA findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntityAException, SystemException {
        EntityA entityA = fetchByPrimaryKey(primaryKey);

        if (entityA == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntityAException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entityA;
    }

    /**
     * Returns the entity a with the primary key or throws a {@link com.example.sb.NoSuchEntityAException} if it could not be found.
     *
     * @param id the primary key of the entity a
     * @return the entity a
     * @throws com.example.sb.NoSuchEntityAException if a entity a with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityA findByPrimaryKey(long id)
        throws NoSuchEntityAException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the entity a with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity a
     * @return the entity a, or <code>null</code> if a entity a with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityA fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EntityA entityA = (EntityA) EntityCacheUtil.getResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
                EntityAImpl.class, primaryKey);

        if (entityA == _nullEntityA) {
            return null;
        }

        if (entityA == null) {
            Session session = null;

            try {
                session = openSession();

                entityA = (EntityA) session.get(EntityAImpl.class, primaryKey);

                if (entityA != null) {
                    cacheResult(entityA);
                } else {
                    EntityCacheUtil.putResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
                        EntityAImpl.class, primaryKey, _nullEntityA);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EntityAModelImpl.ENTITY_CACHE_ENABLED,
                    EntityAImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entityA;
    }

    /**
     * Returns the entity a with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the entity a
     * @return the entity a, or <code>null</code> if a entity a with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EntityA fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the entity as.
     *
     * @return the entity as
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityA> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity as.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity as
     * @param end the upper bound of the range of entity as (not inclusive)
     * @return the range of entity as
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityA> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity as.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.EntityAModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity as
     * @param end the upper bound of the range of entity as (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity as
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EntityA> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<EntityA> list = (List<EntityA>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITYA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITYA;

                if (pagination) {
                    sql = sql.concat(EntityAModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EntityA>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EntityA>(list);
                } else {
                    list = (List<EntityA>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the entity as from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EntityA entityA : findAll()) {
            remove(entityA);
        }
    }

    /**
     * Returns the number of entity as.
     *
     * @return the number of entity as
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ENTITYA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the entity a persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.sb.model.EntityA")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EntityA>> listenersList = new ArrayList<ModelListener<EntityA>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EntityA>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EntityAImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
