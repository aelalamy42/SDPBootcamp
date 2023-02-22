package com.example.aelalamy.helloworld;

import android.content.Context;
import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.intent.Intents.*;
import static androidx.test.espresso.intent.matcher.IntentMatchers.*;
import static androidx.test.espresso.intent.Checks.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class GreetingsActivityTest {
    @Rule
    public ActivityScenarioRule<GreetingActivity> testRule = new ActivityScenarioRule<>(GreetingActivity.class);

    @Test
    public void clickOnButtonWorks() {
        Intents.init();
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        intent.putExtra("NAME", "Ahmed Elalamy");
        intending(hasExtra("NAME", "Ahmed Elalamy"));
        try(ActivityScenario scen = ActivityScenario.launch(intent)){
            onView(withId(R.id.greetingMessage)).check(matches(withText("Hello Ahmed Elalamy!")));
        }
        Intents.release();
    }
}

