package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K23 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ListView a;
    public final /* synthetic */ M23 g;

    public K23(M23 m23, ListView listView) {
        this.g = m23;
        this.a = listView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int[] c = M23.c(this.a);
        M23 m23 = this.g;
        m23.d(c);
        m23.a.dismiss();
    }
}
