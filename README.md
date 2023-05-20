# RegistrationSys_StudentUI

This repo is connected with that repo: https://github.com/FayzaAhmed/RegistrationSys_AdminUI  </br>

## How to run
1- Make sure that the docker's daemon is running </br>
2- make a new folder named data beside the root folder of this project "RegistrationSys_AdminUI" </br>
3- add two new folders named database and batch under data </br>
4- add new file named db.csv in the data folder </br>
5- traverse to that directory the contains the .yml file </br>
6- run docker-compose up </br>
7- open another terminal </br>
8- run docker ps to get the id of the newly running container </br>
9- run docker attach "ID" </br>
10- put the input as instructed </br>
11- done ! </br>


ps: note that you have to enter the input in the second terminal based on what was printed in the first terminal.

