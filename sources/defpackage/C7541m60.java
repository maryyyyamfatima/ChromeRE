package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m60 */
/* loaded from: classes.dex */
public final class C7541m60 extends C7342lY1 {
    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    public C7541m60(C7616mK1 c7616mK1) {
        super(c7616mK1);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return getItemViewType(i) == 2 || getItemViewType(i) == 3;
    }

    @Override // defpackage.C7342lY1, android.widget.Adapter
    public final long getItemId(int i) {
        if (getItemViewType(i) == 2 || getItemViewType(i) == 3) {
            return ((C7272lK1) getItem(i)).b.h(D60.b);
        }
        return -1L;
    }
}
