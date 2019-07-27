package kz.devkitchen.countriesmvvm.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*
import kz.devkitchen.countriesmvvm.R
import kz.devkitchen.countriesmvvm.getProgressDrawable
import kz.devkitchen.countriesmvvm.loadImage
import kz.devkitchen.countriesmvvm.model.Country

class CountryListAdapter(var countryList: ArrayList<Country> ) : RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {


    fun updateCountries(newCountries: List<Country>) {
        countryList.clear()
        countryList.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CountryViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.list_item, parent, false))

    override fun getItemCount() = countryList.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }

    class CountryViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        private val countryName = view.name
        private val imageView = view.imageView
        private val countryCapital = view.capital
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(country: Country) {
            countryName.text = country.countryName
            countryCapital.text = country.capitalName
            imageView.loadImage(country.flag, progressDrawable)
        }
    }
}