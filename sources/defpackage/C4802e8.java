package defpackage;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4802e8 extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C4802e8(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, R.id.text1, charSequenceArr);
    }
}
