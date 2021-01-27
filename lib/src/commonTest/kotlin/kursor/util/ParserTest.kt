package kursor.util

import kotlin.test.*

class ParserTest {
  @Test
  fun parsesNestedJson() {
    val json = """
    {
      "object": {
        "double": 1.12,
        "integer": 420,
        "boolean": true,
        "null": null
      },
      "array": [
        {
          "double": 1.12,
          "integer": 420,
          "boolean": true,
          "null": null
        },
        "abc",
        123,
        -1.36,
        true,
        false,
        null
      ],
      "double": 1.12,
      "integer": 420,
      "boolean": false,
      "null": null
    }
    """.trimIndent()
    val parsed = "${parse(json)}"
    assertEquals(parsed, "${parse(parsed)}")
  }
}
