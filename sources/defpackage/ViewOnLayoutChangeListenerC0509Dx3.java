package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dx3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0509Dx3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ C0639Ex3 g;

    public ViewOnLayoutChangeListenerC0509Dx3(C0639Ex3 c0639Ex3, View view) {
        this.g = c0639Ex3;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.getVisibility() == 0) {
            this.g.getClass();
        }
    }
}
