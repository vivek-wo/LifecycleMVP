package vivek.wo.lifecyclemvp;

/**
 * Created by VIVEK-WO on 2018/3/22.
 */

public interface BasePresenter<T> {
    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    void takeView(T view);

    /**
     * Drops the reference to the view when destroyed
     */
    void dropView();
}
