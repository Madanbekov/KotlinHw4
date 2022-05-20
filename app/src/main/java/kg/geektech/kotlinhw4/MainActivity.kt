package kg.geektech.kotlinhw4


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import kg.geektech.kotlinhw4.adapter.Adapter
import kg.geektech.kotlinhw4.ui.FragmentActions
import kg.geektech.kotlinhw4.ui.FragmentResult
import kg.geektech.kotlinhw4.ui.FragmentHistory

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager: ViewPager2 = findViewById(R.id.pager)

        val fragments: ArrayList<Fragment> = arrayListOf(
            FragmentActions(), FragmentResult(), FragmentHistory()
        )

       val adapter = Adapter(fragments,this)
       viewPager.adapter = adapter
    }
}