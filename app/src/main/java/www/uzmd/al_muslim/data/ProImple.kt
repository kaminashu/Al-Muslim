package www.uzmd.al_muslim.data

import android.app.Application
import www.uzmd.al_muslim.data.localdata.database.AppDatabase
import www.uzmd.al_muslim.data.mapper.Mapper
import www.uzmd.al_muslim.domain.entities.UserModel
import www.uzmd.al_muslim.domain.repositories.UserRepository

class ProImple(application: Application) : UserRepository {
    private val db = AppDatabase.getInstance(application).userDatabaseDao()
    private val mapper = Mapper()
    override fun addUser(userModel: UserModel) {
        db.addUser(mapper.mapperUserModelToUserDbModel(userModel))
    }

    override fun getUserInfo(): UserModel {
        return mapper.mapperUserDbModelToUserModel(db.getUser())
    }
}