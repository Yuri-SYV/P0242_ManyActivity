package com.example.p0242_manyactiviti;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class ManyActivityTest {

    @Rule public ActivityScenarioRule activityTestRule = new ActivityScenarioRule(MainActivity.class);

    @Test
    public void test_isActivityInView() {
        onView(withId(R.id.main)).check(matches(isDisplayed()));
    }

    @Test
    public void test_isButton_nextButton() {
        onView(withId(R.id.btnActMain_to_two)).check(matches(isDisplayed()));
        onView(withId(R.id.btnActMain_to_three)).check(matches(isDisplayed()));
        onView(withId(R.id.btnActMain_to_four)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
        onView(withId(R.id.btnActMain_to_fifth)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }

}
