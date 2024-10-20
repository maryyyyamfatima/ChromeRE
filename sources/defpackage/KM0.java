package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class KM0 extends RM0 {
    public final Callback d;
    public final C1436Lb0 e;
    public final /* synthetic */ SM0 f;

    @Override // defpackage.RM0
    public final int b() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM0(SM0 sm0, int i, String str, C3809bF c3809bF) {
        super(i, str);
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        this.f = sm0;
        this.d = c3809bF;
        this.e = c1436Lb0;
    }

    public C6844k43 c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ByteBuffer c = new NM0(this.f, this.a, this.b, null).c();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.e.getClass();
        C6844k43 a = C1436Lb0.a(c);
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        if (c != null && c.limit() > 0) {
            EI2.n(elapsedRealtime3 - elapsedRealtime, "Tabs.PersistedTabData.Storage.LoadAndMapTime.File");
            EI2.n(elapsedRealtime3 - elapsedRealtime2, "Tabs.PersistedTabData.Storage.MapTime.File");
        }
        return a;
    }

    @Override // defpackage.RM0
    public final AbstractC0185Bl a() {
        return new JM0(this);
    }

    @Override // defpackage.RM0
    public final boolean equals(Object obj) {
        if (obj instanceof KM0) {
            return super.equals(obj);
        }
        return false;
    }
}
