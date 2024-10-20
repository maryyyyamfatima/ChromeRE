package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xl2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3047Xl2 extends BaseAdapter {
    public final Context a;
    public final String g;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    public C3047Xl2(Context context, String str) {
        this.a = context;
        this.g = str;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view != null) {
            return view;
        }
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.f59440_resource_name_obfuscated_res_0x7f0e01e4, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.password_generation_explanation)).setText(this.g);
        return inflate;
    }
}
