package com.example.simplewidget.data.type;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;

import com.example.simplewidget.data.BallStatus;

import java.util.Map;
import java.util.function.Function;

/**
 * Represents data of the {@link BallStatus} type.
 */
public final class BallStatusType extends ComplexDataType<BallStatus> {

  /**
   * The name of data of this type as it would appear in a WPILib sendable's {@code .type} entry; a differential drive
   * base a {@code .type} of "DifferentialDrive", a sendable chooser has it set to "String Chooser"; a hypothetical
   * 2D point would have it set to "Point2D".
   */
  private static final String TYPE_NAME = "BallStatus";

  /**
   * The single instance of the point type. By convention, this is a {@code public static final}
   * field and the constructor is private to ensure only a single instance of the data type exists.
   */
  public static final BallStatusType Instance = new BallStatusType();

  private BallStatusType() {
    super(TYPE_NAME, BallStatus.class);
  }

  @Override
  public Function<Map<String, Object>, BallStatus> fromMap() {
    return map -> 
            new BallStatus(
                (boolean) Maps.getOrDefault(map, "hasRed", false),
                (boolean) Maps.getOrDefault(map, "hasBlue", false), 
                (boolean) Maps.getOrDefault(map, "hasBall", false)
            );
  }

  @Override
  public BallStatus getDefaultValue() {
    return new BallStatus(false, false, false);
  }
}
