package org.chromium.components.dom_distiller.core;

import J.N;
import android.widget.RadioButton;
import defpackage.CR0;
import defpackage.InterfaceC8822pq0;
import defpackage.OJ3;
import org.chromium.chrome.browser.dom_distiller.DistilledPagePrefsView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DistilledPagePrefs$DistilledPagePrefsObserverWrapper {
    public final InterfaceC8822pq0 a;
    public final long b = N.MxAdC41V(this);

    public DistilledPagePrefs$DistilledPagePrefsObserverWrapper(InterfaceC8822pq0 interfaceC8822pq0) {
        this.a = interfaceC8822pq0;
    }

    public final void onChangeFontFamily(int i) {
        CR0.a(i);
        DistilledPagePrefsView distilledPagePrefsView = (DistilledPagePrefsView) this.a;
        distilledPagePrefsView.getClass();
        CR0.a(i);
        distilledPagePrefsView.k.setSelection(i);
    }

    public final void onChangeTheme(int i) {
        OJ3.a(i);
        DistilledPagePrefsView distilledPagePrefsView = (DistilledPagePrefsView) this.a;
        distilledPagePrefsView.getClass();
        OJ3.a(i);
        ((RadioButton) distilledPagePrefsView.g.get(Integer.valueOf(i))).setChecked(true);
    }

    public final void onChangeFontScaling(float f) {
        DistilledPagePrefsView distilledPagePrefsView = (DistilledPagePrefsView) this.a;
        double d = f;
        distilledPagePrefsView.i.setText(distilledPagePrefsView.l.format(d));
        distilledPagePrefsView.j.setProgress((int) Math.round((d - 0.5d) * 20.0d));
    }
}
