package com.example.rockpaperscissors;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class HelloController {
    @FXML
    private Button rockButton;
    @FXML
    private Button scissorsButton;
    @FXML
    private Button paperButton;
    @FXML
    private Label opponentChose;
    @FXML
    private Label youChose;
    @FXML
    private Label answer;
    @FXML
    private Label scoreCount;
    @FXML
    private ImageView leftHand;
    @FXML
    private ImageView rightHand;
    private int scoreInt = 0;
   public String opponentMove = "";


    public void opponentChoice(){
        //determines opponents choice and sets image/texts
        int rand = (int)(Math.random() * 3);
        if (rand == 0) {
            opponentMove = "Rock";
            Image rockHandRight = new Image(getClass().getResourceAsStream("Images/RockRight.png"));
            rightHand.setImage(rockHandRight);}
        else if(rand == 1){
            opponentMove = "Paper";
            Image paperHandRight = new Image(getClass().getResourceAsStream("Images/PaperRight.png"));
            rightHand.setImage(paperHandRight);}
        else{
            opponentMove = "Scissors";
            Image ScissorsHandRight = new Image(getClass().getResourceAsStream("Images/ScissorsRight.png"));
            rightHand.setImage(ScissorsHandRight);}
        opponentChose.setText(opponentMove);}


    public void rockButtonClicked(){
        //sets your choice as image and text
        Image rockHand = new Image(getClass().getResourceAsStream("Images/Rock.png"));
        leftHand.setImage(rockHand);
        youChose.setText("Rock");
        //Checks if player won or lost
        opponentChoice();
        if (opponentMove.equals("Scissors")){
            answer.setText("You Won");
            scoreInt += 1;
            scoreCount.setText(Integer.toString(scoreInt));}
        else if (opponentMove.equals("Rock")){
            answer.setText("You Tied");}
        else{answer.setText("You Lose");
            scoreInt = 0;
            scoreCount.setText(Integer.toString(scoreInt));}
    }

    public void paperButtonClicked(){
        //sets your choice as image and text
        Image paperHand = new Image(getClass().getResourceAsStream("Images/Paper.png"));
        leftHand.setImage(paperHand);
        youChose.setText("Paper");
        //Checks if player won or lost
        opponentChoice();
        if (opponentMove.equals("Rock")){
            answer.setText("You Won");
            scoreInt += 1;
            scoreCount.setText(Integer.toString(scoreInt));}
        else if (opponentMove.equals("Paper")){
            answer.setText("You Tied");}
        else{answer.setText("You Lose");
            scoreInt = 0;
            scoreCount.setText(Integer.toString(scoreInt));}
    }

    public void scissorsButtonClicked(){
        //sets your choice as image and text
        Image scissorsHand = new Image(getClass().getResourceAsStream("Images/scissors.png"));
        leftHand.setImage(scissorsHand);
        youChose.setText("Scissors");
        //Checks if player won or lost
        opponentChoice();
        if (opponentMove.equals("Paper")){
            answer.setText("You Won");
            scoreInt += 1;
            scoreCount.setText(Integer.toString(scoreInt));}
        else if (opponentMove.equals("Scissors")){
            answer.setText("You Tied");}
        else{answer.setText("You Lose");
            scoreInt = 0;
            scoreCount.setText(Integer.toString(scoreInt));}
    }




}



