KarotzProjectGenerator
======================

Generate a project for Karotz.

This project generates main and util javascript files and descriptor and screen xml files. 
In the descriptor.xml file, all access rules are generated, you must remove rules which are not necessary for your project.
In the screen.xml file, you find an example of a parameter that the user of your application have to fill to use your application.

To use the generator, you can download the jar file available [here](http://michel-dirix.com/projects/karotz.jar) and write "java -jar karotz.jar <projectName>" in the terminal. It generate the project where you have launched the command.