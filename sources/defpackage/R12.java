package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.content_public.browser.NavigationEntry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class R12 extends BaseAdapter {
    public Integer a;
    public final /* synthetic */ S12 g;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.j.b();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.g.j.a(i);
    }

    public R12(S12 s12) {
        this.g = s12;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((NavigationEntry) getItem(i)).a;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Q12 q12;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01ac, viewGroup, false);
            q12 = new Q12();
            q12.a = view;
            q12.b = (ImageView) view.findViewById(R.id.favicon_img);
            q12.c = (TextView) view.findViewById(R.id.entry_title);
            view.setTag(q12);
        } else {
            q12 = (Q12) view.getTag();
        }
        NavigationEntry navigationEntry = (NavigationEntry) getItem(i);
        TextView textView = q12.c;
        String str = navigationEntry.f;
        if (TextUtils.isEmpty(str)) {
            str = navigationEntry.d.i();
        }
        if (TextUtils.isEmpty(str)) {
            str = navigationEntry.b.i();
        }
        textView.setText(str);
        q12.b.setImageBitmap(navigationEntry.g);
        int i2 = navigationEntry.a;
        S12 s12 = this.g;
        if (i2 == -1) {
            q12.b.setImageTintList(Y50.b(s12.g, R.color.0_resource_name_obfuscated_res_0x7f070113));
        } else {
            q12.b.setImageTintList(null);
        }
        if (s12.l == 0) {
            View view2 = q12.a;
            if (this.a == null) {
                this.a = Integer.valueOf(view2.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805f7));
            }
            q12.a.setPadding(view2.getPaddingLeft(), i == 0 ? this.a.intValue() : 0, view2.getPaddingRight(), view2.getPaddingBottom());
        }
        return view;
    }
}
