package kg.geektech.kotlinhw4.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geektech.kotlinhw4.PagerViewModel
import kg.geektech.kotlinhw4.adapter.RecyclerAdapter
import kg.geektech.kotlinhw4.databinding.FragmentHistoryBinding

class FragmentHistory : Fragment() {

    private lateinit var viewModel: PagerViewModel
    private lateinit var binding: FragmentHistoryBinding
    private var list = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[PagerViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHistoryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.list.observe(viewLifecycleOwner){
            list = it as ArrayList<Int>
            binding.recHistory.layoutManager = LinearLayoutManager(requireContext())
            binding.recHistory.adapter = RecyclerAdapter(list)
        }
    }

}