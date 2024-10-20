package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class N23 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Q23 a;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int[] iArr = {i};
        Q23 q23 = this.a;
        q23.c(iArr);
        q23.a(false);
    }

    public N23(Q23 q23) {
        this.a = q23;
    }
}
