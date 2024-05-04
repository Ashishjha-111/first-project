package eu.tutorials.a7minutesworkout;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u001aH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Leu/tutorials/a7minutesworkout/ExerciseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "binding", "Leu/tutorials/a7minutesworkout/databinding/ActivityExerciseBinding;", "currentExercisePosition", "", "exerciseAdapter", "Leu/tutorials/a7minutesworkout/ExerciseStatusAdapter;", "exerciseList", "Ljava/util/ArrayList;", "Leu/tutorials/a7minutesworkout/ExerciseModel;", "Lkotlin/collections/ArrayList;", "exerciseProgress", "exerciseTimer", "Landroid/os/CountDownTimer;", "exerciseTimerDuration", "", "player", "Landroid/media/MediaPlayer;", "restProgress", "restTimer", "tts", "Landroid/speech/tts/TextToSpeech;", "customDialogForBackButton", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", "status", "setExerciseProgressBar", "setRestProgressBar", "setupExerciseStatusRecyclerView", "setupExerciseView", "setupRestView", "speakOut", "text", "", "app_release"})
public final class ExerciseActivity extends androidx.appcompat.app.AppCompatActivity implements android.speech.tts.TextToSpeech.OnInitListener {
    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer restTimer;
    private int restProgress = 0;
    @org.jetbrains.annotations.Nullable
    private android.os.CountDownTimer exerciseTimer;
    private int exerciseProgress = 0;
    private long exerciseTimerDuration = 30L;
    @org.jetbrains.annotations.Nullable
    private java.util.ArrayList<eu.tutorials.a7minutesworkout.ExerciseModel> exerciseList;
    private int currentExercisePosition = -1;
    @org.jetbrains.annotations.Nullable
    private eu.tutorials.a7minutesworkout.databinding.ActivityExerciseBinding binding;
    @org.jetbrains.annotations.Nullable
    private android.speech.tts.TextToSpeech tts;
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer player;
    @org.jetbrains.annotations.Nullable
    private eu.tutorials.a7minutesworkout.ExerciseStatusAdapter exerciseAdapter;
    
    public ExerciseActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Function is used to set the timer for REST.
     */
    private final void setupRestView() {
    }
    
    /**
     * Function is used to set the progress of timer using the progress
     */
    private final void setRestProgressBar() {
    }
    
    /**
     * Function is used to set the progress of the timer using the progress for Exercise View.
     */
    private final void setupExerciseView() {
    }
    
    /**
     * Function is used to set the progress of the timer using the progress for Exercise View for 30 Seconds
     */
    private final void setExerciseProgressBar() {
    }
    
    /**
     * Here in the Destroy function we will reset the rest timer if it is running.
     */
    @java.lang.Override
    public void onDestroy() {
    }
    
    /**
     * This the TextToSpeech override function
     *
     * Called to signal the completion of the TextToSpeech engine initialization.
     */
    @java.lang.Override
    public void onInit(int status) {
    }
    
    private final void speakOut(java.lang.String text) {
    }
    
    private final void setupExerciseStatusRecyclerView() {
    }
    
    /**
     * Function is used to launch the custom confirmation dialog.
     */
    private final void customDialogForBackButton() {
    }
}