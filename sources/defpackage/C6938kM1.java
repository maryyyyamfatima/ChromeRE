package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kM1 */
/* loaded from: classes.dex */
public final class C6938kM1 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C7626mM1 a;

    public C6938kM1(C7626mM1 c7626mM1) {
        this.a = c7626mM1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        C7626mM1 c7626mM1 = this.a;
        if (i >= 0) {
            item = c7626mM1.getAdapter().getItem(i);
        } else {
            BD1 bd1 = c7626mM1.j;
            item = !bd1.a() ? null : bd1.h.getSelectedItem();
        }
        C7626mM1.b(c7626mM1, item);
        AdapterView.OnItemClickListener onItemClickListener = c7626mM1.getOnItemClickListener();
        BD1 bd12 = c7626mM1.j;
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = bd12.a() ? bd12.h.getSelectedView() : null;
                i = !bd12.a() ? -1 : bd12.h.getSelectedItemPosition();
                j = !bd12.a() ? Long.MIN_VALUE : bd12.h.getSelectedItemId();
            }
            onItemClickListener.onItemClick(bd12.h, view, i, j);
        }
        bd12.dismiss();
    }
}
