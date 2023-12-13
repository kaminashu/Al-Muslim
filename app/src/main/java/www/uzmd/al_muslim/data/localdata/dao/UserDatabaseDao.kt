package www.uzmd.al_muslim.data.localdata.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import www.uzmd.al_muslim.data.localdata.modelDb.UserDbModel

@Dao
interface UserDatabaseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(userDbModel: UserDbModel)

    @Query("SELECT * FROM user WHERE id=1")
    fun getUser(): UserDbModel
}