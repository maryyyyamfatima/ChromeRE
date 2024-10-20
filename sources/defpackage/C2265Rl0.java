package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2265Rl0 implements InterfaceC0727Fp1 {
    public static final C2265Rl0 a = new C2265Rl0();

    @Override // defpackage.InterfaceC0727Fp1
    public final boolean a(int i) {
        char c;
        if (i != 0) {
            c = 2;
            if (i != 1) {
                if (i != 2) {
                    c = 4;
                    if (i != 3) {
                        c = i != 4 ? (char) 0 : (char) 5;
                    }
                } else {
                    c = 3;
                }
            }
        } else {
            c = 1;
        }
        return c != 0;
    }
}
