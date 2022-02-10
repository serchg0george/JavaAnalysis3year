package uni.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;

public class LoginSteps {


private LoginScreenModel rankingKids;

@Given("^Entring kindergarten ranking$")
public void entring_kindergarten_ranking() throws Throwable {
    rankingKids = new LoginScreenModel();
}

@When("^Working parents are over (\\d+) point$")
public void working_parents_are_over_point(int arg1) throws Throwable {
    rankingKids.isWorkingParents(true);
}

@When("^Disabled child gains (\\d+) points$")
public void disabled_child_gains_points(int arg1) throws Throwable {
	rankingKids.isDisabledChild(true);
}

@When("^Twins child gains (\\d+) point$")
public void twins_child_gains_point(int arg1) throws Throwable {
	rankingKids.isTwinChild(true);
}

@When("^Siblings in the same kindergarten (\\d+) point$")
public void siblings_in_the_same_kindergarten_point(int arg1) throws Throwable {
	rankingKids.isSiblingsInTheSame(true);
}

@Then("^Successfuly entered kindergarten$")
public void successfuly_entered_kindergarten() throws Throwable {
	assertEquals("Succesfuly entered!", rankingKids.getMessage());
}

@When("^Working parents have not (\\d+) or more points$")
public void working_parents_have_not_or_more_points(int arg1) throws Throwable {
    rankingKids.isWorkingParentsFalse(false);
}

@When("^Disabled child not gains (\\d+) points$")
public void disabled_child_not_gains_points(int arg1) throws Throwable {
	rankingKids.isDisabledChildFalse(false);
}

@When("^Twins child not gains (\\d+) point$")
public void twins_child_not_gains_point(int arg1) throws Throwable {
	rankingKids.isTwinsFalse(false);
}

@When("^There is no siblings in the same kindergarten (\\d+) point$")
public void there_is_no_siblings_in_the_same_kindergarten_point(int arg1) throws Throwable {
	rankingKids.isSiblingsFalse(false);
}

@Then("^Ranked is failed$")
public void ranked_is_failed() throws Throwable {
	assertEquals("Ranked is failes", rankingKids.getMessage());
}

@Then("^Have not points for twins$")
public void have_not_points_for_twins() throws Throwable {
	assertEquals("Have not points for twins", rankingKids.getMessage());
}


@Then("^Have not points for disabled child$")
public void have_not_points_for_disabled_child() throws Throwable {
	assertEquals("Have not points for disabled child", rankingKids.getMessage());
}

@When("^Disabled child not gains (\\d+) point$")
public void disabled_child_not_gains_point(int arg1) throws Throwable {
	rankingKids.isDisabledChildFalse(false);
}


}
