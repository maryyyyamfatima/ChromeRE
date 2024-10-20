package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1686Mz1 {
    public final C10216tu a = new C10216tu(this);
    public final ArrayList b = new ArrayList();
    public boolean c;
    public final AbstractC10902vu d;
    public final PackageManager e;
    public C2206Qz1 f;
    public final C2915Wl0 g;

    public C1686Mz1(AbstractC10902vu abstractC10902vu, PackageManager packageManager, C2915Wl0 c2915Wl0) {
        this.d = abstractC10902vu;
        this.g = c2915Wl0;
        this.e = packageManager;
    }

    public final void a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("SessionType", "SessionTypePrime");
        bundle2.putString("EventType", str);
        bundle2.putBundle("Payload", bundle);
        if (!this.c) {
            AbstractC5195fH1.a("Lens session not connected, caching request.", new Object[0]);
            this.b.add(bundle2);
        } else {
            b(bundle2);
        }
    }

    public final boolean b(Bundle bundle) {
        try {
            this.d.d(bundle);
            return true;
        } catch (RemoteException e) {
            Log.e("LensSdk", AbstractC5195fH1.b("Failed to send request.", new Object[0]), e);
            AbstractC5195fH1.a("onError", new Object[0]);
            this.c = false;
            this.f.k();
            return false;
        }
    }
}
