package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dg */
/* loaded from: classes.dex */
public final class C4637dg implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C5668gg a;

    public C4637dg(C5668gg c5668gg) {
        this.a = c5668gg;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C5668gg c5668gg = this.a;
        c5668gg.M.setSelection(i);
        if (c5668gg.M.getOnItemClickListener() != null) {
            c5668gg.M.performItemClick(view, i, c5668gg.f11507J.getItemId(i));
        }
        c5668gg.dismiss();
    }
}
