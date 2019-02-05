package com.example.navigationtutorial

import android.app.Activity
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.navigationtutorial.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        mainActivity = context as MainActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.homeBtNavigate.setOnClickListener {
            val args = Bundle()
            args.putString("passed_string", binding.homeTvString.text.toString())
            //Navigate to details fragment with the given
            mainActivity.navController.navigate(R.id.action_homeFragment_to_detailsFragment, args)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDetach() {
        super.onDetach()
    }


}
