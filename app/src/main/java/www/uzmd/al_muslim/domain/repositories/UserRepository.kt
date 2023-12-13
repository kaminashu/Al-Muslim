package www.uzmd.al_muslim.domain.repositories

import www.uzmd.al_muslim.domain.entities.UserModel

interface UserRepository {
    fun addUser(userModel: UserModel)
    fun getUserInfo():UserModel
}