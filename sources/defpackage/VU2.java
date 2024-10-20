package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import com.android.chrome.R;
import java.text.DateFormat;
import java.util.Date;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VU2 {
    public final Context a;
    public final Bitmap b;
    public final int c;
    public final WindowAndroid d;
    public final Runnable e;
    public DialogC5834h8 f;

    public VU2(Context context, Bitmap bitmap, int i, Runnable runnable, WindowAndroid windowAndroid) {
        this.a = context;
        this.b = bitmap;
        this.c = i;
        this.d = windowAndroid;
        this.e = runnable;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        boolean a = AbstractC6205iD.a();
        WindowAndroid windowAndroid = this.d;
        if (!((a || windowAndroid.hasPermission("android.permission.WRITE_EXTERNAL_STORAGE") || windowAndroid.canRequestPermission("android.permission.WRITE_EXTERNAL_STORAGE")) ? false : true)) {
            AbstractC7281lM0.a(windowAndroid, new C6937kM0(new Callback() { // from class: SU2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    VU2 vu2 = VU2.this;
                    vu2.getClass();
                    if (booleanValue) {
                        N.MTm9IWhH(vu2.a.getString(vu2.c, DateFormat.getDateTimeInstance(2, 1).format(new Date(System.currentTimeMillis()))), vu2.b);
                        Runnable runnable = vu2.e;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            }));
            return;
        }
        C5490g8 c5490g8 = new C5490g8(this.a, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.b(R.string.f86590_resource_name_obfuscated_res_0x7f140a2d);
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, new UU2(this));
        c5490g8.f(R.string.f86550_resource_name_obfuscated_res_0x7f140a29, new TU2(this));
        DialogC5834h8 a2 = c5490g8.a();
        this.f = a2;
        a2.setCanceledOnTouchOutside(false);
        this.f.show();
    }
}
