package com.example.sb.service.persistence;

import com.example.sb.NoSuchEntity2Exception;
import com.example.sb.model.Entity2;
import com.example.sb.model.impl.Entity2Impl;
import com.example.sb.model.impl.Entity2ModelImpl;
import com.example.sb.service.persistence.Entity2Persistence;

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
 * The persistence implementation for the entity2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see Entity2Persistence
 * @see Entity2Util
 * @generated
 */
public class Entity2PersistenceImpl extends BasePersistenceImpl<Entity2>
    implements Entity2Persistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Entity2Util} to access the entity2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Entity2Impl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
            Entity2ModelImpl.FINDER_CACHE_ENABLED, Entity2Impl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
            Entity2ModelImpl.FINDER_CACHE_ENABLED, Entity2Impl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
            Entity2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ENTITY2 = "SELECT entity2 FROM Entity2 entity2";
    private static final String _SQL_COUNT_ENTITY2 = "SELECT COUNT(entity2) FROM Entity2 entity2";
    private static final String _ORDER_BY_ENTITY_ALIAS = "entity2.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Entity2 exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Entity2PersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static Entity2 _nullEntity2 = new Entity2Impl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Entity2> toCacheModel() {
                return _nullEntity2CacheModel;
            }
        };

    private static CacheModel<Entity2> _nullEntity2CacheModel = new CacheModel<Entity2>() {
            @Override
            public Entity2 toEntityModel() {
                return _nullEntity2;
            }
        };

    public Entity2PersistenceImpl() {
        setModelClass(Entity2.class);
    }

    /**
     * Caches the entity2 in the entity cache if it is enabled.
     *
     * @param entity2 the entity2
     */
    @Override
    public void cacheResult(Entity2 entity2) {
        EntityCacheUtil.putResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
            Entity2Impl.class, entity2.getPrimaryKey(), entity2);

        entity2.resetOriginalValues();
    }

    /**
     * Caches the entity2s in the entity cache if it is enabled.
     *
     * @param entity2s the entity2s
     */
    @Override
    public void cacheResult(List<Entity2> entity2s) {
        for (Entity2 entity2 : entity2s) {
            if (EntityCacheUtil.getResult(
                        Entity2ModelImpl.ENTITY_CACHE_ENABLED,
                        Entity2Impl.class, entity2.getPrimaryKey()) == null) {
                cacheResult(entity2);
            } else {
                entity2.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all entity2s.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Entity2Impl.class.getName());
        }

        EntityCacheUtil.clearCache(Entity2Impl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the entity2.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Entity2 entity2) {
        EntityCacheUtil.removeResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
            Entity2Impl.class, entity2.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Entity2> entity2s) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Entity2 entity2 : entity2s) {
            EntityCacheUtil.removeResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
                Entity2Impl.class, entity2.getPrimaryKey());
        }
    }

    /**
     * Creates a new entity2 with the primary key. Does not add the entity2 to the database.
     *
     * @param id the primary key for the new entity2
     * @return the new entity2
     */
    @Override
    public Entity2 create(long id) {
        Entity2 entity2 = new Entity2Impl();

        entity2.setNew(true);
        entity2.setPrimaryKey(id);

        return entity2;
    }

    /**
     * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the entity2
     * @return the entity2 that was removed
     * @throws com.example.sb.NoSuchEntity2Exception if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity2 remove(long id)
        throws NoSuchEntity2Exception, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the entity2 with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the entity2
     * @return the entity2 that was removed
     * @throws com.example.sb.NoSuchEntity2Exception if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity2 remove(Serializable primaryKey)
        throws NoSuchEntity2Exception, SystemException {
        Session session = null;

        try {
            session = openSession();

            Entity2 entity2 = (Entity2) session.get(Entity2Impl.class,
                    primaryKey);

            if (entity2 == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEntity2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(entity2);
        } catch (NoSuchEntity2Exception nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Entity2 removeImpl(Entity2 entity2) throws SystemException {
        entity2 = toUnwrappedModel(entity2);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(entity2)) {
                entity2 = (Entity2) session.get(Entity2Impl.class,
                        entity2.getPrimaryKeyObj());
            }

            if (entity2 != null) {
                session.delete(entity2);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (entity2 != null) {
            clearCache(entity2);
        }

        return entity2;
    }

    @Override
    public Entity2 updateImpl(com.example.sb.model.Entity2 entity2)
        throws SystemException {
        entity2 = toUnwrappedModel(entity2);

        boolean isNew = entity2.isNew();

        Session session = null;

        try {
            session = openSession();

            if (entity2.isNew()) {
                session.save(entity2);

                entity2.setNew(false);
            } else {
                session.merge(entity2);
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

        EntityCacheUtil.putResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
            Entity2Impl.class, entity2.getPrimaryKey(), entity2);

        return entity2;
    }

    protected Entity2 toUnwrappedModel(Entity2 entity2) {
        if (entity2 instanceof Entity2Impl) {
            return entity2;
        }

        Entity2Impl entity2Impl = new Entity2Impl();

        entity2Impl.setNew(entity2.isNew());
        entity2Impl.setPrimaryKey(entity2.getPrimaryKey());

        entity2Impl.setId(entity2.getId());
        entity2Impl.setField2(entity2.getField2());

        return entity2Impl;
    }

    /**
     * Returns the entity2 with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the entity2
     * @return the entity2
     * @throws com.example.sb.NoSuchEntity2Exception if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity2 findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEntity2Exception, SystemException {
        Entity2 entity2 = fetchByPrimaryKey(primaryKey);

        if (entity2 == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEntity2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return entity2;
    }

    /**
     * Returns the entity2 with the primary key or throws a {@link com.example.sb.NoSuchEntity2Exception} if it could not be found.
     *
     * @param id the primary key of the entity2
     * @return the entity2
     * @throws com.example.sb.NoSuchEntity2Exception if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity2 findByPrimaryKey(long id)
        throws NoSuchEntity2Exception, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the entity2 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the entity2
     * @return the entity2, or <code>null</code> if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity2 fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Entity2 entity2 = (Entity2) EntityCacheUtil.getResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
                Entity2Impl.class, primaryKey);

        if (entity2 == _nullEntity2) {
            return null;
        }

        if (entity2 == null) {
            Session session = null;

            try {
                session = openSession();

                entity2 = (Entity2) session.get(Entity2Impl.class, primaryKey);

                if (entity2 != null) {
                    cacheResult(entity2);
                } else {
                    EntityCacheUtil.putResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
                        Entity2Impl.class, primaryKey, _nullEntity2);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Entity2ModelImpl.ENTITY_CACHE_ENABLED,
                    Entity2Impl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return entity2;
    }

    /**
     * Returns the entity2 with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the entity2
     * @return the entity2, or <code>null</code> if a entity2 with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Entity2 fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the entity2s.
     *
     * @return the entity2s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Entity2> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the entity2s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity2s
     * @param end the upper bound of the range of entity2s (not inclusive)
     * @return the range of entity2s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Entity2> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the entity2s.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.Entity2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of entity2s
     * @param end the upper bound of the range of entity2s (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of entity2s
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Entity2> findAll(int start, int end,
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

        List<Entity2> list = (List<Entity2>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ENTITY2);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ENTITY2;

                if (pagination) {
                    sql = sql.concat(Entity2ModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Entity2>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Entity2>(list);
                } else {
                    list = (List<Entity2>) QueryUtil.list(q, getDialect(),
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
     * Removes all the entity2s from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Entity2 entity2 : findAll()) {
            remove(entity2);
        }
    }

    /**
     * Returns the number of entity2s.
     *
     * @return the number of entity2s
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

                Query q = session.createQuery(_SQL_COUNT_ENTITY2);

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
     * Initializes the entity2 persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.sb.model.Entity2")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Entity2>> listenersList = new ArrayList<ModelListener<Entity2>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Entity2>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Entity2Impl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
