package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vz */
/* loaded from: classes.dex */
public final class C2854Vz extends BaseAdapter {
    public final int a;
    public final int g;
    public List h = new ArrayList();

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public C2854Vz(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08008d);
        this.a = dimensionPixelSize;
        this.g = dimensionPixelSize * 2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.h.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (C2984Wz) this.h.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return ((C2984Wz) this.h.get(i)).e;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable b;
        int integer;
        C2984Wz c2984Wz = (C2984Wz) this.h.get(i);
        if (view != null && c2984Wz.e != 1) {
            return view;
        }
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0187, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.title)).setText(c2984Wz.b);
        view.findViewById(R.id.description).setVisibility(8);
        ImageView imageView = (ImageView) view.findViewById(R.id.start_icon);
        if (c2984Wz.e == 1) {
            b = WA.c(view.getContext(), c2984Wz.a.getType());
        } else {
            b = C11674y84.b(view.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f0901b9, view.getContext().getTheme());
            b.setTintList(Y50.b(view.getContext(), R.color.0_resource_name_obfuscated_res_0x7f07012b));
        }
        int i2 = S23.E;
        imageView.setBackgroundResource(R.drawable.0_resource_name_obfuscated_res_0x7f090371);
        boolean z = c2984Wz.d;
        if (z) {
            b = LN3.b(imageView.getContext(), R.drawable.0_resource_name_obfuscated_res_0x7f0901d5);
            b.setTint(AbstractC10957w33.d(imageView.getContext()));
        }
        imageView.setImageDrawable(b);
        Drawable background = imageView.getBackground();
        if (z) {
            integer = imageView.getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0045);
        } else {
            integer = imageView.getResources().getInteger(R.integer.0_resource_name_obfuscated_res_0x7f0c0043);
        }
        background.setLevel(integer);
        int min = Math.min(c2984Wz.c, 5) * this.g;
        int i3 = this.a;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        WeakHashMap weakHashMap = Ec4.a;
        view.setPaddingRelative(min + i3, paddingTop, i3, paddingBottom);
        return view;
    }
}
