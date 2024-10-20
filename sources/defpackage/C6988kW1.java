package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6988kW1 {
    public final int a;
    public final C6905kF3 b = new C6905kF3();
    public final int c = 2;
    public final Bundle d;

    public C6988kW1(int i, Bundle bundle) {
        this.a = i;
        this.d = bundle;
    }

    public final void a(C7676mW1 c7676mW1) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(this);
            String.valueOf(c7676mW1);
        }
        this.b.a(c7676mW1);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=true}";
    }
}
