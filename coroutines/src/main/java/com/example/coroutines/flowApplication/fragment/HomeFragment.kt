package com.example.coroutines.flowApplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.coroutines.R
import com.example.coroutines.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val mBinding: FragmentHomeBinding by lazy{
        FragmentHomeBinding.inflate(layoutInflater)
    }
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,   savedInstanceState: Bundle? ): View? {

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mBinding.apply {
            flowDownFileBtn.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_downLoadFragment)
            }
            flowAndRoomBtn.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_userFragment)
            }
            flowAndRetrofitBtn.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
            }
            stateFlowBtn.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_numberFragment)
            }
            sharedFlowBtn.setOnClickListener{
                findNavController().navigate(R.id.action_homeFragment_to_sharedFlowFragment)
            }
        }

    }

}