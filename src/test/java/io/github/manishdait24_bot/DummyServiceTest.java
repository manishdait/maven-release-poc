package io.github.manishdait24_bot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyServiceTest {
  @Test
  void testSayHi() {
    DummyService dummyService = new DummyService();
    String actual = dummyService.sayHi();

    Assertions.assertEquals("Hello World", actual);
  }
}

