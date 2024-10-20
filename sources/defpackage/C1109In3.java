package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: In3 */
/* loaded from: classes.dex */
public final class C1109In3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C1758Nn3 a;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1758Nn3 c1758Nn3 = this.a;
        c1758Nn3.v.dismiss();
        if (i == 0) {
            c1758Nn3.c.w(false);
        }
    }

    public C1109In3(C1758Nn3 c1758Nn3) {
        this.a = c1758Nn3;
    }
}
