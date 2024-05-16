package br.senai.sp.jandira.mytrips.dao



import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.mytrips.model.Usuario

@Database(entities = [Usuario::class], version = 1)
abstract class UserDao : RoomDatabase() {

    abstract fun ContatoDao(): ContatoDao

    companion object{
        private lateinit var instancia: UserDao

        fun getBancoDeDados(context: Context): UserDao{
            instancia = Room
                .databaseBuilder(
                    context,
                    UserDao::class.java,
                    "db_usuarios"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}

