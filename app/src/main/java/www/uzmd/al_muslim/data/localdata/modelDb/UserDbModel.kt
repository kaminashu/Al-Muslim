package www.uzmd.al_muslim.data.localdata.modelDb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class UserDbModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var name: String,
    var familia: String,
    var region: String
)