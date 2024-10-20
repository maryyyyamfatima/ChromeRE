package defpackage;

import android.content.SharedPreferences;
import android.widget.CompoundButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bw0 */
/* loaded from: classes.dex */
public final class C0241Bw0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C1281Jw0 a;

    public C0241Bw0(C1281Jw0 c1281Jw0) {
        this.a = c1281Jw0;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1281Jw0 c1281Jw0 = this.a;
        c1281Jw0.getClass();
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putBoolean(c1281Jw0.s.toString(), z);
        edit.apply();
        int i = ViewOnClickListenerC0501Dw0.D;
    }
}
