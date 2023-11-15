package com.example.settingspopup

import android.graphics.ColorSpace.Adaptation
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.settingspopup.databinding.ItemDialogBinding
import java.security.Permission

class DialogAdapter(val permissions: List<String>): RecyclerView.Adapter<DialogAdapter.ViewHolder>()

{

    inner class ViewHolder(private val binding: ItemDialogBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(permission: String){
            binding.permissionIcon.setImageResource(binding.root.context.packageManager.getPermissionGroupInfo(permission, 0).icon)
            binding.permissionName.text = binding.root.context.packageManager.getPermissionGroupInfo(permission, 0).name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemDialogBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return permissions.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(permissions[position])
    }


}