package defpackage;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k52, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6849k52 extends ArrayAdapter {
    public final List a;
    public final C6505j52 g;

    public C6849k52(Context context, List list) {
        super(context, R.layout.simple_spinner_item, list);
        this.a = list;
        this.g = new C6505j52(this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return this.g;
    }
}
