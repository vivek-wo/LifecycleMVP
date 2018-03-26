/**
 * 创建关联Subcomponent的Module，使用BaseActivityModule类中的ContributesAndroidInjector注解替代
 * <p>
 * {@link vivek.wo.lifecyclemvp.BaseActivityModule}
 */
//package vivek.wo.lifecyclemvp.sample;
//
//import android.app.Activity;
//
//import dagger.Binds;
//import dagger.Module;
//import dagger.android.ActivityKey;
//import dagger.android.AndroidInjector;
//import dagger.multibindings.IntoMap;
//
///**
// * Created by VIVEK-WO on 2018/3/23.
// */
//@Module(subcomponents = {MainComponent.class})
//public abstract class MainModule {
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(
//            MainComponent.Builder builder);
//}

