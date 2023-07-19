package cl.awakelab.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.recyclerviewkotlin.databinding.ItemBinding

/*  [x] Heradar de RecyclerView.Adapter
    [ ] Implementar metodos onCreateViewHolder, onBindViewHolder, getItemCount
    [x] Crear clase ViewHolder que Hereda de RecyclerView.ViewHolder
    [ ] Crear constructor
    [ ] Crear data class
    [ ] Asignar tamaño de lista a getItemCount

    [ ] Crear Lista
*/
class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>(){

    //Lista
    var pokemones = mutableListOf<Pokemon>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    class ViewHolder(binding : ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}