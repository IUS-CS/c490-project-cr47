# CSCI C490 Design Document Requirements

## Section 1 – Motivation for Your App
This is why I chose this app I am not a big gambler but I know a lot of people who are. My first choice was to have a sports gambling app since they just legalized sports gambling. The only reason I didn’t go with this is because the odds change on a regular bases and it would seem like I would have time to complete on time. This site is a example [Luck Lottery] (http://www.lotterynumbergenerator.net/lottery-number-generator-app) . This site is currently available on android store.

## Section 2 - Meeting Minimum Requirements


### 2.1 User Interface.
1.	This application shall work in portrait and landscape format. You will be able to flip the screen and see that it will render in both formats without loosing any content. I haven’t decided which type of layout to use to do this yet because the only layouts we have worked with so far is constraint, frames, and linear layouts. With more research, I should be able to properly find the right fit for the project.

2.	Right now, I am pretty sure that this project will not need any exceptions. Everything will be wrapped in some sort of container that it will look good In either landscape or portrait layout.


3.	I will be testing this app on not only the Samsung Tab 10.1 and Nexus Asus 7 but also I have my own personal phone that I will also test it on. It just happens to be the Samsung Galaxy Note 8.

4.	I can make sure no exception I will test it with every device I can get my hands on. 

5.	You must submit diagrams for all the different screens in your app (both portrait and landscape configurations), one diagram per screen. These diagrams must clearly show the layout of your app’s screens, i.e., where images, menus, widgets, views, etc., appear. These can be hand drawn with a .png submitted of the drawing.

![Pr4ojectimage](/img/mockup.png)
### 2.2 Data Persistence
1.	Your app must demonstrate that it saves data from one use to another
2.	To test this, your app will be shut down by an onDestroy() event, and then restarted
3.	Data entered in by the user during one use must be present when the app is restarted for another use
2.3 Communication
•	Your app must demonstrate that it communicates with the outside world, with either another device or an external resource
When this app is complete it will be able to upload on the android store. It will have plenty of room for improvement but it will compete with any other small apps on the market

## Section 3 – MVC Breakdown of Your App

In this section, you must utilize the MVC Design Pattern to describe each of the screens supported by your app. There are a couple of ways you might go about organizing this section of your document:
1.	This approach uses one design document section per screen – i.e., provide View, Model, and Controller descriptions about each screen, one screen’s MVC set of descriptions after another
2.	This approach has three sections, a View section, a Model section, and a Controller section. In the View section provide a description of each screen appearing in your app, in the Model section provide a description of all Java classes used in the model, in the Controller section provide a description of all controllers required by your app

### 3.1 View Descriptions
USER INTERFACE::
There will be at least three or four different views for the user to be able to see in order to implement values into. The first view will be the homepage to show what different kinds of lottery numbers can be generated. The second page will be like a pick three generated numbers, third page will be pick 5 generated numbers, and the last page will be like a Powerball that will generate five numbers and the sixed number will be from a larger pull of numbers. The constraint or the frames layout might work best because the app will be able to switch between portrait and landscape. The xml will look like buttons that you will be able to push to see what numbers are generated. If you push the back button it will go back to the previous screen and if you continue forward it will generate a new entry. 
In the description of each screen’s view, provide a diagram (See Section 2.1, above for details about this diagram). These diagrams will more than likely be identical to the ones used to satisfy Section 2 requirements, that is permissible. If the screen contains active widgets, e.g., a Button, then for each of these active widgets you must describe how the user interacts with the widget, what happens when the user does interact with the widget, and the name of the method/operation that is the “listener” for the widget – e.g., user pushes OK button to go back to previous screen, the goBack method in the Java class DataEntryActivity is the listener for this Button.
Include in this part the name of the .xml Layout file associated with each View and the various minimum screen sizes supported (in dp), e.g., 600dp and 800dp. Please include the root layout utilized by each View, e.g., ConstraintLayout, GridLayout, LinearLayout, etc., and why you elected to choose that particular root layout. It might be possible that you have decided to construct a View by writing Java methods and that the View’s .xml file is minimal. If that is the case be sure to name the controller that will be constructing your View along with the names of the methods that will have the implementation code.

### 3.2 Model Descriptions
DATA::
These classes can store the random numbers so that it can keep up with every combination that has already been selected and how many times that these numbers come out. 
Start off with a high-level description of what data needs to be stored, and what Java classes and/or databases/external resources will be utilized to store this data.
For each Java class used to store data, you must supply the name of the class, and a list of all public methods called by clients of the class (note: Controller classes are the likely clients). If a method has a precondition that must be satisfied by the calling client, e.g., a setter method that stores positive integer, then you must include a requires clause stating what the precondition is – this requires clause can be written in English or user mathematics if possible. Utilize design by contract in your design of the model java classes, i.e., if a setter method stores only positive integers, the setter method has a requires clause indicating that the value being supplied by the client must be positive, and the setter method does not have an if statement to check the requires clause.
If your app’s model is utilizing an SQL database or some resource in the cloud, then you must provide a detailed description of this database/resource. For example, for a database answer at least the following, what tables will be present, what columns are in each of the tables, what are the data types of each of the columns, which column (if any) is the key field, how the tables relate to one another, etc.

### 3.3 Controller Descriptions
 CODE::
This area will handle the code that controls the user interface. There will be a button that will be set on the onCreate that control the button to generate the numbers. When button is clicked this will look for the function that will handle the random numbers that will be generated. Now when you change from landscape to portrait 
Start off with a high-level description of each controller and what screen it controls. Then include which Life Cycle methods are overridden by the controller. This part of the description will almost certainly have to include as a minimum how onCreate is implemented. Describe how and when the controller saves off data into the model, and how and when it retrieves data from the model.
You must describe how your app will satisfy the data persistence requirement in the controller descriptions and/or the model descriptions. If the model is designed so that it always keeps the persistent data store up-to-date, then the model description will more than likely discuss persistence. If the controller is implemented to update the persistent data store at some specific time of the app’s life cycle, then the controller’s description will more than likely discuss persistence. The discussion might need to appear in both the model and the controller descriptions.
