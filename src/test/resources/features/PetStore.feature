Feature: Pet Store Feature

  @get @shakeout1
  Scenario Outline: Find pet by pet id
    Given User needs to find the pet by pet "<id>"
    Examples:
      | id |
      | 3  |

  @get @shakeout1
  Scenario Outline: Find pet by pet status
    Given User needs to find the pet by status "<status>"
    Examples:
      | status      |
      | available   |
      | unavailable |

  @get @shakeout1
  Scenario Outline: Add a pet
    Given User needs to add the pet by "<id>","<name>","<photoUrls>" and "<status>"
    Examples:
      | id | name | photoUrls | status    |
      | 3  | Jose | String    | Available |

  @get @shakeout1
  Scenario Outline: Delete a pet
    Given User needs to delete the pet by pet "<id>"
    Examples:
      | id |
      | 3  |