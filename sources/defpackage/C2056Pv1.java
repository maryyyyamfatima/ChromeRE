package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056Pv1 {
    public static C2056Pv1 d;
    public final Context a;
    public C1796Nv1 b;
    public final C12157za2 c = new C12157za2();

    public C2056Pv1(Context context) {
        C1536Lv1 c1536Lv1 = new C1536Lv1(this);
        this.a = context.getApplicationContext();
        new C1926Ov1(this, null, null, null).c(AbstractC0185Bl.f);
        if (AbstractC2446Sv1.g(context)) {
            context.getContentResolver().registerContentObserver(new Uri.Builder().scheme("content").authority("com.sec.knox.provider").build(), true, new C2186Qv1(new Handler(), c1536Lv1));
        }
    }
}
