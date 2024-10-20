package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Mk4 extends BA0 {
    public final Activity a;
    public C8447ok4 g;
    public final String h;
    public boolean i;
    public boolean j;

    public Mk4(String str, Activity activity) {
        this.a = activity;
        this.h = str;
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.a) {
            int i = navigationHandle.l;
            if (i != -21) {
                String str = null;
                if (i == 0) {
                    C8447ok4 c8447ok4 = this.g;
                    if (c8447ok4 != null) {
                        c8447ok4.a.cancel();
                        this.g = null;
                    }
                } else {
                    Context context = V60.a;
                    if (i == -111) {
                        str = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bd0);
                    } else if (i == -106) {
                        C7928nE c7928nE = UN.a;
                        if (!N.M09VlOh_("AndroidPWAsDefaultOfflinePage")) {
                            str = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bd2, this.h);
                        }
                    } else if (i == -105) {
                        str = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bcd);
                    }
                    if (str != null && !this.i) {
                        this.i = true;
                        NetworkChangeNotifier.a(new Lk4(this, tabImpl));
                        C8447ok4 c8447ok42 = new C8447ok4();
                        this.g = c8447ok42;
                        Activity activity = this.a;
                        C5490g8 c5490g8 = new C5490g8(activity, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
                        c5490g8.a.f = str;
                        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140717, new DialogInterfaceOnClickListenerC8103nk4(activity));
                        DialogC5834h8 a = c5490g8.a();
                        c8447ok42.a = a;
                        a.setCanceledOnTouchOutside(false);
                        c8447ok42.a.show();
                    }
                }
            } else if (this.j) {
                tabImpl.D();
                this.j = false;
            }
            EI2.m(-(-navigationHandle.l), "WebApk.Launch.NetworkError");
        }
    }
}
