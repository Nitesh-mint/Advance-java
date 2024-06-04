<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->





<!-- PROJECT LOGO -->
<br />
<div align="center">
    <div style="display:flex; justify-content:center;gap:10px;">
        <h3 align="center">Advance</h3>
        <img src='https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/1200px-Java_programming_language_logo.svg.png' width='35'>
    </div>
  <p align="center">
    BCA TU 6th semester advance java codes
    <br />
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about">About</a>
    </li>
    <li>
      <a href="#Topics">Topics</a>
      <ul>
        <li><a href="#GUI-Programming">Unit 1: GUI Programming</a>
        <ol>
            <li><a href="#Introduction-to-Swing">Introduction to Swing</a></li>
            <li><a href="#Creating-a-frame">Creating a Frame</a></li>
            <li><a href="#Positioning-a-frame">Positioning a Frame</a></li>
            <li><a href="#Swing-JLabel">Swing JLabel</a></li>
            <li><a href="#Swing-JPanel">Swing JPanel</a></li>
        </ol>
        </li>
      </ul>
    </li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About
This repo contains the code written in java. It is focused in Graphical User Interface(GUI) aspect of Java where classes like AWT and Swing are used heavily.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Topics

This is the main section of the repo where codes and concepts are arranged in topic wise fashion.

### GUI Programming
The main aim of this chapter is to teach how to use different components of the Java to show visual objects in the UI.

### Introduction to Swing
Swing in Java is a GUI toolkit that provides a set of lightweight, platform-independent components for building graphical user interfaces.<br><br>
To use Swing classes we need to import.<br>
`import javax.swing.*;`

### Creating a frame
To create a frame we need to create a object of the `JFrame` class.
<br>
**Code Example**
```
import javax.swing.JFrame;

JFrame frame = new JFrame(); //creates a frame but doesn't show up
frame.setSize(500, 500); //sets the width and height to 500
frame.setVisible(true); //to make the frame visible

```
### Positioning a frame
We can position a frame to the way we like using `setPosition()` method of `JFrame` class. We need to input the parameter for x-axis and y-axis
<br>
**Code Example**
```
frame.setPosition(200, 300); //draws frame in 200px to x-axis and 300px to y-axis
```
We can also set the location of the frame where it is suitable, it is done by the platform or the OS where it is being drawn. We can use `frame.setLocationByPlatform(true);` method.

### Swing JLabel
JLabel is a component of Swing class which is used to display text or image or both.
We can create object of the JLabel class by importing: `import javax.swing.JLabel`
<br>
JLabel takes likes to take the full area of the JFrame by default.We can use different Layout type to override the default property.

**Example of important methods in JLabel class**
```
//creating a frame
    import javax.swing.JFrame; //for frame
    import javax.swing.JLabel; //for label
    import javax.swing.ImageIcon; //for image
    import java.awt.Color; //for constant colors
    import java.awt.Font; //for fonts
    import javax.swing.BorderFactory; // to create a border
    import javax.swing.border.Border; // border class

		JFrame frame = new JFrame("JLabel in detail");
		
		//image icon
		ImageIcon image = new ImageIcon("java_logo.png");
		
		//Border
		Border border = BorderFactory.createLineBorder(Color.RED, 3);
		
		//JLabel codes
		JLabel label = new JLabel();
		label.setIcon(image);
		label.setText("Hello");
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP BOTTOM, CENTER of 
		label.setForeground(Color.RED); //set the font color
		label.setFont(new Font("Arial", Font.BOLD, 20)); //set font of the text
		label.setIconTextGap(-5); //set gap between image and text
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); // set the border of the Label
		label.setVerticalAlignment(JLabel.CENTER); //set the vertical position of both image and text
		label.setHorizontalAlignment(JLabel.CENTER); //set the horizontal position of both imgae and text
		label.setSize(250, 250);
		
		//frame code for label
		frame.setSize(500, 400);
		frame.add(label);
		frame.setLayout(null); //by default java uses border layout.
		//frame.pack(); //this will make the frame size the size of the components(i.e: responsive)
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
**OUTPUT**



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin-url]: https://www.linkedin.com/in/nitesh-raya-614055249/
[java-logo]: https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/1200px-Java_programming_language_logo.svg.png

