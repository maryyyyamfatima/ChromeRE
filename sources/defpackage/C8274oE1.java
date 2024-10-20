package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oE1 */
/* loaded from: classes.dex */
public final class C8274oE1 {
    public final int a;
    public boolean b;
    public String c;

    public C8274oE1(Object obj) {
        this.a = a(obj);
    }

    public final void b(Context context, C11122wZ1 c11122wZ1, int i) {
        C10926vy1 c10926vy1 = c11122wZ1.d.b.j;
        WZ wz = c10926vy1.i;
        if (!this.b) {
            InterfaceC9750sZ1 a = D10.a(context, wz, i);
            if (a != null) {
                a.a(c11122wZ1.a);
            }
            this.b = true;
            this.c = "unmountItem";
            return;
        }
        throw new C7930nE1(AbstractC10204ts.a(AbstractC10975w63.a("Releasing released mount content! component: ", wz != null ? wz.c0() : "<null>", ", globalKey: ", wz != null ? A10.c(wz) : "<null>", ", transitionId: "), String.valueOf(c10926vy1.p), ", previousReleaseCause: ", this.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    public static int a(Object obj) {
        if (!(obj instanceof View)) {
            return 0;
        }
        View view = (View) obj;
        boolean isClickable = view.isClickable();
        boolean z = isClickable;
        if (view.isLongClickable()) {
            z = (isClickable ? 1 : 0) | 2;
        }
        boolean z2 = z;
        if (view.isFocusable()) {
            z2 = (z ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (view.isEnabled()) {
            z3 = (z2 ? 1 : 0) | '\b';
        }
        ?? r0 = z3;
        if (view.isSelected()) {
            r0 = (z3 ? 1 : 0) | 16;
        }
        int layerType = view.getLayerType();
        if (layerType == 0) {
            return r0;
        }
        if (layerType == 1) {
            return r0 | 32;
        }
        if (layerType == 2) {
            return r0 | 64;
        }
        throw new IllegalArgumentException("Unhandled layer type encountered.");
    }
}
