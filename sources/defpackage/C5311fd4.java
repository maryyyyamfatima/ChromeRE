package defpackage;

import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fd4 */
/* loaded from: classes.dex */
public final class C5311fd4 extends C3165Yj0 {
    public final C8748pd4 t;
    public boolean u = false;

    public C5311fd4(C8748pd4 c8748pd4) {
        this.t = c8748pd4;
    }

    @Override // defpackage.C3165Yj0, defpackage.AbstractC2348Sb3
    public final void i(d dVar) {
        super.i(dVar);
        if (this.u) {
            return;
        }
        this.u = true;
        l(new InterfaceC9676sK2() { // from class: ed4
            @Override // defpackage.InterfaceC9676sK2
            public final void a() {
                C5311fd4 c5311fd4 = C5311fd4.this;
                c5311fd4.u = false;
                c5311fd4.t.a();
            }
        });
    }
}
