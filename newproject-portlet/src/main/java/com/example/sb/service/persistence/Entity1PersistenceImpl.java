package com.example.sb.service.persistence;

import com.example.sb.NoSuchEntity1Exception;
import com.example.sb.model.Entity1;
import com.example.sb.model.impl.Entity1Impl;
import com.example.sb.model.impl.Entity1ModelImpl;
import com.example.sb.service.persistence.Entity1Persistence;

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
 * The persistence implementation for the entity1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see Entity1Persistence
 * @see Entity1Util
 * @generated
 */
public class Entity1PersistenceImpl extends BasePersistenceImpl<Entity1>
    implements Entity1Persistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Entity1Util} to access the entity1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Entity1Impl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
            Entity1ModelImpl.FINDER_CACHE_ENABLED, Entity1Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
            Entity1ModelImpl.FINDER_CACHE_ENABLED, Entity1Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
            Entity1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITY1 = "SELECT entity1 FROM Entity1 entity1";
    private static final String _SQL_COUNT_ENTITY1 = "SELECT COUNT(entity1) FROM Entity1 entity1";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entity1.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Entity1 exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Entity1PersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Entity1 _nullEntity1 = new Entity1Impl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Entity1> toCacheModel() {
                return _nullEntity1CacheModel;
            }
        };

    private static CacheModel<Entity1> _nullEntity1CacheModel = new CacheModel<Entity1>() {
            @Override
            public Entity1 toEntityModel() {
                return _nullEntity1;
            }
        };

    public Entity1PersistenceImpl() {
        setModelClass(Entity1.class);
    }

    /**
     * Caches the entity1 in the entity cache if it is enabled.
     *
     * @param entity1 the entity1
     */
    @Override
    public void cacheResult(Entity1 entity1) {
        EntityCacheUtil.putResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
            Entity1Impl.class, entity1.getPrimaryKey(), entity1);

        entity1.resetOriginalValues();
    }

    /**
     * Caches the entity1s in the entity cache if it is enabled.
     *
     * @param entity1s the entity1s
     */
    @Override
    public void cacheResult(List<Entity1> entity1s) {
        for (Entity1 entity1 : entity1s) {
            if (EntityCacheUtil.getResult(
                        Entity1ModelImpl.ENTITY_CACHE_ENABLED,
                        Entity1Impl.class, entity1.getPrimaryKey()) == null) {
                cacheResult(entity1);
            } else {
                entity1.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity1s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Entity1Impl.class.getName());
        }

        EntityCacheUtil.clearCache(Entity1Impl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity1.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Entity1 entity1) {
        EntityCacheUtil.removeResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
            Entity1Impl.class, entity1.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Entity1> entity1s) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Entity1 entity1 : entity1s) {
            EntityCacheUtil.removeResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
                Entity1Impl.class, entity1.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity1 with the primary key. Does not add the entity1 to the database.
     *
     * @param id the primary key for the new entity1
     * @return the new entity1
     */
    @Override
    public Entity1 create(long id) {
        Entity1 entity1 = new Entity1Impl();

        entity1.setNew(true);
        entity1.setPrimaryKey(id);

        return entity1;
    }

    /**
     * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the entity1
     * @return the entity1 that was removed
     * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity1 remove(long id)
        throws NoSuchEntity1Exception, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the entity1 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity1
     * @return the entity1 that was removed
     * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity1 remove(Serializable primaryKey)
        throws NoSuchEntity1Exception, SystemException {
        Session session = null;

        try {
            session = openSession();

            Entity1 entity1 = (Entity1) session.get(Entity1Impl.class,
                    primaryKey);

            if (entity1 == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntity1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entity1);
        } catch (NoSuchEntity1Exception nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Entity1 removeImpl(Entity1 entity1) throws SystemException {
        entity1 = toUnwrappedModel(entity1);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entity1)) {
                entity1 = (Entity1) session.get(Entity1Impl.class,
                        entity1.getPrimaryKeyObj());
            }

            if (entity1 != null) {
                session.delete(entity1);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entity1 != null) {
            clearCache(entity1);
        }

        return entity1;
    }

    @Override
    public Entity1 updateImpl(com.example.sb.model.Entity1 entity1)
        throws SystemException {
        entity1 = toUnwrappedModel(entity1);

        boolean isNew = entity1.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entity1.isNew()) {
                session.save(entity1);

                entity1.setNew(false);
            } else {
                session.merge(entity1);
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

        EntityCacheUtil.putResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
            Entity1Impl.class, entity1.getPrimaryKey(), entity1);

        return entity1;
    }

    protected Entity1 toUnwrappedModel(Entity1 entity1) {
        if (entity1 instanceof Entity1Impl) {
            return entity1;
        }

        Entity1Impl entity1Impl = new Entity1Impl();

        entity1Impl.setNew(entity1.isNew());
        entity1Impl.setPrimaryKey(entity1.getPrimaryKey());

        entity1Impl.setId(entity1.getId());
        entity1Impl.setStatus(entity1.getStatus());
        entity1Impl.setRequestId(entity1.getRequestId());
        entity1Impl.setField1(entity1.getField1());

        return entity1Impl;
    }

    /**
     * Returns the entity1 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity1
     * @return the entity1
     * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity1 findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntity1Exception, SystemException {
        Entity1 entity1 = fetchByPrimaryKey(primaryKey);

        if (entity1 == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntity1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entity1;
    }

    /**
     * Returns the entity1 with the primary key or throws a {@link com.example.sb.NoSuchEntity1Exception} if it could not be found.
     *
     * @param id the primary key of the entity1
     * @return the entity1
     * @throws com.example.sb.NoSuchEntity1Exception if a entity1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity1 findByPrimaryKey(long id)
        throws NoSuchEntity1Exception, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity1
     * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity1 fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Entity1 entity1 = (Entity1) EntityCacheUtil.getResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
                Entity1Impl.class, primaryKey);

        if (entity1 == _nullEntity1) {
            return null;
        }

        if (entity1 == null) {
            Session session = null;

            try {
                session = openSession();

                entity1 = (Entity1) session.get(Entity1Impl.class, primaryKey);

                if (entity1 != null) {
                    cacheResult(entity1);
                } else {
                    EntityCacheUtil.putResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
                        Entity1Impl.class, primaryKey, _nullEntity1);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Entity1ModelImpl.ENTITY_CACHE_ENABLED,
                    Entity1Impl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entity1;
    }

    /**
     * Returns the entity1 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the entity1
     * @return the entity1, or <code>null</code> if a entity1 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity1 fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the entity1s.
     *
     * @return the entity1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Entity1> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity1s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity1s
     * @param end the upper bound of the range of entity1s (not inclusive)
     * @return the range of entity1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Entity1> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity1s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity1s
     * @param end the upper bound of the range of entity1s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity1s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Entity1> findAll(int start, int end,
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

        List<Entity1> list = (List<Entity1>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITY1);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITY1;

                if (pagination) {
                    sql = sql.concat(Entity1ModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Entity1>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Entity1>(list);
                } else {
                    list = (List<Entity1>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity1s from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Entity1 entity1 : findAll()) {
            remove(entity1);
        }
    }

    /**
     * Returns the number of entity1s.
     *
     * @return the number of entity1s
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

                Query q = session.createQuery(_SQL_COUNT_ENTITY1);

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
     * Initializes the entity1 persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.sb.model.Entity1")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Entity1>> listenersList = new ArrayList<ModelListener<Entity1>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Entity1>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Entity1Impl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
