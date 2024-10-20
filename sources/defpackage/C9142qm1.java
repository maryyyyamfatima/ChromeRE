package defpackage;

import android.view.View;
import android.widget.AdapterView;
import org.chromium.content.browser.picker.DateTimeSuggestion;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9142qm1 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C2765Vh0 a;
    public final /* synthetic */ int g;
    public final /* synthetic */ double h;
    public final /* synthetic */ double i;
    public final /* synthetic */ double j;
    public final /* synthetic */ double k;
    public final /* synthetic */ C0062Am1 l;

    public C9142qm1(C0062Am1 c0062Am1, C2765Vh0 c2765Vh0, int i, double d, double d2, double d3, double d4) {
        this.l = c0062Am1;
        this.a = c2765Vh0;
        this.g = i;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = d4;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2765Vh0 c2765Vh0 = this.a;
        int count = c2765Vh0.getCount() - 1;
        C0062Am1 c0062Am1 = this.l;
        if (i != count) {
            c0062Am1.d.a(((DateTimeSuggestion) c2765Vh0.getItem(i)).a);
            c0062Am1.a();
            c0062Am1.b = true;
            return;
        }
        c0062Am1.a();
        this.l.c(this.g, this.h, this.i, this.j, this.k);
    }
}
