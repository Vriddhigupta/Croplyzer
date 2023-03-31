# Croplyzer
## An IoT technology using Raspberry Pi driven by AI/ML technology that predicts maturity of crops/fruits in an agricultural farm.

### Team name: Dev Devils

## Team members
* Vriddhi Gupta - vagupta_b19@it.vjti.ac.in
* Neel Dandiwala - nddandiwala_b19@it.vjti.ac.in
* Prasad Thakare - 
* Tanish Sawant - 

## Description of Solution

*  The Indian agro-based economy accounts for a large portion of its GDP and also proves employment to be as high as 40 percent of India’s total employment. 
*  Our vision is to aid in minimizing losses due to untimely harvesting of crops due to a vast multitude of factors used in anticipating it and early harvests for some crops to provide more monetary value to the farmer using an integrated approach to analyze and estimate using machine learning models and Raspberry Pi.
*  Our proposed project aids farmers to detect first the maturity of crops and view the ripeness of the crops in the proposed mobile application. 
*  The machine learning model is trained to accurately analyze the marketable maturity of the crops which would provide farmers with a generalized range of days when the crop is beginning to ripen to range where crop is at the peak of being ripped to the fullest and should be sold or consumed immediately , if not then it may lead to damage of crop and loss of the farmer.  
*  A land-based robot, with a Raspberry Pi 3B as its core, is employed for monitoring the crops using the attached camera attached at the end of a manipulator arm. This rover-looking robot, controlled by the user, will send footage of the crops to the machine learning model, which then submits its outcome to the Flask server deployed on Google Cloud. This Flask server acts as the centralized entity for the relay of information between the android application, raspberry pi and the machine learning model. 
*  There aren't many such systems on the market. We propose such a novel method that provides farmers with a complete farming solution to determine maturity of crops and take adequate measures incase of diseases or changes in crops due to weather impact. Thus, we still plan to scale this project to achieve a complete farming solution.

## Links
* GitHub Repo link: [Link to android application](https://github.com/Vriddhigupta/Croplyzer)
* Raspberry Pi code: [Link to Raspberry Pi bot](https://github.com/Neel-Dandiwala/GSC_2023-Pi_Bot)
* ML Model for predicting maturity of crops: [Model code](https://github.com/TanishSawant/yolov3-tf2)
* Application Working Video: [YouTube Video](https://youtube.com/shorts/gmhBfXCZm-g?feature=share)

## Technology stack

Tools and technologies that you learnt and used in the project.

1. Android Studio
2. Java
3. XML
4. Raspberry Pi
5. Python Flask
6. Google Cloud Services
7. Tensorflow
8. Machine Learning
9. Visual Studio Code

## Usage
* First clone the machine learning model code and the raspberry Pi server code provided above under links section. 
* After setup on Android studio is done, you can connect your mobile device to your laptop via USB and then run the application on your mobile. The app will be installed and opened automatically.
* When the app is finished, you will see a splash screen with beautiful design displaying the onboarding pages. After that, a series of onboarding screens will appear before you reach the home screen.
* No login is required because the application is available to everyone and no user data needs to be saved anywhere in anyway. 
* On the home page, you will see total 8 buttons for controlling the bot - 4 buttons for wheels and 4 buttons for arms. Along with this, there is a camera button, button for predicting maturity and an image view above all the buttons.
* You can first click on the bot controlling buttons to adjust the bot and then click on camera button which will prompt the bot to click the image of the fruit and send it to the android client. The clicked image will be shown in the image view and if the image looks good then you can click on predicting maturity button which will pass the image to the machine learning model to predict maturity and return the output to the android client which will be displayed on the screen.

## Flowchart

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/dryhunch.drawio%20(1).png" width="1000">

## Future scope
* Making the application an intuitive and multilingual Android app for farmers that allows them to control the bot in the form of speech or text. 
* Increasing the accuracy of the existing Machine Learning Model as well as adding one more algorithm to predict in how many days a crop will possibly ripen along with giving market value for the crops based on their maturity.

## Screenshots
| ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-05-25-06-385_com.example.dryhunch%20(1).jpg) | ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-05-25-04-473_com.example.dryhunch.jpg) | ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-05-25-02-501_com.example.dryhunch.jpg) | ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-08-40-11-512_com.example.dryhunch%20(1).jpg) |
| :-------------: | :-------------:  | :-------------:  | :-------------:  |
|     Splash Screen1     |    Splash Screen2   |    Instruction Page     |      HomePage     |

| ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-05-24-51-065_com.example.dryhunch.jpg) | ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-05-24-53-135_com.example.dryhunch%20(1).jpg) | ![](https://github.com/Vriddhigupta/DryHunch/blob/main/Screenshot_2023-02-25-05-24-58-007_com.example.dryhunch.jpg) |
| :-------------: | :-------------:  | :-------------:  | 
|     Prediction Page     |    Suggestions   |    Weather Details    | 


- **Deep Learning Model that will predict the drought condition**
 
<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.35.50%20AM.jpeg" width="1000">

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.36.07%20AM.jpeg" width="1000">

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.36.20%20AM.jpeg" width="1000">

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.39.26%20AM.jpeg" width="1000">

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.40.32%20AM.jpeg" width="1000">

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.40.56%20AM.jpeg" width="1000">

<img src="https://github.com/Vriddhigupta/DryHunch/blob/main/WhatsApp%20Image%202023-02-25%20at%209.17.04%20AM.jpeg" width="1000">
