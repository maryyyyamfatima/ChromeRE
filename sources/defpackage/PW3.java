package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PW3 extends ArrayAdapter {
    public static final /* synthetic */ int i = 0;
    public final LayoutInflater a;
    public int g;
    public final /* synthetic */ RW3 h;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PW3(RW3 rw3, int i2) {
        super(rw3.i, R.layout.f61800_resource_name_obfuscated_res_0x7f0e02d8, RW3.a(rw3, i2));
        this.h = rw3;
        this.a = LayoutInflater.from(rw3.i);
        this.g = i2;
    }

    public final String b(OW3 ow3) {
        int i2 = this.g;
        RW3 rw3 = this.h;
        if (i2 != 0) {
            return rw3.g.a(ow3.c);
        }
        String c = rw3.g.c();
        int i3 = ow3.b;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "" : rw3.i.getString(R.string.f89470_resource_name_obfuscated_res_0x7f140b59, c) : rw3.i.getString(R.string.f89460_resource_name_obfuscated_res_0x7f140b58, c) : rw3.i.getString(R.string.f89430_resource_name_obfuscated_res_0x7f140b55) : rw3.i.getString(R.string.f89440_resource_name_obfuscated_res_0x7f140b56, c) : rw3.i.getString(R.string.f89450_resource_name_obfuscated_res_0x7f140b57);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        return ((OW3) getItem(i2)).a;
    }

    public final View a(int i2, int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(i3, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.menu_item_text)).setText(b((OW3) getItem(i2)));
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        String str;
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 0) {
            return a(i2, R.layout.f61800_resource_name_obfuscated_res_0x7f0e02d8, view, viewGroup);
        }
        RW3 rw3 = this.h;
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return view;
            }
            if (view == null) {
                view = this.a.inflate(R.layout.f61790_resource_name_obfuscated_res_0x7f0e02d7, viewGroup, false);
            }
            OW3 ow3 = (OW3) getItem(i2);
            ((TextView) view.findViewById(R.id.menu_item_text)).setText(b(ow3));
            TextView textView = (TextView) view.findViewById(R.id.menu_item_secondary_text);
            ZW3 zw3 = rw3.g;
            String str2 = ow3.c;
            if (zw3.b(str2)) {
                Locale forLanguageTag = Locale.forLanguageTag(str2);
                str = forLanguageTag.getDisplayName(forLanguageTag);
            } else {
                str = "";
            }
            textView.setText(str);
            view.findViewById(R.id.menu_item_list_divider).setVisibility(ow3.d ? 0 : 8);
            return view;
        }
        View a = a(i2, R.layout.f61810_resource_name_obfuscated_res_0x7f0e02d9, view, viewGroup);
        ImageView imageView = (ImageView) a.findViewById(R.id.menu_item_icon);
        if (((OW3) getItem(i2)).b == 1 && rw3.g.h[2]) {
            imageView.setVisibility(0);
        } else if (((OW3) getItem(i2)).b == 3 && rw3.g.h[0]) {
            imageView.setVisibility(0);
        } else if (((OW3) getItem(i2)).b == 2 && rw3.g.h[1]) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        View findViewById = a.findViewById(R.id.menu_item_divider);
        if (!((OW3) getItem(i2)).d) {
            return a;
        }
        findViewById.setVisibility(0);
        return a;
    }
}
