package subreddit.android.appstore.backend;

import dagger.Module;
import dagger.Provides;
import subreddit.android.appstore.backend.wiki.LiveWikiRepository;
import subreddit.android.appstore.backend.wiki.WikiRepository;
import subreddit.android.appstore.util.dagger.ApplicationScope;


@Module
public class WikiRepositoryModule {
    @Provides
    @ApplicationScope
    WikiRepository provideBackendService() {
        return new LiveWikiRepository();
    }
}
