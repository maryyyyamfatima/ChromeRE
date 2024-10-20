package defpackage;

import android.widget.Filter;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j52, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6505j52 extends Filter {
    public final /* synthetic */ C6849k52 a;

    public C6505j52(C6849k52 c6849k52) {
        this.a = c6849k52;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        List list = this.a.a;
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.a.notifyDataSetChanged();
    }
}
