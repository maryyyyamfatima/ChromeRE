package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9960t9 extends T93 implements DV1 {
    public final C10303u9 a;

    public C9960t9(C10303u9 c10303u9) {
        this.a = c10303u9;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(0, 6)) {
                return false;
            }
            this.a.a(C9617s9.d(a.b()).b);
            return true;
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
