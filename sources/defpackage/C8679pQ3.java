package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pQ3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8679pQ3 implements Callback {
    public final C1948Oz3 a;
    public int g = -1;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C1948Oz3 c1948Oz3 = this.a;
        if (booleanValue) {
            int i = this.g;
            this.g = c1948Oz3.a.a();
            if (i != -1) {
                c1948Oz3.a.c(i);
                return;
            }
            return;
        }
        c1948Oz3.a.c(this.g);
        this.g = -1;
    }

    public C8679pQ3(C1948Oz3 c1948Oz3) {
        this.a = c1948Oz3;
    }
}
