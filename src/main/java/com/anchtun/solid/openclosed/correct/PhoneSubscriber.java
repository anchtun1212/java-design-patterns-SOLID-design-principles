package com.anchtun.solid.openclosed.correct;

import java.util.List;

import com.anchtun.solid.openclosed.model.CallHistory;

// open for modification
public class PhoneSubscriber extends Subscriber {

	@Override
	public double calculateBill() {
		List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
		long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
		return totalDuration * baseRate / 100;
	}
}
