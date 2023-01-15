package com.example.p0242_manyactiviti;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ActivityTwoTest {

    @Rule
    public ActivityScenarioRule activityTestRule = new ActivityScenarioRule(ActivityTwo.class);

    @Test
    public void test_isActivityInView() {
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));
    }

    @Test
    public void test_visibility_title_backButton() {
        onView(withId(R.id.secondary_title)).check(matches(isDisplayed()));
        onView(withId(R.id.btnActTwo_to_three)).check(matches(isDisplayed()));
        onView(withId(R.id.btnActTwo_to_main)).check(matches(isDisplayed()));
    }

    @Test
    public void test_isTitleTextDisplayed() {
        onView(withId(R.id.secondary_title)).check(matches(withText("Activity Two")));
    }
}