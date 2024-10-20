package defpackage;

import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J74 extends AbstractC11251wv {
    public final Object i;

    @Override // defpackage.AbstractC11251wv
    public final float c() {
        return 1.0f;
    }

    public J74(TJ1 tj1, Object obj) {
        super(Collections.emptyList());
        k(tj1);
        this.i = obj;
    }

    @Override // defpackage.AbstractC11251wv
    public final void j(float f) {
        this.d = f;
    }

    @Override // defpackage.AbstractC11251wv
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // defpackage.AbstractC11251wv
    public final Object f() {
        TJ1 tj1 = this.e;
        Object obj = this.i;
        return tj1.b(obj, obj);
    }

    @Override // defpackage.AbstractC11251wv
    public final Object g(C12282zv1 c12282zv1, float f) {
        return f();
    }
}
