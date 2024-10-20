package defpackage;

import org.chromium.mojo.system.ResultAnd;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7529m40 implements Qj4 {
    public final /* synthetic */ C7873n40 a;

    @Override // defpackage.Qj4
    public final void a(int i) {
        ResultAnd e;
        C7873n40 c7873n40 = this.a;
        c7873n40.getClass();
        if (i != 0) {
            c7873n40.b(new HY1(i));
            return;
        }
        do {
            try {
                e = C7873n40.e(c7873n40.g, c7873n40.i);
            } catch (HY1 e2) {
                c7873n40.b(e2);
                return;
            }
        } while (((Boolean) e.b).booleanValue());
        int i2 = e.a;
        if (i2 != 17) {
            c7873n40.b(new HY1(i2));
        }
    }

    public C7529m40(C7873n40 c7873n40) {
        this.a = c7873n40;
    }
}
