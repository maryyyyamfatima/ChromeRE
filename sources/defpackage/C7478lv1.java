package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7478lv1 implements Ld4 {
    public final /* synthetic */ C7822mv1 a;

    @Override // defpackage.Ld4
    public final void a(float f, int i, int i2) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((C0379Cx3) it.next()).a(f, i, i2);
        }
    }

    @Override // defpackage.Ld4
    public final void b(int i) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((C0379Cx3) it.next()).b(i);
        }
    }

    @Override // defpackage.Ld4
    public final void c(int i) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((C0379Cx3) it.next()).c(i);
        }
    }

    public C7478lv1(C7822mv1 c7822mv1) {
        this.a = c7822mv1;
    }
}
