// package com.example.simplewidget;

// import edu.wpi.first.shuffleboard.api.data.DataType;
// import edu.wpi.first.shuffleboard.api.plugin.Description;
// import edu.wpi.first.shuffleboard.api.plugin.Plugin;
// import edu.wpi.first.shuffleboard.api.widget.ComponentType;
// import edu.wpi.first.shuffleboard.api.widget.WidgetType;

// import com.example.simplewidget.data.type.ShooterIndexType;
// import com.example.simplewidget.widget.ShooterIndexWidget;

// import java.util.List;
// import java.util.Map;

// /**
//  * An example plugin that provides a custom data type (a 2D point) and a simple widget for viewing such data.
//  */
// @Description(
//     group = "org.usfirst.frcteam4028",
//     name = "ShooterIndexPlugin",
//     version = "2022.1.1",
//     summary = "Plugin providing a shooter index display."
// )
// public final class ShooterIndexPlugin extends Plugin {

//   @Override
//   public List<DataType> getDataTypes() {
//     return List.of(
//         ShooterIndexType.Instance
//     );
//   }

//   @Override
//   public List<ComponentType> getComponents() {
//     return List.of(
//         WidgetType.forAnnotatedWidget(ShooterIndexWidget.class)
//     );
//   }

//   @Override
//   public Map<DataType, ComponentType> getDefaultComponents() {
//     return Map.of(
//         ShooterIndexType.Instance, WidgetType.forAnnotatedWidget(ShooterIndexWidget.class)
//     );
//   }
// }
