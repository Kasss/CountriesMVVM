package kz.devkitchen.countriesmvvm.model

import dagger.Module
import dagger.Provides
import io.reactivex.Single
import kz.devkitchen.countriesmvvm.di.DaggerApiComponent
import javax.inject.Inject

@Module
class CountriesService {

    @Inject
    lateinit var api: CountriesApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    @Provides
    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}