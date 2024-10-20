package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PersistableBundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KO implements InterfaceC11798yX1 {
    public final Context a;
    public final PersistableBundle b;
    public final ConnectivityManager c;

    public KO(AbstractJobServiceC1339Kh3 abstractJobServiceC1339Kh3, PersistableBundle persistableBundle) {
        this.a = abstractJobServiceC1339Kh3;
        this.b = persistableBundle;
        this.c = (ConnectivityManager) abstractJobServiceC1339Kh3.getSystemService("connectivity");
    }
}
