package works.codex.arief.dependencies

import dagger.Module
import dagger.Provides
import works.codex.arief.domain.usecase.GetStoryUseCase
import works.codex.arief.presentation.list.ListPresenter
import javax.inject.Singleton

@Module
class AriefPresenterModule {

    @Singleton
    @Provides
    fun provideListPresenter(getStoryUseCase: GetStoryUseCase) =
        ListPresenter(getStoryUseCase)
}