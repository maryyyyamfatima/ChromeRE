package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N73 extends AbstractC4472dA0 {
    public final /* synthetic */ O73 a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i == 0) {
            EI2.h(i2, 10, "Sharing.SharingHubAndroid.CloseReason");
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void b(PB pb) {
        final O73 o73 = this.a;
        I73 i73 = o73.w;
        if (i73 == null) {
            return;
        }
        if (pb == i73) {
            i73.j.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: M73
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    O73.this.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        } else {
            i73.j.removeOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: M73
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    O73.this.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
    }

    public N73(O73 o73) {
        this.a = o73;
    }
}
