package com.pos.dto.recept;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.pos.util.NumberUtil;
import com.pos.util.TicketItemRowCreator;

public class TicketDataSource extends AbstractReportDataSource {
	
	public TicketDataSource() {
		super(new String[] { "itemName", "itemQty", "itemSubtotal" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public TicketDataSource(Ticket ticket) {
		super(new String[] { "itemName", "itemQty", "itemSubtotal" }); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		setTicket(ticket);
	}
	
	private void setTicket(Ticket ticket) {
		ArrayList<TicketItem> rows = new ArrayList<TicketItem>();

		LinkedHashMap<String, TicketItem> tableRows = new LinkedHashMap<String, TicketItem>();
		TicketItemRowCreator.calculateTicketRows(ticket, tableRows);

		rows.addAll(tableRows.values());
		setRows(rows);
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		TicketItem item = (TicketItem) rows.get(rowIndex);

		switch (columnIndex) {
			case 0:
				return item.getNameDisplay();

			case 1:
				Integer itemCountDisplay = item.getItemCountDisplay();
				
				if(itemCountDisplay == null) {
					return null;
				}
				
				return String.valueOf(itemCountDisplay);

			case 2:
				Double total = item.getTotalAmountDisplay();
				if(total == null) {
					return null;
				}
				
				return NumberUtil.formatNumber(total);
		}

		return null;
	}
}
