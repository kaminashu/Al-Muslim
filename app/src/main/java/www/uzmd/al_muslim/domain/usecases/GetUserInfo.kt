package www.uzmd.al_muslim.domain.usecases

import www.uzmd.al_muslim.domain.repositories.UserRepository

class GetUserInfo(private val repository: UserRepository) {
    operator fun invoke()=repository.getUserInfo()
}