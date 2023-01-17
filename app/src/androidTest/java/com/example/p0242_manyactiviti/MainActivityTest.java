package com.example.p0242_manyactiviti;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressBack;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import static java.util.regex.Pattern.matches;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class MainActivityTest {

    @Rule public ActivityScenarioRule activityTestRule = new ActivityScenarioRule(MainActivity.class);

    @Test
    public void test_navSecondaryActivity() {
        onView(withId(R.id.btnActMain_to_two)).perform(click());
        onView(withId(R.id.secondary)).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void test_backPress_btnActTwo_to_main() {
//        ActivityScenario<MainActivity> scenario = activityTestRule.getScenario();
//        final activityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.btnActMain_to_two)).perform(click());
        onView(withId(R.id.secondary)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btnActTwo_to_main)).perform(click());  // method1

//        pressBack(); //method2 not working
        onView(withId(R.id.main)).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void test_Press_btn_fromMain_to_fifth_activity() {
        onView(withId(R.id.btnActMain_to_two)).perform(click());
        onView(withId(R.id.secondary)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btnActTwo_to_three)).perform(click());
        onView(withId(R.id.three)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btnActThree_to_four)).perform(click());
        onView(withId(R.id.activityFour)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btnActFour_to_fifth)).perform(click());
        onView(withId(R.id.activityFive)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.btnActFive_to_main)).perform(click());
        onView(withId(R.id.main)).check(ViewAssertions.matches(isDisplayed()));
    }
}