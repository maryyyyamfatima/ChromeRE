package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Zc4 implements InterfaceC3812bF2 {
    public final View a;
    public int b;

    public Zc4(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // defpackage.InterfaceC3812bF2
    public final boolean a() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            AbstractC3593ad4.a(this.a);
        }
        return this.b > 0;
    }
}
