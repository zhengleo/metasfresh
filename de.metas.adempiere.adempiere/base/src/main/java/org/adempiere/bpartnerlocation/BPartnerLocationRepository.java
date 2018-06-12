package org.adempiere.bpartnerlocation;

import static org.adempiere.model.InterfaceWrapperHelper.load;

import org.adempiere.ad.dao.IQueryBL;
import org.adempiere.bpartner.BPartnerId;
import org.adempiere.location.LocationId;
import org.adempiere.util.Services;
import org.springframework.stereotype.Repository;

import de.metas.adempiere.model.I_C_BPartner_Location;
import lombok.NonNull;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
 * %%
 * Copyright (C) 2018 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

@Repository
public class BPartnerLocationRepository
{
	private BPartnerLocation toBPartnerLocation(@NonNull final I_C_BPartner_Location bpartnerLocationRecord)
	{

		return BPartnerLocation.builder()
				.id(BPartnerLocationId.ofRepoId(bpartnerLocationRecord.getC_BPartner_Location_ID()))
				.bpartnerId(BPartnerId.ofRepoId(bpartnerLocationRecord.getC_BPartner_ID()))
				.locationId(LocationId.ofRepoId(bpartnerLocationRecord.getC_Location_ID()))
				.build();
	}

	public BPartnerLocation getByBPartnerLocationId(@NonNull final BPartnerLocationId bplocationId)
	{
		return toBPartnerLocation(load(bplocationId.getRepoId(), I_C_BPartner_Location.class));
	}

	public BPartnerLocationId getByBPartnerIdAndLocationId(@NonNull final BPartnerId bpartnerId, @NonNull final LocationId locationId)
	{

		return Services.get(IQueryBL.class).createQueryBuilder(I_C_BPartner_Location.class)
				.addOnlyActiveRecordsFilter()
				.addEqualsFilter(I_C_BPartner_Location.COLUMNNAME_C_BPartner_ID, bpartnerId.getRepoId())
				.addEqualsFilter(I_C_BPartner_Location.COLUMNNAME_C_Location_ID, locationId.getRepoId())
				.create()
				.stream()
				.map(this::toBPartnerLocation)
				.map(BPartnerLocation::getId)
				.findFirst()
				.orElse(null);

	}
}
