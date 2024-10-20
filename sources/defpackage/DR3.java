package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DR3 extends AbstractC7723me4 {
    public boolean a = false;
    public final /* synthetic */ int b;
    public final /* synthetic */ ER3 c;

    public DR3(ER3 er3, int i) {
        this.c = er3;
        this.b = i;
    }

    @Override // defpackage.AbstractC7723me4, defpackage.InterfaceC7379le4
    public final void c() {
        this.c.a.setVisibility(0);
    }

    @Override // defpackage.InterfaceC7379le4
    public final void a() {
        if (this.a) {
            return;
        }
        this.c.a.setVisibility(this.b);
    }

    @Override // defpackage.AbstractC7723me4, defpackage.InterfaceC7379le4
    public final void b(View view) {
        this.a = true;
    }
}
