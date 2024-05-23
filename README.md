# WESTERN GOVERNOR UNIVERSITY D287 Performance Assessment Kristijan Mikulic
## TASK C
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

#### CHANGES MADE
#### - mainscreen.html
> Lines 14 and 19 Centering of page title and changed the name of the shop
> 
> Lines 21,30,31,35,36,37,53,71,72 and 37 Made changes to the name of things

#### - inhousepartform.html
> Line 10-12 Added shop title
> 
> Lines 16,17,19,20,23,24,27 and 28 Made changes to name of things

#### - outsourcedpartform.html
> Lines 10-12 Added shop title
>  
> Lines 19,20,22,23,25,27,30 and 31 Made changes to name of things


#### - productform.html
> Lines 12-15 Added shop title
> 
> Lines 20,21,23,24,26 and 27 Made changes to name of things

#### - saveproductscreen.html
> Lines 8 and 9 Added shop title

#### - negativeerror.html
> Lines 8 and 9 Added shop title

#### -confirmationdeletepart.html
> Lines 10 and 11 Added shop title

#### -confirmationdeleteproduct.html
> Lines 10 and 11 Added shop title

#### -confirmassocpart.html
> Lines 10 and 11 Added shop title

#### -confirmationaddpart.html
> Lines 10 and 11 Added shop title

#### -confirmationaddproduct.html
> Lines 10 and 11 Added shop title


## TASK D
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

#### CHANGES MADE

#### -about.html
> Added new file about.html
> Lines 3-6 Head
> Lines 8-16 Description about the company
> Lines 17-18 Adds link to main page

#### AboutController.java
> Added new file AboutController.java
> lines 8-13 adds controller for the about.html to allow for access on the website

#### mainscreen.html
> Lines 90-91 Adds link to about page

## TASK E
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

#### CHANGES MADE

#### -BootStrapData.java
> Lines 41-82 Added 5 different sample parts when there are no parts available on startup of application

> Lines 90-101 Added 5 different sample products when there are no products available on startup of application

## TASK F
Add a “Buy Now” button to your product list.

#### CHANGES MADE

#### -BuyController.java
> New file to handle the buy operations will return two different pages depending on if the item is in stock or not
> Lines 19-21 Handles the initial setup of the method
> Lines 22 and 23 Handles if there is no stock.
> Lines 26-28 Handles if and item is successfully bought.

#### -buyconfirmation.html
> New file that displays a confirmation message when item is succesfully bought
> All lines are for displaying the message and having a link back to the main page

#### -buydenial.html
> New file that displays a message that the item is out of stock
> All lines are for displaying the message and having a link back to the main page

#### -mainscreen.html
> Line 83 added the buy button next to the update and delete buttons on the product table

## TASK G
Modify the parts to track maximum and minimum inventory

#### CHANGES MADE

#### -BootStrapData.java
> Lines 48-49,58-59,68-69,78-79,88-89 Added min and max inventory to sample parts

#### -AddinhousePartController.java 
> Lines 43-45 Added logic to prevent inventory from being lower than or high than mix and max stock respectively

#### -AddOutsourcedPartController.java
> Lines 44-46 Added logic to prevent inventory from being lower than or high than mix and max stock respectively

#### -Part.java
> Lines 90-97 Added the set and get methods for the max and min inventory
> Lines 110-114 Added the isInvalid method to determine if inventory is out of range

#### -inhousePartForm.html
> Lines 28-35 Added Min and Max Stock fields to the form

#### -OutsourcedPartForm.html
> Lines 29-37 Added Min and Max Stock fields to the form

#### -mainscreen.html
> Lines 38 and 39 Added the Max and Min Stock fields to the table
> Lines 48 and 49 Added the Max and Min Stock amounts to the table

#### -application.properties
> Line 6 changed the name of the database file to pcshopinventory

## TASK H
Add validation for between or at the maximum and minimum fields.

#### CHANGES MADE

#### -AddinhousePartController.java
> Lines 38-42 added two checks, if inventory is below min or above max then it will return an error

#### -AddOutsourcedPartController.java
> Lines 39-43 added two checks, if inventory is below min or above max then it will return an error

#### -AddProductController.java
> Lines 143-145 if an associated part is being added and there is not enough parts to match inventory will give an error

#### Part.java
> Lines 111-117 split isInvalid method to isInvalidMin and isInvalidMax

#### cannotadd.html
> Created file to redirect to when products cannot be added due to not enough parts.

## TASK I
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

#### CHANGES MADE

#### -PartTest.java
> Lines 159-172 added the testMinInventory and testMaxInventory Methods

## TASK J
Remove the class files for any unused validators in order to clean your code.

#### CHANGES MADE

#### -DeletePartValidator.java
> Deleted this file as there is no usage.


