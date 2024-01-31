package de.unistuttgart.iste.sqa.pse.sheet13.presence.hamsterclub;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

/**
 * A club of hamsters.
 */
public final class HamsterClub implements Club {

	private final List<ClubMember> members;
	private final Comparator<ClubMember> clubMemberComparator;

	/**
	 * Create a new {@code HamsterClub}.
	 *
	 * @param members members of the club. Must not be null.
	 * @throws IllegalArgumentException if members is null.
	 */
	public HamsterClub(final List<ClubMember> members) throws IllegalArgumentException {
		if (members == null) {
			throw new IllegalArgumentException();
		}
		this.members = members;
		this.clubMemberComparator = generateComparator();
	}

	@Override
	public List<String> getNameOfMembers() {
		return members.stream()
				.map(ClubMember::getName)
				.sorted()
				.collect(Collectors.toList());
	}

	@Override
	public double getTotalContributions() {
		return members.stream()
				.mapToDouble(ClubMember::getContributions)
				.sum();
	}

	@Override
	public void applyDiscount() {
		// TODO: implement
		
	}

	@Override
	public List<ClubMember> getMembersWithUnpaidFees() {
		// TODO: implement
		return null;
	}

	/**
	 * implement your Comparator here
	 */
	private Comparator<ClubMember> generateComparator() {
		// TODO: implement
		return null;
	}

	@Override
	public ClubMember getOldestMember() {
		// TODO: implement
		return null;
	}

	@Override
	public List<ClubMember> getMembers() {
		return members;
	}
}
