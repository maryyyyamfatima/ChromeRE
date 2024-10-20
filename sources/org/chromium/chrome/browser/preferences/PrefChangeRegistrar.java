package org.chromium.chrome.browser.preferences;

import J.N;
import android.util.ArrayMap;
import defpackage.InterfaceC8184ny2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrefChangeRegistrar {
    public final ArrayMap a = new ArrayMap();
    public long b = N.MiTdj3xP(this);

    public final void a(String str, InterfaceC8184ny2 interfaceC8184ny2) {
        this.a.put(str, interfaceC8184ny2);
        N.Mrf8X6ah(this.b, this, str);
    }

    public final void b() {
        long j = this.b;
        if (j != 0) {
            N.Mn0XciAY(j, this);
        }
        this.b = 0L;
    }

    public final void onPreferenceChange(String str) {
        ((InterfaceC8184ny2) this.a.get(str)).c();
    }
}
