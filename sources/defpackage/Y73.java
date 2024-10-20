package defpackage;

import android.content.Context;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class Y73 {
    public final Context a;
    public final Runnable b;
    public final C2786Vl1 c;
    public final WindowAndroid d;
    public final String e;
    public final QO f;

    public Y73(Context context, PropertyModel propertyModel, Runnable runnable, C2786Vl1 c2786Vl1, WindowAndroid windowAndroid, String str, QO qo) {
        this.a = context;
        this.b = runnable;
        this.c = c2786Vl1;
        this.d = windowAndroid;
        this.e = str;
        this.f = qo;
        propertyModel.o(Z73.a, new Callback() { // from class: U73
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Y73 y73 = Y73.this;
                y73.getClass();
                int intValue = ((Integer) obj).intValue();
                C2786Vl1 c2786Vl12 = y73.c;
                if (1 == intValue) {
                    AbstractC9454rh1.a(4);
                    c2786Vl12.f(new X73(y73));
                } else if (2 == intValue) {
                    AbstractC9454rh1.a(5);
                    c2786Vl12.f(new V73(y73));
                } else if (3 == intValue) {
                    AbstractC9454rh1.a(6);
                    Context context2 = y73.a;
                    ZN3.c(context2, context2.getString(R.string.f85390_resource_name_obfuscated_res_0x7f1409af), 0).d();
                    y73.b.run();
                }
            }
        });
    }
}
