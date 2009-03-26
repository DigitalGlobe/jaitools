/*
 * Copyright 2009 Michael Bedward
 *
 * This file is part of jai-tools.

 * jai-tools is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.

 * jai-tools is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with jai-tools.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package jaitools.media.jai.regionalize;

import jaitools.utils.CollectionFactory;
import java.util.Collections;
import java.util.List;

/**
 * Holds summary data for regions in an image generated with the
 * Regionalize operation.
 *
 * @see RegionalizeDescriptor
 * @author Michael Bedward
 */
public class RegionData {

    private List<RegionRec> recs = CollectionFactory.newList();

    /**
     * Constructor. Defined just to make it package-private.
     */
    RegionData() {}

    /**
     * Package private method to add data for a region
     */
    void addRegion(Region region) {
        recs.add(new RegionRec(region));
    }

    /**
     * Get the data for regions as an unmodifiable List of
     * {@linkplain RegionRec} objects.
     * @return
     */
    public List<RegionRec> getData() {
        return Collections.unmodifiableList(recs);
    }
}