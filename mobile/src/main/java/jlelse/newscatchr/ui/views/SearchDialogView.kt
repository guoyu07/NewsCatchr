/*
 * NewsCatchr
 * Copyright © 2017 Jan-Lukas Else
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package jlelse.newscatchr.ui.views

import android.content.Context
import android.text.InputType
import android.widget.AutoCompleteTextView
import org.jetbrains.anko.lines

class SearchDialogView(context: Context) : AutoCompleteTextView(context) {

	init {
		threshold = 3
		inputType = InputType.TYPE_TEXT_FLAG_AUTO_COMPLETE
		lines = 1
		maxLines = 1
		minLines = 1
		requestFocus()
	}

}