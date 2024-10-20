package defpackage;

import android.app.Application;
import android.content.Context;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oz0 */
/* loaded from: classes.dex */
public abstract class AbstractC8530oz0 {
    public static final Object a = new Object();
    public static volatile boolean b = false;

    public static void a(Context context) {
        if (b) {
            return;
        }
        synchronized (a) {
            if (!b) {
                if (context.getApplicationContext() instanceof Application) {
                    b(context);
                } else {
                    throw new IllegalArgumentException("The Context instance doesn't provide Application which is required by EmojiCompat init process");
                }
            }
        }
    }

    public static void b(Context context) {
        SR0 sr0 = new SR0(context, new LR0(R.array.0_resource_name_obfuscated_res_0x7f040071, "Noto Color Emoji Compat"));
        sr0.b = true;
        MR0 mr0 = new MR0();
        RR0 rr0 = (RR0) sr0.a;
        synchronized (rr0.d) {
            rr0.g = mr0;
        }
        if (C7843mz0.j == null) {
            synchronized (C7843mz0.i) {
                if (C7843mz0.j == null) {
                    C7843mz0.j = new C7843mz0(sr0);
                }
            }
        }
        C7843mz0 a2 = C7843mz0.a();
        a2.g(new C8187nz0(a2));
    }
}
