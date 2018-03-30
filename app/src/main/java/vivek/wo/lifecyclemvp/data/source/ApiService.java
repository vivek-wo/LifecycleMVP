package vivek.wo.lifecyclemvp.data.source;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import vivek.wo.lifecyclemvp.data.entity.User;

/**
 * Created by VIVEK-WO on 2017/8/22.
 */
public interface ApiService {

    @FormUrlEncoded
    @POST("v1/Device/Login")
    Observable<User> login(@Field("account") String account,
                           @Field("password") String password);


}
