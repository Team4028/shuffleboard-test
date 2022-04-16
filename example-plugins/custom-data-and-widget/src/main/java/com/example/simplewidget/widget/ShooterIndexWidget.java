package com.example.simplewidget.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import com.example.simplewidget.data.ShooterIndex;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

@Description(
    name = "Shooter Index",
    dataTypes = ShooterIndex.class,
    summary = "Displays a shooter index."
)
@ParametrizedController("ShooterIndexWidget.fxml")
public final class ShooterIndexWidget extends SimpleAnnotatedWidget<ShooterIndex> {

  @FXML
  private Pane root;
  @FXML
  private Text index;

  @FXML
  private void initialize() {
    // Bind the text in the labels to the data
    // If you are unfamiliar with the -> notation used here, read the Oracle tutorial on lambda expressions:
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    // index.fontProperty().set(new Font(100));
    index.fillProperty().set(Color.WHITE);
    index.textProperty().bind(dataOrDefault.map(ShooterIndex::toHumanReadableString));
    index.fontProperty().bind(dataOrDefault.map(ShooterIndex::getFont));
}

  @Override
  public Pane getView() {
    return root;
  }
}
