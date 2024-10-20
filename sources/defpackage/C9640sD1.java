package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9640sD1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ BD1 a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C9640sD1(BD1 bd1) {
        this.a = bd1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C5753gu0 c5753gu0;
        if (i == -1 || (c5753gu0 = this.a.h) == null) {
            return;
        }
        c5753gu0.n = false;
    }
}
