package br.com.rafaeldias.componentesaplicacao

import android.app.IntentService
import android.content.Intent
import android.util.Log

class NotificationService : IntentService("") //intent service abre a thread assincrona automaticamente
{
    override fun onHandleIntent(intent: Intent?) {
        val msg = intent?.getStringExtra("MSG")
        val msg2 = intent?.getStringExtra("MSG2")
        Log.i("HEIDER",msg)//grava no log - nao deve ser usado em produção
        Log.i("HEIDER",msg2)
    }
}