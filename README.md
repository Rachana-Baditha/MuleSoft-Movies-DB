# MuleSoft-Movies-DB
Assessment for MuleSoft Screening Test given on Aug 6th, 2022

In the aformentioned assignment, we were tasked with using any database and programming language to create a database of our favorite movies, and interact with it to add and extract data. 

For this, I chose to use MySQL and Java respectively.


STEP 1: Create Database and Table

First, the following query was run to create the database named "Movies" and a table "Favorites" with the following structure:

    favorites
    (  movie_name VARCHAR(30), 
       main_actor VARCHAR(25), 
       release_year INT, 
       director VARCHAR(25)
                            )
                            
After the table was created, entries for 11 movies were inserted. Once inserted, the table appeared as such:

+-----------------------+-------------+--------------+------------+
| movie_name            | main_actor  | release_year | director   |
+-----------------------+-------------+--------------+------------+
| Dune                  | Chalamet    |         2021 | Villeneuve |
| Inception             | DiCaprio    |         2010 | Nolan      |
| Toy Story             | Hanks       |         1995 | Lasseter   |
| Your Name             | Miyamizu    |         2016 | Shinkai    |
| Apollo 13             | Hanks       |         1995 | Howard     |
| The King              | Chalamet    |         2019 | Michod     |
| Tick Tick Boom        | Garfield    |         2021 | Miranda    |
| Back to the Future    | Fox         |         1985 | Zemeckis   |
| Soul                  | Ayoade      |         2020 | Docter     |
| Kiki Delivery Service | Yakayama    |         1989 | Miyazaki   |
| Star Wars 3           | Christensen |         2005 | Lucas      |
+-----------------------+-------------+--------------+------------+


STEP 2: Execute Queries

Two queries were executed on the database using JDBC. 

The first was to select and print all movies in the "favorites" table. This was done via the query "SELECT * FROM favorites;". The result of this query is:

-------------------------------------------------------------

NAME 		 MAIN ACTOR 		 RELEASE YEAR 		 DIRECTOR

Dune 		 Chalamet 		 2021 		 Villeneuve
Inception 		 DiCaprio 		 2010 		 Nolan
Toy Story 		 Hanks 		 1995 		 Lasseter
Your Name 		 Miyamizu 		 2016 		 Shinkai
Apollo 13 		 Hanks 		 1995 		 Howard
The King 		 Chalamet 		 2019 		 Michod
Tick Tick Boom 		 Garfield 		 2021 		 Miranda
Back to the Future 		 Fox 		 1985 		 Zemeckis
Soul 		 Ayoade 		 2020 		 Docter
Kiki Delivery Service 		 Yakayama 		 1989 		 Miyazaki
Star Wars 3 		 Christensen 		 2005 		 Lucas

-------------------------------------------------------------

The second query was to select movies by a particular actor. The actor chosen for this example is "Tom Hanks", represented in the database simply as "Hanks". This was done vis the query "SELECT * FROM favorites WHERE main_actor = "Hanks";". The result of this query is:

-------------------------------------------------------------

NAME 		 MAIN ACTOR 		 RELEASE YEAR 		 DIRECTOR

Toy Story 		 Hanks 		 1995 		 Lasseter
Apollo 13 		 Hanks 		 1995 		 Howard

-------------------------------------------------------------

