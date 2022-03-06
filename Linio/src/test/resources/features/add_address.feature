Feature: As a user, I wish to carry out the shipping process through the 'Shipping address' form,
  which is in the option to process purchase after adding a product to the cart.

  Background: Access shipping address
    Given the user is on the page
    When the user login
      | email                  | password     |
      | xotode3576@w3boats.com | S3millero#15 |
    Then the user adds a product to the shopping cart

  @ValidateSaveAddressbuttons
  Scenario Outline: The user will validate the save address button
    Given the user is on the page add shipping address
    When the user adds the information
      | name   | lastName   | phone   | otherPhone   | idType   | idNumber   | address   | neighborhood   | department   | municipality   | specialInstructions   |
      | <name> | <lastName> | <phone> | <otherPhone> | <idType> | <idNumber> | <address> | <neighborhood> | <department> | <municipality> | <specialInstructions> |
    Then the user will validate the save address button
    Examples:
      | name   | lastName  | phone      | otherPhone | idType               | idNumber   | address       | neighborhood | department | municipality | specialInstructions |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Medellin     |                     |
      |        |           |            | 3132031330 | Cédula de Ciudadanía |            |               |              | Antioquia  | Medellin     | Piso 2              |
      |        |           |            |            | Cédula de Ciudadanía |            |               |              | Antioquia  | Medellin     |                     |

  @ValidateNumberPhone
  Scenario Outline: The user will validate the number phone
    Given the user is on the page add shipping address
    When the user adds the information
      | name   | lastName   | phone   | otherPhone   | idType   | idNumber   | address   | neighborhood   | department   | municipality   | specialInstructions   |
      | <name> | <lastName> | <phone> | <otherPhone> | <idType> | <idNumber> | <address> | <neighborhood> | <department> | <municipality> | <specialInstructions> |
    Then the user will validate the number phone
    Examples:
      | name   | lastName  | phone  | otherPhone | idType               | idNumber   | address       | neighborhood | department | municipality | specialInstructions |
      | Brayan | Hernandez | prueba |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Medellin     |                     |

  @ValidateNumberId
  Scenario Outline: The user will validate the number id
    Given the user is on the page add shipping address
    When the user adds the information
      | name   | lastName   | phone   | otherPhone   | idType   | idNumber   | address   | neighborhood   | department   | municipality   | specialInstructions   |
      | <name> | <lastName> | <phone> | <otherPhone> | <idType> | <idNumber> | <address> | <neighborhood> | <department> | <municipality> | <specialInstructions> |
    Then the user will validate the number id
    Examples:
      | name   | lastName  | phone      | otherPhone | idType               | idNumber | address       | neighborhood | department | municipality | specialInstructions |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | prueba   | CL 92 # 92-11 | Castilla     | Antioquia  | Medellin     |                     |

  @ValidateMunicipality
  Scenario Outline: The user will validate the list of municipalities
    Given the user is on the page add shipping address
    When the user adds the information
      | name   | lastName   | phone   | otherPhone   | idType   | idNumber   | address   | neighborhood   | department   | municipality   | specialInstructions   |
      | <name> | <lastName> | <phone> | <otherPhone> | <idType> | <idNumber> | <address> | <neighborhood> | <department> | <municipality> | <specialInstructions> |
    Then the user will validate the list of municipalities
    Examples:
      | name   | lastName  | phone      | otherPhone | idType               | idNumber   | address       | neighborhood | department | municipality | specialInstructions |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Andes        |                     |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Segovia      |                     |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Amalfi       |                     |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Angelopolis  |                     |

  @ValidateShippingAddress
  Scenario Outline: The user will validate that the shipping address matches
    Given the user is on the page add shipping address
    When the user adds the information
      | name   | lastName   | phone   | otherPhone   | idType   | idNumber   | address   | neighborhood   | department   | municipality   | specialInstructions   |
      | <name> | <lastName> | <phone> | <otherPhone> | <idType> | <idNumber> | <address> | <neighborhood> | <department> | <municipality> | <specialInstructions> |
    Then The user will validate that the shipping address matches <address>
    Examples:
      | name   | lastName  | phone      | otherPhone | idType               | idNumber   | address       | neighborhood | department | municipality | specialInstructions |
      | Brayan | Hernandez | 3132031330 |            | Cédula de Ciudadanía | 1152715206 | CL 92 # 92-11 | Castilla     | Antioquia  | Medellin     |                     |
