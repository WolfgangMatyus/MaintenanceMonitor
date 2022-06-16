package at.msw.MaintenanceMonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    @GetMapping("/maintenance")
    public double maint(@RequestParam double a, @RequestParam double b){
        return a + b;
    }

}
