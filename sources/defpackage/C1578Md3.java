package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Md3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578Md3 implements InterfaceC5444g01 {
    public final /* synthetic */ Context a;

    public C1578Md3(Context context) {
        this.a = context;
    }

    @Override // defpackage.InterfaceC5444g01
    public final Object get() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
