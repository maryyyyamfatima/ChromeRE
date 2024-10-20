package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.translate.TranslateMessage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XW3 extends BaseAdapter {
    public final LayoutInflater a;
    public TranslateMessage.MenuItem[] g;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public XW3(Context context, TranslateMessage.MenuItem[] menuItemArr) {
        this.a = LayoutInflater.from(context);
        this.g = menuItemArr;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return getItemViewType(i) != 0;
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

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        TranslateMessage.MenuItem menuItem = this.g[i];
        if (menuItem.a.equals("")) {
            return 0;
        }
        if (menuItem.b.equals("")) {
            return menuItem.c ? 3 : 1;
        }
        return 2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        TranslateMessage.MenuItem[] menuItemArr = this.g;
        if (menuItemArr == null) {
            return 0;
        }
        return menuItemArr.length;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.g[i];
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return a(0, R.layout.f55780_resource_name_obfuscated_res_0x7f0e0040, view, viewGroup);
        }
        if (itemViewType == 1) {
            View a = a(1, R.layout.f61800_resource_name_obfuscated_res_0x7f0e02d8, view, viewGroup);
            ((TextView) a.findViewById(R.id.menu_item_text)).setText(this.g[i].a);
            return a;
        }
        if (itemViewType == 2) {
            View a2 = a(2, R.layout.f61790_resource_name_obfuscated_res_0x7f0e02d7, view, viewGroup);
            ((TextView) a2.findViewById(R.id.menu_item_text)).setText(this.g[i].a);
            ((TextView) a2.findViewById(R.id.menu_item_secondary_text)).setText(this.g[i].b);
            return a2;
        }
        if (itemViewType != 3) {
            return view;
        }
        View a3 = a(3, R.layout.f61810_resource_name_obfuscated_res_0x7f0e02d9, view, viewGroup);
        ((TextView) a3.findViewById(R.id.menu_item_text)).setText(this.g[i].a);
        return a3;
    }

    public final View a(int i, int i2, View view, ViewGroup viewGroup) {
        if ((view == null || view.getTag(R.id.view_type) == null || ((Integer) view.getTag(R.id.view_type)).intValue() != i) ? false : true) {
            return view;
        }
        View inflate = this.a.inflate(i2, viewGroup, false);
        inflate.setTag(R.id.view_type, Integer.valueOf(i));
        return inflate;
    }
}
