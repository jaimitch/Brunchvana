# Brunchvana
BRUNCH vana
Charleston's Premiere BRUNCH resource
Name: Brunch​vana
Type: web application
Description: A web application that allows the user to search by
zipcode for restaurants that provide Brunch in the Charleston area.
Technologies:
● Front-end application
○ HTML/CSS
○ React
○ Redux library
○ Tachyons
● Back-end application
○ Java
○ Spring framework
○ JPA database
Features(MVP):
● Allow user to login and logout.
● Create a Homepage and search results restaurant cards.
● Create user database, restaurant, reviews(+rate) and events.
● Search the database by zip code and mood filters and provide
search results.
● User can click through to restaurant own webpages.
● User can view Events Page and Calendar.
Features (version 2.0+):
● Admin blog posts.
● login via third party authentication.
● Users can can create and add new reviews and rate (1-5)
Features(version 3.0++)
● Allow the user to register as (restauranter)
● Allow the restauranter to add new restaurants to the DB
-User story: Create database for restaurants, users, reviews with
rates and events.
-size:Large
-value:High
-assumptions: The data can be accessed and taken in.
-acceptance criteria: Data can be pulled via API into react for
functionality to work in UI
-notes:For MVP, restaurant data will be not be amended. User and
review databases will be used in 2.0
-User Story: Create a Homepage and search results restaurant cards.
-size:Medium
-value:High
-assumptions: The Home page will contain house the search
functionality, search results cards and a header and a footer.
-acceptance criteria: Search will populate restaurants on home page.
-Notes:
-User Story: Parse the database by location and atmosphere filter and
provide search results.
-size:Large
-value:High
-assumptions: The restaurant data will be filtered by location and
atmosphere and search results will populate on home page. The
individual data will include Name, Address, Phone, Image and website
URL.
-acceptance criteria: The search will yield results based on filters.
-Notes:
-User Story: Login for Users & logout button
-size:Medium
-value:Low
-assumptions: Login page will be created to establish users. A logout
button will populate in the header once login has commenced. In 2.0,
we will use third party authentication. Users can create reviews and
rate restaurants.
-acceptance criteria: Users remain logged in until logout button is
clicked.
-Notes:
-User Story: Create an events page and calendar.
-Size: Large
-Value: Medium
-assumptions: The events are stored in a database and then populated
in a calendar. There will be a sidebar of featured events through the
month.
-acceptance criteria: Calendar will show the data.
-Notes:
