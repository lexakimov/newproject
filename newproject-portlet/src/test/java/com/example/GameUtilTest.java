package com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		MoveLeftTest.class,
		MoveUpTest.class,
		MoveRightTest.class,
		MoveDownTest.class,
})
public class GameUtilTest {
}
