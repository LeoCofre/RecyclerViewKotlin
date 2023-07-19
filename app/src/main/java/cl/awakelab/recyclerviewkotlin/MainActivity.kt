package cl.awakelab.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*______Pasos para Implementar Recyclerview________

    [X] Item_xml  (layout)
       __Definir IDs
       __Agregar constraints
       __Cambiar altura de constraints del item a wrap content
    [x] Layout con ReciclerView
    [x] Asignar layout manager
    [ ] Adapter + ViewHolder
    [ ] Obtener los datos

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}