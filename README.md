# tdd-example
TDD demo

Customer came up with an idea of brand-new twitter. It should be just like Twitterm, but better.
Customer want to see working prototype tomorrow. 

Let's create requirements for the RESTful service:

* There should be /users
* User email is required and unique
* User can have unique nickname and should be accessible through it (and id) 
* Optional user info: password, name, age, city, sex.
* /login is setting current user
* /logout
#
* There should be /tweets
* Tweet should not be empty
* Max length is 128 symbols
* Tweet must have it's author
* Author should be able to edit/delete own tweets
* Any user can see other tweets
* Users can like/dislike tweets
#
