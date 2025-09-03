# metrics-autoconfigure-starter

Proyecto starter que provee auto-configuración para exponer métricas personalizadas usando Micrometer.

Características:
- Auto-configura un bean `BasicCustomMetrics` si existe un `MeterRegistry` en el contexto y la propiedad `example.metrics.enabled` está activada (por defecto true).

Cómo usar
1. Agrega la dependencia en tu proyecto:

   <!-- pom.xml -->
   <dependency>
     <groupId>com.example</groupId>
     <artifactId>metrics-autoconfigure-starter</artifactId>
     <version>0.1.0</version>
   </dependency>

2. Asegúrate de tener un `MeterRegistry` (por ejemplo `micrometer-registry-prometheus` o `micrometer-registry-stackdriver`) en tu classpath.
3. La auto-configuración registra `BasicCustomMetrics` que expone un contador `example.custom.requests`.

Propiedades
- `example.metrics.enabled` (boolean) — Habilita/deshabilita la auto-configuración (true por defecto).
