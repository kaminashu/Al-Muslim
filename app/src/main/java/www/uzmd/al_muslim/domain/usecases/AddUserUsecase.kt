package www.uzmd.al_muslim.domain.usecases

import www.uzmd.al_muslim.domain.entities.UserModel
import www.uzmd.al_muslim.domain.repositories.UserRepository

class AddUserUsecase(private val repo:UserRepository) {
    operator fun invoke(userModel: UserModel)=repo.addUser(userModel)
}