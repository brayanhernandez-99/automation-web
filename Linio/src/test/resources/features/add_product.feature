Feature: As a user, I need to make the purchase of several products from multiple categories.

  @AddConsolesSuccessfully
  Scenario: the user added successfully products from the category consoles and video games.
    Given that the user is on the page
    When the user adds products from the category consoles and video games
      | name                                        |
      | Videojuego Fifa 21 PS4                      |
      | Nintendo Switch Nuevo Modelo Neon           |
      | Consola Nintendo Switch Lite - 32GB         |
      | Consola Xbox Series S 512Gb  Rrs-00004...   |
      | Consola Playstation 4 Slim Black Ps4 Sli... |
    Then the user validate that the total value of the products matches $5.368.600

  @PriceDoesNotMatchOnConsoles
  Scenario: The prices do not match the expected total value.
    Given that the user is on the page
    When the user adds products from the category consoles and video games
      | name                                |
      | Videojuego Fifa 21 PS4              |
      | Nintendo Switch Nuevo Modelo Neon   |
      | Consola Nintendo Switch Lite - 32GB |
    Then the user validate that the total value of the products matches $0

  @AddMattressSuccessfully
  Scenario: The user successfully added products from the mattress and bed base category.
    Given that the user is on the page
    When the user adds three products from the category mattress and bed base
    Then the user validate that the total value of the products matches $437.700
    And the user valid that the quantity of the product matches Subtotal (3)

  @PriceDoesNotMatchOnMattress
  Scenario: The prices do not match the expected total value.
    Given that the user is on the page
    When the user adds three products from the category mattress and bed base
    Then the user validate that the total value of the products matches $0
    And the user valid that the quantity of the product matches Subtotal (3)

  @QuantityDoesNotMatchOnMattress
  Scenario: The quantity do not match the expected total.
    Given that the user is on the page
    When the user adds three products from the category mattress and bed base
    Then the user validate that the total value of the products matches $437.700
    And the user valid that the quantity of the product matches Subtotal (0)

  @PriceAnQuantityDoesNotMatchOnMattress
  Scenario: The quantity the prices do not match the expected total.
    Given that the user is on the page
    When the user adds three products from the category mattress and bed base
    Then the user validate that the total value of the products matches $0
    And the user valid that the quantity of the product matches Subtotal (0)

  @AddClothesCorrectly
  Scenario: The user successfully added products from the fashion category.
    Given that the user is on the page
    When the user adds products from the category fashion
      | name                          | lowest_price | maximum_price |
      | Medias Adidas No-Show 3 Pares | 15000        | 400000        |
    Then the user validate that the total value of the products matches $53.000

  @AddSuccessfullyTxt
  Scenario: The user successfully added products from file txt.
    Given that the user is on the page
    When the user adds products from the category consoles and video games
      | name                                |
      | Videojuego Fifa 21 PS4              |
      | Nintendo Switch Nuevo Modelo Neon   |
      | Consola Nintendo Switch Lite - 32GB |
    And the user adds three products from the category mattress and bed base
    And the user adds products from the category fashion
      | name                          | lowest_price | maximum_price |
      | Medias Adidas No-Show 3 Pares | 15000        | 400000        |
    And the products are saved in the txt file
      | amount | price      | total_price |
      | 1      | $139.900   | $139.900    |
      | 1      | $1.499.900 | $1.639.800  |
      | 1      | $839.900   | $2.479.700  |
      | 3      | $145.900   | $2.977.400  |
      | 1      | $45.000    | $2.962.400  |
    Then is validated that the value total matches

  @DeleteSuccessfully
  Scenario: The user adds products and will remove all products to validate a message.
    Given that the user is on the page
    When the user adds products from the category consoles and video games
      | name                                |
      | Videojuego Fifa 21 PS4              |
      | Nintendo Switch Nuevo Modelo Neon   |
      | Consola Nintendo Switch Lite - 32GB |
    And the user adds three products from the category mattress and bed base
    And the user adds products from the category fashion
      | name                          | lowest_price | maximum_price |
      | Medias Adidas No-Show 3 Pares | 15000        | 400000        |
    And the user deletes all products
    Then the user will delete all products and validate message No hay productos en tu carrito
