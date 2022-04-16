package com.example.simplewidget.data.type;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.data.SimpleDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;

import java.util.Map;
import java.util.function.Function;

import com.example.simplewidget.data.ShooterIndex;

/**
 * Represents data of the {@link ShooterIndex} type.
 */
public final class ShooterIndexType extends ComplexDataType<ShooterIndex> {

  /**
   * The name of data of this type as it would appear in a WPILib sendable's {@code .type} entry; a differential drive
   * base a {@code .type} of "DifferentialDrive", a sendable chooser has it set to "String Chooser"; a hypothetical
   * 2D point would have it set to "Point2D".
   */
  private static final String TYPE_NAME = "ShooterIndex";

  /**
   * The single instance of the point type. By convention, this is a {@code public static final}
   * field and the constructor is private to ensure only a single instance of the data type exists.
   */
  public static final ShooterIndexType Instance = new ShooterIndexType();

  private ShooterIndexType() {
    super(TYPE_NAME, ShooterIndex.class);
  }

  @Override
  public Function<Map<String, Object>, ShooterIndex> fromMap() {
    return map -> 
            new ShooterIndex(
                (double) Maps.getOrDefault(map, "index", 12.5),
                (double) Maps.getOrDefault(map, "fontSize", 100.)
            );
  }

  @Override
  public ShooterIndex getDefaultValue() {
    return new ShooterIndex(12.5, 100.);
  }
}
