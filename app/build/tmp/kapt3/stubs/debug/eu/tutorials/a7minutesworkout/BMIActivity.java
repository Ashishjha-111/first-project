package eu.tutorials.a7minutesworkout;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Leu/tutorials/a7minutesworkout/BMIActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Leu/tutorials/a7minutesworkout/databinding/ActivityBmiBinding;", "currentVisibleView", "", "calculateUnits", "", "displayBMIResult", "bmi", "", "makeVisibleMetricUnitsView", "makeVisibleUsUnitsView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "validateMetricUnits", "", "validateUsUnits", "Companion", "app_debug"})
public final class BMIActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String METRIC_UNITS_VIEW = "METRIC_UNIT_VIEW";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String US_UNITS_VIEW = "US_UNIT_VIEW";
    @org.jetbrains.annotations.NotNull
    private java.lang.String currentVisibleView = "METRIC_UNIT_VIEW";
    @org.jetbrains.annotations.Nullable
    private eu.tutorials.a7minutesworkout.databinding.ActivityBmiBinding binding;
    @org.jetbrains.annotations.NotNull
    public static final eu.tutorials.a7minutesworkout.BMIActivity.Companion Companion = null;
    
    public BMIActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void calculateUnits() {
    }
    
    /**
     * Function is used to make the METRIC UNITS VIEW visible and hide the US UNITS VIEW.
     */
    private final void makeVisibleMetricUnitsView() {
    }
    
    private final void makeVisibleUsUnitsView() {
    }
    
    /**
     * Function is used to validate the input values for METRIC UNITS.
     */
    private final boolean validateMetricUnits() {
        return false;
    }
    
    /**
     * Function is used to validate the input values for US UNITS.
     */
    private final boolean validateUsUnits() {
        return false;
    }
    
    /**
     * Function is used to display the result of METRIC UNITS.
     */
    private final void displayBMIResult(float bmi) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Leu/tutorials/a7minutesworkout/BMIActivity$Companion;", "", "()V", "METRIC_UNITS_VIEW", "", "US_UNITS_VIEW", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}