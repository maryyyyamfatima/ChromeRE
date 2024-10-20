package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bD1 */
/* loaded from: classes2.dex */
public final class C3801bD1 extends C7342lY1 {
    public C3801bD1(C7616mK1 c7616mK1) {
        super(c7616mK1);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        for (int i = 0; i < getCount(); i++) {
            if (!isEnabled(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return getItemViewType(i) != 0 && ((C7272lK1) getItem(i)).b.j(AbstractC4144cD1.f);
    }

    @Override // defpackage.C7342lY1, android.widget.Adapter
    public final long getItemId(int i) {
        return ((C7272lK1) getItem(i)).b.h(AbstractC4144cD1.e);
    }

    @Override // defpackage.C7342lY1, android.widget.Adapter
    public final View getView(final int i, View view, final ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        view2.setOnClickListener(new View.OnClickListener() { // from class: aD1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C3801bD1 c3801bD1 = C3801bD1.this;
                ((ListView) viewGroup).performItemClick(view3, i, ((C7272lK1) c3801bD1.getItem(r1)).b.h(AbstractC4144cD1.e));
            }
        });
        view2.setEnabled(isEnabled(i));
        return view2;
    }
}
