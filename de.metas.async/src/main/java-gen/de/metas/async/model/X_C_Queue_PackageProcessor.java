/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package de.metas.async.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for C_Queue_PackageProcessor
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_C_Queue_PackageProcessor extends org.compiere.model.PO implements I_C_Queue_PackageProcessor, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1526083520L;

    /** Standard Constructor */
    public X_C_Queue_PackageProcessor (Properties ctx, int C_Queue_PackageProcessor_ID, String trxName)
    {
      super (ctx, C_Queue_PackageProcessor_ID, trxName);
      /** if (C_Queue_PackageProcessor_ID == 0)
        {
			setC_Queue_PackageProcessor_ID (0);
			setClassname (null);
			setEntityType (null);
        } */
    }

    /** Load Constructor */
    public X_C_Queue_PackageProcessor (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


    /** Load Meta Data */
    @Override
    protected org.compiere.model.POInfo initPO (Properties ctx)
    {
      org.compiere.model.POInfo poi = org.compiere.model.POInfo.getPOInfo (ctx, Table_Name, get_TrxName());
      return poi;
    }

	/** Set WorkPackage Processor.
		@param C_Queue_PackageProcessor_ID WorkPackage Processor	  */
	@Override
	public void setC_Queue_PackageProcessor_ID (int C_Queue_PackageProcessor_ID)
	{
		if (C_Queue_PackageProcessor_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Queue_PackageProcessor_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Queue_PackageProcessor_ID, Integer.valueOf(C_Queue_PackageProcessor_ID));
	}

	/** Get WorkPackage Processor.
		@return WorkPackage Processor	  */
	@Override
	public int getC_Queue_PackageProcessor_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Queue_PackageProcessor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Java-Klasse.
		@param Classname Java-Klasse	  */
	@Override
	public void setClassname (java.lang.String Classname)
	{
		set_Value (COLUMNNAME_Classname, Classname);
	}

	/** Get Java-Klasse.
		@return Java-Klasse	  */
	@Override
	public java.lang.String getClassname () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Classname);
	}

	/** Set Beschreibung.
		@param Description Beschreibung	  */
	@Override
	public void setDescription (java.lang.String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Beschreibung.
		@return Beschreibung	  */
	@Override
	public java.lang.String getDescription () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_Description);
	}

	/** 
	 * EntityType AD_Reference_ID=389
	 * Reference name: _EntityTypeNew
	 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entitäts-Art.
		@param EntityType 
		Dictionary Entity Type; Determines ownership and synchronization
	  */
	@Override
	public void setEntityType (java.lang.String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entitäts-Art.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	@Override
	public java.lang.String getEntityType () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_EntityType);
	}

	/** Set Interner Name.
		@param InternalName Interner Name	  */
	@Override
	public void setInternalName (java.lang.String InternalName)
	{
		set_Value (COLUMNNAME_InternalName, InternalName);
	}

	/** Get Interner Name.
		@return Interner Name	  */
	@Override
	public java.lang.String getInternalName () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_InternalName);
	}
}