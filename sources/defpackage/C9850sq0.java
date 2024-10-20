package defpackage;

import J.N;
import android.view.View;
import android.widget.AdapterView;
import org.chromium.chrome.browser.dom_distiller.DistilledPagePrefsView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9850sq0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ DistilledPagePrefsView a;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0 && i <= 2) {
            C9165qq0 c9165qq0 = this.a.h;
            c9165qq0.getClass();
            CR0.a(i);
            N.MfkxLC88(c9165qq0.a, c9165qq0, i);
        }
    }

    public C9850sq0(DistilledPagePrefsView distilledPagePrefsView) {
        this.a = distilledPagePrefsView;
    }
}
