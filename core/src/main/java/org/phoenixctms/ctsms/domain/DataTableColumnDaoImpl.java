// Generated by: hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge.
// This file is part of the Phoenix CTMS project (www.phoenixctms.org),
// distributed under LGPL v2.1. Copyright (C) 2011 - 2017.
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.phoenixctms.ctsms.domain;

import java.util.Collection;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.phoenixctms.ctsms.vo.DataTableColumnVO;

/**
 * @see DataTableColumn
 */
public class DataTableColumnDaoImpl
		extends DataTableColumnDaoBase {

	private org.hibernate.Criteria createDataTableColumnCriteria() {
		org.hibernate.Criteria tableColumnCriteria = this.getSession().createCriteria(DataTableColumn.class);
		return tableColumnCriteria;
	}

	/**
	 * {@inheritDoc}
	 */
	protected Collection<DataTableColumn> handleFindByUserTableColumn(Long userId, String tableName, String columnName) {
		org.hibernate.Criteria tableColumnCriteria = createDataTableColumnCriteria();
		//tableColumnCriteria.setCacheable(true);
		tableColumnCriteria.add(Restrictions.eq("user.id", userId.longValue()));
		if (tableName != null) {
			tableColumnCriteria.add(Restrictions.eq("tableName", tableName));
		}
		if (columnName != null) {
			tableColumnCriteria.add(Restrictions.eq("columnName", columnName));
		}
		tableColumnCriteria.addOrder(Order.asc("id"));
		return tableColumnCriteria.list();
	}

	/**
	 * {@inheritDoc}
	 */
	public void toDataTableColumnVO(
			DataTableColumn source,
			DataTableColumnVO target) {
		// TODO verify behavior of toDataTableColumnVO
		super.toDataTableColumnVO(source, target);
	}

	/**
	 * {@inheritDoc}
	 */
	public DataTableColumnVO toDataTableColumnVO(final DataTableColumn entity) {
		// TODO verify behavior of toDataTableColumnVO
		return super.toDataTableColumnVO(entity);
	}

	/**
	 * Retrieves the entity object that is associated with the specified value object
	 * from the object store. If no such entity object exists in the object store,
	 * a new, blank entity is created
	 */
	private DataTableColumn loadDataTableColumnFromDataTableColumnVO(DataTableColumnVO dataTableColumnVO) {
		// TODO implement loadDataTableColumnFromDataTableColumnVO
		//throw new UnsupportedOperationException("org.phoenixctms.ctsms.domain.loadDataTableColumnFromDataTableColumnVO(DataTableColumnVO) not yet implemented.");
		/* A typical implementation looks like this:
		DataTableColumn dataTableColumn = this.get(dataTableColumnVO.getId());
		if (dataTableColumn == null)
		{
		    dataTableColumn = DataTableColumn.Factory.newInstance();
		}
		return dataTableColumn;
		*/
		return DataTableColumn.Factory.newInstance();
	}

	/**
	 * {@inheritDoc}
	 */
	public DataTableColumn dataTableColumnVOToEntity(DataTableColumnVO dataTableColumnVO) {
		// TODO verify behavior of dataTableColumnVOToEntity
		DataTableColumn entity = this.loadDataTableColumnFromDataTableColumnVO(dataTableColumnVO);
		this.dataTableColumnVOToEntity(dataTableColumnVO, entity, true);
		return entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dataTableColumnVOToEntity(
			DataTableColumnVO source,
			DataTableColumn target,
			boolean copyIfNull) {
		// TODO verify behavior of dataTableColumnVOToEntity
		super.dataTableColumnVOToEntity(source, target, copyIfNull);
	}

	@Override
	protected long handleGetCount(Long userId, String tableName, String columnName) throws Exception {
		org.hibernate.Criteria tableColumnCriteria = createDataTableColumnCriteria();
		//tableColumnCriteria.setCacheable(true);
		tableColumnCriteria.add(Restrictions.eq("user.id", userId.longValue()));
		if (tableName != null) {
			tableColumnCriteria.add(Restrictions.eq("tableName", tableName));
		}
		if (columnName != null) {
			tableColumnCriteria.add(Restrictions.eq("columnName", columnName));
		}
		return (Long) tableColumnCriteria.setProjection(Projections.rowCount()).uniqueResult();
	}
}