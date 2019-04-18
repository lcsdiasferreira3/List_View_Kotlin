package com.example.aluno.listview

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_tela_list_view.*

class TelaListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_list_view)
        //setSupportActionBar(toolbar)

        /*   fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }*/

        /* override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_tela_list_view, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }

    }*/

        val arrayDeLinhasQueSeraMostradoNaListView = ArrayList<String>()
        arrayDeLinhasQueSeraMostradoNaListView.add("Linha 1")
        arrayDeLinhasQueSeraMostradoNaListView.add("Linha 2")
        arrayDeLinhasQueSeraMostradoNaListView.add("Linha 3")
        arrayDeLinhasQueSeraMostradoNaListView.add("Linha 4")

        val lv: ListView = findViewById(R.id.minhaprimeiralistview)
        lv.adapter = ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1,
                arrayDeLinhasQueSeraMostradoNaListView)





    }
}

