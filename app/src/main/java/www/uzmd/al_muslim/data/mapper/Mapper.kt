package www.uzmd.al_muslim.data.mapper

import www.uzmd.al_muslim.data.localdata.modelDb.UserDbModel
import www.uzmd.al_muslim.domain.entities.UserModel

class Mapper {
    fun mapperUserModelToUserDbModel(userModel: UserModel): UserDbModel {
        return UserDbModel(
            name = userModel.name,
            familia = userModel.familia,
            region = userModel.region
        )
    }

    fun mapperUserDbModelToUserModel(userDbModel: UserDbModel): UserModel {
        return UserModel(
            name = userDbModel.name,
            familia = userDbModel.familia,
            region = userDbModel.region
        )
    }
}