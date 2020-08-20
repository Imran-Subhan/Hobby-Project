<p align="center">
    ReadMe For Hobby Project 
    <br />
  <a href="https://github.com/Imran-Subhan/Hobby-Project"><strong>Explore the docs »</strong></a>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)




<!-- ABOUT THE PROJECT -->
## About The Project

This Project is focused around making a website based on a hobby which consists of a front-end in Visual Code Studio
and back-end in Spring Tool Suite 4. In my free time I enjoy watching/playing Football and the team that I support is Arsenal FC so I have
chosen to build my project based on my favourite team Arsenal.

My website consists of a back-end that communicates with front-end to implement CRUD functionality in the user login and registration pages
and also in the create stats and create team pages. 

Users can access my website to create their player and add to their team with stats and player numbers they have chosen for the Arsenal 
players. The players that they have created will be shown in a table in the create team page so they can look at the squad they have
created. The website can easily be edited in the front-end (Arsenal_Project) to include players from any team in the select player name section of the form in the 'Create' page.

Users can also register as a member in the 'become a member' page and login in the 'login' page to gain access to a members branch of the
website which isn't much different to the main website but features can be added to it to give members more to do. The main differences
between the members branch and the original is the change in the 'become a member' navigation tab because there is no need for a member to 
register again. I have decided to replace 'become a member' with an 'my profile' tab to allow members to see they're user id, username and
password and they can also update their password or delete their account. I have also added a 'sign out' button to replace the login button
on the homepage. 


### Built With
This section should list any major frameworks that you built your project using. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.
* [Bootstrap](https://getbootstrap.com)
* [JQuery](https://jquery.com)
* [AJAX](https://cdnjs.cloudflare.com/ajax/)
* [W3schools](https://www.w3schools.com)
* [springframework]


## Getting Started

To get this project up and running first fork the project and the clone it so the back-end and front-end is stored locally. Now to get the back-end running open 'NewProject1' in Spring Tool Suite 4 and navigate to 'application properties' in the src/main/resources folder. If you have MySQL installed this project can be run on a local database by changing the IP address in spring.datasource.url to local host. if you want to run the project through a cloud database instance you can replace the IP address with the IP address your instance is running on. Also change the password and Username to match the login credentials to access your database.

Once this is done you can run the spring boot application from the runner file to run the back-end. You can the access the front-end which is kept in 'Arsenal_Project' and edit and use all the features.

### Prerequisites

- You will need a local database or a database instance on cloud
- You will need application that can edit HTML,JS and css files for example Visual Studio Code.
- you will need to download and install Spring Tool suite to run & edit the back-end


## License

Distributed under the MIT License. See `LICENSE` for more information.
