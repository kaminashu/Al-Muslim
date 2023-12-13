package www.uzmd.al_muslim.peresentation.ui.register

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import www.uzmd.al_muslim.data.ProImple
import www.uzmd.al_muslim.domain.entities.UserModel
import www.uzmd.al_muslim.domain.usecases.AddUserUsecase

class RegisterViewModel(application: Application) : AndroidViewModel(application) {
   private val repoImple = ProImple(application)
    private val addUserUsecase=AddUserUsecase(repoImple)
    init {
        addUserUsecase(UserModel("kamina","Urazov","Xonqa"))
    }
}