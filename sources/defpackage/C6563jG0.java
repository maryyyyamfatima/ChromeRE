package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jG0 */
/* loaded from: classes2.dex */
public final class C6563jG0 implements InterfaceC0218Br2 {
    public final /* synthetic */ BG0 a;
    public final /* synthetic */ C12055zG0 b;

    public C6563jG0(C12055zG0 c12055zG0, BG0 bg0) {
        this.b = c12055zG0;
        this.a = bg0;
    }

    @Override // defpackage.InterfaceC0218Br2
    public final void b(int[] iArr, String[] strArr) {
        Callback callback;
        Callback callback2;
        int length = iArr.length;
        BG0 bg0 = this.a;
        if (length > 0 && iArr[0] == 0) {
            C12055zG0 c12055zG0 = this.b;
            if (((C5877hG0) c12055zG0.a).i()) {
                if (bg0.k && (callback2 = bg0.n) != null) {
                    callback2.onResult(new AG0(false, true));
                }
                c12055zG0.a(bg0.a, bg0.c, bg0.p, bg0.o);
                return;
            }
        }
        if (!bg0.k || (callback = bg0.n) == null) {
            return;
        }
        callback.onResult(new AG0(true, false));
    }
}
