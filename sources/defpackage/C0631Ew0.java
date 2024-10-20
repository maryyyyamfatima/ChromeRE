package defpackage;

import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ew0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631Ew0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C0891Gw0 g;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str;
        C0891Gw0 c0891Gw0 = this.g;
        if (c0891Gw0.l != i) {
            CharSequence charSequence = (CharSequence) c0891Gw0.m.getItem(i);
            C1281Jw0 c1281Jw0 = c0891Gw0.g;
            if (charSequence == null) {
                c1281Jw0.getClass();
                str = null;
            } else {
                str = (String) c1281Jw0.f.get(charSequence.toString());
            }
            CharSequence charSequence2 = c1281Jw0.t;
            if (charSequence2 != null && i == 0) {
                str = null;
            }
            c0891Gw0.l = i;
            if (str != null || charSequence2 != null) {
                c1281Jw0.s = str;
                Callback callback = c1281Jw0.u;
                if (callback != null) {
                    callback.onResult(new Pair(str, this.a));
                }
            }
            c1281Jw0.n = null;
            c0891Gw0.c(false);
        }
    }

    public C0631Ew0(C0891Gw0 c0891Gw0, RunnableC0111Aw0 runnableC0111Aw0) {
        this.g = c0891Gw0;
        this.a = runnableC0111Aw0;
    }
}
