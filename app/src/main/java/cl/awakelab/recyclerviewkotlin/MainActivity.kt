package cl.awakelab.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.awakelab.recyclerviewkotlin.databinding.ActivityMainBinding
import cl.awakelab.recyclerviewkotlin.databinding.ItemBinding

/*______Pasos para Implementar Recyclerview________

    [X] Item_xml  (layout)
       __Definir IDs
       __Agregar constraints
       __Cambiar altura de constraints del item a wrap content
    [x] Layout con ReciclerView
    [x] Asignar layout manager
    [x] Adapter + ViewHolder
    [x] Obtener los datos

 */
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.recyclerView.adapter = adapter
    }

}