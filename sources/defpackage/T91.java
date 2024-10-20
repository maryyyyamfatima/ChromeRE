package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T91 implements InterfaceC8030nY1 {
    public static final C8752pe2 b = C8752pe2.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final C6654jY1 a;

    @Override // defpackage.InterfaceC8030nY1
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        C5788h01 c5788h01 = (C5788h01) obj;
        C6654jY1 c6654jY1 = this.a;
        if (c6654jY1 != null) {
            C6312iY1 a = C6312iY1.a(c5788h01);
            C5968hY1 c5968hY1 = c6654jY1.a;
            Object a2 = c5968hY1.a(a);
            ArrayDeque arrayDeque = C6312iY1.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a);
            }
            C5788h01 c5788h012 = (C5788h01) a2;
            if (c5788h012 == null) {
                c5968hY1.d(C6312iY1.a(c5788h01), c5788h01);
            } else {
                c5788h01 = c5788h012;
            }
        }
        return new C7686mY1(c5788h01, new C5978ha1(c5788h01, ((Integer) c0543Ee2.c(b)).intValue()));
    }

    public T91(C6654jY1 c6654jY1) {
        this.a = c6654jY1;
    }
}
