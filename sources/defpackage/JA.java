package defpackage;

import android.widget.CompoundButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class JA implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ LA a;

    public /* synthetic */ JA(LA la) {
        this.a = la;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.k(compoundButton, z);
    }
}
