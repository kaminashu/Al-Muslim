package www.uzmd.al_muslim.data.localdata.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import www.uzmd.al_muslim.data.localdata.dao.UserDatabaseDao
import www.uzmd.al_muslim.data.localdata.modelDb.UserDbModel

@Database(entities = [UserDbModel::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDatabaseDao(): UserDatabaseDao

    companion object {
        private var INCTANSE: AppDatabase? = null
        private var LOOK = Any()
        private const val DB_NAME = "al_muslim"
        fun getInstance(context: Context): AppDatabase {
            INCTANSE?.let {
                return it
            }
            synchronized(LOOK) {
                INCTANSE?.let {
                    return it
                }
                val db=Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME).build()
                INCTANSE = db
                return db
            }

        }

    }
}