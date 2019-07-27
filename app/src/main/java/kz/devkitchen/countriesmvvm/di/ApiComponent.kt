package kz.devkitchen.countriesmvvm.di

import dagger.Component
import kz.devkitchen.countriesmvvm.model.CountriesService
import kz.devkitchen.countriesmvvm.viewmodel.ListViewModel


@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: CountriesService)
    fun inject(viewModel: ListViewModel)
}