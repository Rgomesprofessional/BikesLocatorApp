# Bikes Locator App
By Romulo Gomes - 15640

Available on Google Play Store:  
https://play.google.com/store/apps/details?id=com.rgomesprofessional.rgome.bikeslocatorapp 
 
The App basically consists of selecting a city in the list in order to see where the Bike Stations are located. 
The first Button "Stations" shows just the list of stations from the selected city with some extra info and when the user clicks on it the weather from the current location is displayed. 

The second Button "Map" shows the exact location from the stations and also from the user. The map is centralized according to the user position. When clicking on the station the user has the option to see the distance between each other and the best way to arrive there.   

The third button "About" shows a short description from the App and also the name and links from who created. 
 
In order to complete the project, some tutorials from Youtube were used, for example, to upload the project to Github I used the following link https://www.youtube.com/watch?v=Ldmc757EXaE&index=16&list=PL_PaSTBkUwk4PXlhZIe4COpwnWeCRnw2F  
 
To Learn how I could use the API from Google Maps to calculate the distance I used following one https://www.youtube.com/watch?v=CCZPUeY94MU&t=873s 
 
Some research on https://stackoverflow.com/ also was necessary to have some ideas about how to fix some bugs. 
 
The hardest challenge creating the App happened when after getting the data from JSON it wasn't possible to open a new Activity or when it opened there wasn't enough time to bring the date fetched together. Neither Tutorials from Youtube nor Stackflow were able to help with this problem. Fortunately, after long hours the solution came up with the idea of letting the Spinner Clickable so after selecting the city the data would have enough time to be stored before the user clicks on a different Button, for example, Station or Map. Later on another idea to solve the same problem was implemented in the list with the stations, in order to have enough time for the data get fetched from the JSON a timer was used and just after few seconds the Activity was changed displaying the Weather Info.  
 
Another Challenge to deal was the fact that after downloading the App from Google Play Store, the Map was not showing on the screen. The soultion to solve the proble was add more permissions and a dependency. The following video helped in this process. https://play.google.com/store/apps/details?id=com.rgomesprofessional.rgome.bikeslocatorapp 
