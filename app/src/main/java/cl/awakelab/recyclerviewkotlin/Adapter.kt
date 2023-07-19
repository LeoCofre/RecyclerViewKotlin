package cl.awakelab.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.recyclerviewkotlin.databinding.ItemBinding

/*  [x] Heredar de RecyclerView.Adapter
    [x] Implementar metodos onCreateViewHolder, onBindViewHolder, getItemCount
    [x] Crear clase ViewHolder que Hereda de RecyclerView.ViewHolder
    [x] Crear constructor
    [x] Crear data class
    [x] Asignar tamaño de lista a getItemCount
    [x] Crear Lista
*/
class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>(){

    //Lista
    var pokemones = mutableListOf<Pokemon>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    fun setData(pokedex: List<Pokemon>) {
        this.pokemones = pokedex.toMutableList()

    }

    class ViewHolder(val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {

            binding.tvTipo.text = pokemon.tipo
            binding.tvNombre.text = pokemon.nombre
        }
    }
}