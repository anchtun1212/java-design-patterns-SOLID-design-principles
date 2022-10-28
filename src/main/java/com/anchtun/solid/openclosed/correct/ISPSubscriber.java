package com.anchtun.solid.openclosed.correct;

import java.util.List;

import com.anchtun.model.InternetSessionHistory;

import lombok.Data;
import lombok.EqualsAndHashCode;


// open for modification
@EqualsAndHashCode(callSuper=false)
@Data
public class ISPSubscriber extends Subscriber {
    private long freeUsage;
    
    @Override
	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
		long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargeableData = totalData - freeUsage;
		return chargeableData * baseRate / 100;
	}
}
