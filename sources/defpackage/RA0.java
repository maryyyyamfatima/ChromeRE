package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RA0 extends KM0 {
    public final /* synthetic */ UA0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RA0(UA0 ua0, int i, String str, C3809bF c3809bF) {
        super(ua0, i, str, c3809bF);
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        this.g = ua0;
    }

    @Override // defpackage.KM0
    public final C6844k43 c() {
        ByteBuffer c = new SA0(this.g, this.a, this.b, null).c();
        this.e.getClass();
        return C1436Lb0.a(c);
    }
}
