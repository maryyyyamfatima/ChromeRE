package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nJ2 */
/* loaded from: classes.dex */
public final class C7956nJ2 implements Ze4 {
    public final /* synthetic */ KJ2 a;

    public C7956nJ2(KJ2 kj2) {
        this.a = kj2;
    }

    @Override // defpackage.Ze4
    public final void a(int i, int i2, int i3, int i4, int i5) {
        KJ2 kj2 = this.a;
        kj2.V = i;
        kj2.W = i2;
        kj2.j0.f = false;
        kj2.b0();
        KJ2 kj22 = this.a;
        int i6 = kj22.Z;
        if (i6 == -1 || i == -1 || i2 == -1) {
            return;
        }
        int max = Math.max(i6, i2 - i);
        int i7 = (int) (max * kj22.j);
        int max2 = Math.max(0, i - i7);
        int min = Math.min(max + i + i7, kj22.a.size() - 1);
        for (int i8 = max2; i8 <= min; i8++) {
            O00 o00 = (O00) kj22.a.get(i8);
            synchronized (o00) {
                ComponentTree componentTree = o00.s;
                if (componentTree != null) {
                    synchronized (componentTree) {
                        C0772Fy1 c0772Fy1 = componentTree.W;
                        if (c0772Fy1 != null) {
                            c0772Fy1.e(i8, i, i2, i3, i4, componentTree.d0);
                        }
                    }
                }
            }
        }
    }
}
