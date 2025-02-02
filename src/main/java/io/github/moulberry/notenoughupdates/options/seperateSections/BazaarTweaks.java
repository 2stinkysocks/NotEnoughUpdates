/*
 * Copyright (C) 2022 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.options.seperateSections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigAccordionId;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigEditorAccordion;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigEditorBoolean;
import io.github.moulberry.notenoughupdates.core.config.annotations.ConfigOption;

public class BazaarTweaks {

		@ConfigOption(
			name = "Search GUI",
			desc = ""
		)
		@ConfigEditorAccordion(id = 0)
		public boolean searchAccordion = false;

		@Expose
		@ConfigOption(
			name = "Enable Search GUI",
			desc = "Use the advanced search GUI with autocomplete and history instead of the normal sign GUI"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean enableSearchOverlay = true;

		@Expose
		@ConfigOption(
			name = "Keep Previous Search",
			desc = "Don't clear the search bar after closing the GUI"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean keepPreviousSearch = false;

		@Expose
		@ConfigOption(
			name = "Past Searches",
			desc = "Show past searches below the autocomplete box"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean showPastSearches = true;

		@Expose
		@ConfigOption(
			name = "ESC to Full Close",
			desc = "Make pressing ESCAPE close the search GUI without opening up the Bazaar again\n" +
				"ENTER can still be used to search"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean escFullClose = true;

	@Expose
	@ConfigOption(
		name = "Bazaar Sacks Profit",
		desc = "Orders the items in your sacks in the bazaar inventory and adding buy order toggle"
	)
	@ConfigEditorBoolean
	public boolean bazaarSacksProfit = true;
}
