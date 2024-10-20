package defpackage;

import android.widget.CompoundButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7484lw1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ViewOnClickListenerC7828mw1 a;

    public C7484lw1(ViewOnClickListenerC7828mw1 viewOnClickListenerC7828mw1) {
        this.a = viewOnClickListenerC7828mw1;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ViewOnClickListenerC7828mw1 viewOnClickListenerC7828mw1 = this.a;
        if (z) {
            viewOnClickListenerC7828mw1.E.add(viewOnClickListenerC7828mw1.D);
        } else {
            viewOnClickListenerC7828mw1.E.remove(viewOnClickListenerC7828mw1.D);
        }
    }
}
