package eu.tutorials.a7minutesworkout;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Leu/tutorials/a7minutesworkout/HistoryDatabase;", "Landroidx/room/RoomDatabase;", "()V", "historyDao", "Leu/tutorials/a7minutesworkout/HistoryDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {eu.tutorials.a7minutesworkout.HistoryEntity.class}, version = 2)
public abstract class HistoryDatabase extends androidx.room.RoomDatabase {
    
    /**
     * INSTANCE will keep a reference to any database returned via getInstance.
     *
     * This will help us avoid repeatedly initializing the database, which is expensive.
     *
     * The value of a volatile variable will never be cached, and all writes and
     * reads will be done to and from the main memory. It means that changes made by one
     * thread to shared data are visible to other threads.
     */
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile eu.tutorials.a7minutesworkout.HistoryDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final eu.tutorials.a7minutesworkout.HistoryDatabase.Companion Companion = null;
    
    public HistoryDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract eu.tutorials.a7minutesworkout.HistoryDao historyDao();
    
    /**
     * Define a companion object, this allows us to add functions on the EmployeeDatabase class.
     *
     * For example, classes can call `EMPLOYEEDatabase.getInstance(context)` to instantiate
     * a new EmployeeDatabase.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Leu/tutorials/a7minutesworkout/HistoryDatabase$Companion;", "", "()V", "INSTANCE", "Leu/tutorials/a7minutesworkout/HistoryDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Helper function to get the database.
         *
         * If a database has already been retrieved, the previous database will be returned.
         * Otherwise, create a new database.
         *
         * This function is threadsafe, and callers should cache the result for multiple database
         * calls to avoid overhead.
         *
         * This is an example of a simple Singleton pattern that takes another Singleton as an
         * argument in Kotlin.
         *
         * To learn more about Singleton read the wikipedia article:
         * https://en.wikipedia.org/wiki/Singleton_pattern
         *
         * @param context The application context Singleton, used to get access to the filesystem.
         */
        @org.jetbrains.annotations.NotNull
        public final eu.tutorials.a7minutesworkout.HistoryDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}