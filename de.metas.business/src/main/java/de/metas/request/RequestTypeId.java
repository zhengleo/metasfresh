package de.metas.request;

import org.adempiere.util.Check;

import lombok.Value;

/*
 * #%L
 * de.metas.business
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

@Value
public class RequestTypeId
{
	public static RequestTypeId ofRepoId(final int repoId)
	{
		return new RequestTypeId(repoId);
	}

	public static RequestTypeId ofRepoIdOrNull(final int repoId)
	{
		return repoId > 0 ? ofRepoId(repoId) : null;
	}

	public static int toRepoId(final RequestTypeId RequestTypeId)
	{
		return RequestTypeId != null ? RequestTypeId.getRepoId() : -1;
	}

	int repoId;

	private RequestTypeId(final int repoId)
	{
		this.repoId = Check.assumeGreaterThanZero(repoId, "repoId");
	}
}
