package com.example.settingspopup

import android.Manifest
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.settingspopup.databinding.FragmentBaseDialogIstBinding
import java.security.Permission

class BaseDialogIst : Fragment() {
    lateinit var binding: FragmentBaseDialogIstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseDialogIstBinding.inflate(inflater)

        val permission = listOf(Manifest.permission_group.CAMERA,Manifest.permission_group.CONTACTS)

        binding.rwDialog.adapter = DialogAdapter(permission)

        return binding.root
    }

}