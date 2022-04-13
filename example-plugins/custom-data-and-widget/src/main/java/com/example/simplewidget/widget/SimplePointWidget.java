package com.example.simplewidget.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import com.example.simplewidget.data.Point2D;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

@Description(
    name = "Ball Status",
    dataTypes = Point2D.class,
    summary = "Displays the X and Y coordinates of a point"
)
@ParametrizedController("SimplePointWidget.fxml")
public final class SimplePointWidget extends SimpleAnnotatedWidget<Point2D> {

  @FXML
  private Pane root;
  @FXML
  private Circle ball;
//   @FXML
//   private Label xCoordinateView;

  @FXML
  private void initialize() {
    // Bind the text in the labels to the data
    // If you are unfamiliar with the -> notation used here, read the Oracle tutorial on lambda expressions:
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    // ball.fillProperty().bind(dataOrDefault.map(Point2D::getColor));
    ball.fillProperty().set(Color.ALICEBLUE);
    // xCoordinateView.textProperty().bind(dataOrDefault.map(point -> point.getBall()).map(x -> "X: " + x));
}

  @Override
  public Pane getView() {
    return root;
  }
}
