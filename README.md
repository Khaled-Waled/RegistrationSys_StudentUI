# RegistrationSys_StudentUI

This repo is connected with this repo: https://github.com/Khaled-Waled/RegistrationSys_StudentUI  </br>
Through these steps, the docker compose file builds and runs the two images the one in this repo and the one in the RegistrationSys_AdminUI repo
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

