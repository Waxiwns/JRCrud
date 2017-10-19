# JRCrud
  CRUD (create, read, update, delete).
  
  
  https://github.com/andreichernov/CrudAppTry/blob/master/readme_img/db_table_example.png
  
  Стандартное CRUD приложение, которое отображает список всех книг в базе (с пейджингом по 10 книг на странице). С возможностью их удаления, редактирования, добавления новых, и поиска по уже существующим.
  
  Скрипт для наполнения базы лежит в корне проекта (CreateDB.sql) https://github.com/Waxiwns/JRCrud/blob/master/CreateDB.sql
  
  По умолчанию все добавленные книги не прочитаны (то есть поле "readAlready" == false).

Используемые технологии:  
  • Maven (для сборки проекта); 
  
  • Tomcat 8 (для тестирования приложения); 
  
  • Spring (версия 4.3.0.RELEASE); 
  
  • Hibernate (версия 5.2.1.Final); 
  
  • MySQL (база данных). Логином и пароль root; 
  
  • Frontend: Spring MVC 

