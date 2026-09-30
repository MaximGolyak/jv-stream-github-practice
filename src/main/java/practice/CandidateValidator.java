package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate candidate) {
        String period = candidate.getPeriodsInUkr();
        int start = Integer.parseInt(period.split("-")[0]);
        int end = Integer.parseInt(period.split("-")[1]);
        int yearsInUkr = end - start;

        return candidate.getAge() >= 35
                && candidate.isAllowedToVote()
                && candidate.getNationality().equals("Ukrainian")
                && yearsInUkr >= 10;
    }
}
