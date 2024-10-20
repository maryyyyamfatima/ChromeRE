package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11667y73 extends T93 implements DV1 {
    public final C12010z73 a;

    public C11667y73(C12010z73 c12010z73) {
        this.a = c12010z73;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(0, 2)) {
                return false;
            }
            this.a.a(Integer.valueOf(C11324x73.d(a.b()).b));
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
