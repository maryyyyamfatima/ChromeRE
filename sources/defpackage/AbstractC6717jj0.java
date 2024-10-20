package defpackage;

import com.android.chrome.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6717jj0 {
    public static final Object a = new Object();
    public static C3969bj0 b;

    public static String a(boolean z) {
        String str;
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    C3969bj0 c3969bj0 = new C3969bj0();
                    b = c3969bj0;
                    c3969bj0.c(AbstractC0185Bl.e);
                }
            }
        }
        try {
            if (z) {
                str = (String) ((ArrayList) b.f()).get(0);
            } else {
                str = (String) ((ArrayList) b.f()).get(1);
            }
            return str;
        } catch (InterruptedException | ExecutionException unused) {
            return V60.a.getString(R.string.f77280_resource_name_obfuscated_res_0x7f140638);
        }
    }
}
