package com.spilab.percom21;

import android.graphics.Color;

import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.hasBackground;
import static androidx.test.espresso.matcher.ViewMatchers.hasTextColor;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
    @LargeTest
    public class HelloWorldEspressoTest {




    @Rule public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

//    @Test
//    public void listGoesOverTheFold() {
//        onView(withText("Hello world!")).check(matches(isDisplayed()));
//    }


    @Test
    public void changeText_sameActivity() {
        // Type text and then press the button.
//        onView(withId(R.id.editTextTextPersonName))
//                .perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());

        onView(withId((R.id.buttonSendRequest))).perform(click());
        //onView(withId(R.id.changeTextBt)).perform(click());


        onView(withId(R.id.buttonSendRequest)).check(ViewAssertions.matches(hasTextColor(Color.RED) ));
        //onView(withId(R.id.buttonSendRequest)).check(ViewAssertions.matches(bac ));
    }

}