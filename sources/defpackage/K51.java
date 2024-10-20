package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K51 implements InterfaceC9395rX {
    public static final TL2 b = AbstractC0952Hi1.g(N51.h, new C7778mo(1, 1), N51.i, new C7778mo(3, 3), N51.j, new C7778mo(6, 6), N51.k, new C7778mo(4, 4), N51.l, new C7778mo(16, 16));
    public final AbstractC9896sy0 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final L51 l51 = (L51) obj;
        boolean z = (l51.j & 1) != 0;
        C5971hZ c5971hZ = C5971hZ.a;
        AbstractC9896sy0 abstractC9896sy0 = this.a;
        if (!z) {
            abstractC9896sy0.d(EnumC11438xU.v, "HapticCommand is missing a type.", ((C2924Wn) abstractC9053qX).i, null);
            return c5971hZ;
        }
        N51 b2 = N51.b(l51.k);
        N51 n51 = N51.g;
        if (b2 == null) {
            b2 = n51;
        }
        TL2 tl2 = b;
        boolean containsKey = tl2.containsKey(b2);
        EnumC11438xU enumC11438xU = EnumC11438xU.D;
        if (!containsKey) {
            Object[] objArr = new Object[1];
            N51 b3 = N51.b(l51.k);
            if (b3 != null) {
                n51 = b3;
            }
            objArr[0] = n51.name();
            abstractC9896sy0.d(enumC11438xU, String.format("Haptic type %s is not available.", objArr), ((C2924Wn) abstractC9053qX).i, null);
            return c5971hZ;
        }
        int i = Build.VERSION.SDK_INT;
        N51 b4 = N51.b(l51.k);
        if (b4 == null) {
            b4 = n51;
        }
        if (i >= ((C7778mo) tl2.get(b4)).b) {
            return new C7345lZ(new Runnable() { // from class: J51
                @Override // java.lang.Runnable
                public final void run() {
                    View view = ((C2924Wn) AbstractC9053qX.this).a;
                    TL2 tl22 = K51.b;
                    N51 b5 = N51.b(l51.k);
                    if (b5 == null) {
                        b5 = N51.g;
                    }
                    view.performHapticFeedback(((C7778mo) tl22.get(b5)).a);
                }
            }).e(AbstractC2209Ra.a());
        }
        Object[] objArr2 = new Object[2];
        N51 b5 = N51.b(l51.k);
        if (b5 != null) {
            n51 = b5;
        }
        objArr2[0] = n51.name();
        objArr2[1] = Integer.valueOf(i);
        abstractC9896sy0.d(enumC11438xU, String.format("Haptic type %s is not supported in Android version %d.", objArr2), ((C2924Wn) abstractC9053qX).i, null);
        return c5971hZ;
    }

    public K51(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return L51.n;
    }
}
