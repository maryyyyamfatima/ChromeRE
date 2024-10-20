package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6097hu0 extends ArrayAdapter {
    public final Context a;
    public final Set g;
    public final boolean h;
    public final int i;

    public C6097hu0(Context context, ArrayList arrayList) {
        super(context, R.layout.f57380_resource_name_obfuscated_res_0x7f0e00f2);
        this.a = context;
        addAll(arrayList);
        this.g = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= getCount()) {
                z = true;
                break;
            }
            AbstractC7127ku0 abstractC7127ku0 = (AbstractC7127ku0) getItem(i);
            if (abstractC7127ku0.h() && !abstractC7127ku0.i()) {
                break;
            } else {
                i++;
            }
        }
        this.h = z;
        this.i = context.getResources().getDimensionPixelSize(R.dimen.f31360_resource_name_obfuscated_res_0x7f0801e1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int color;
        Context context = this.a;
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f57380_resource_name_obfuscated_res_0x7f0e00f2, (ViewGroup) null);
            view.setBackground(new C6439iu0());
        }
        C6439iu0 c6439iu0 = (C6439iu0) view.getBackground();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f31350_resource_name_obfuscated_res_0x7f0801e0);
        if (i == 0) {
            c6439iu0.a.setColor(0);
        } else {
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f31340_resource_name_obfuscated_res_0x7f0801df);
            dimensionPixelSize += dimensionPixelSize2;
            Rect rect = c6439iu0.b;
            rect.set(0, 0, rect.right, dimensionPixelSize2);
            Set set = this.g;
            if (set != null && set.contains(Integer.valueOf(i))) {
                color = context.getColor(R.color.f18750_resource_name_obfuscated_res_0x7f07018c);
            } else {
                color = context.getColor(R.color.f18760_resource_name_obfuscated_res_0x7f07018d);
            }
            c6439iu0.a.setColor(color);
        }
        AbstractC7127ku0 abstractC7127ku0 = (AbstractC7127ku0) getItem(i);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dropdown_label_wrapper);
        if (abstractC7127ku0.k()) {
            dimensionPixelSize = -2;
        }
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, dimensionPixelSize, 1.0f));
        TextView textView = (TextView) view.findViewById(R.id.dropdown_label);
        textView.setText(abstractC7127ku0.d());
        textView.setSingleLine(!abstractC7127ku0.k());
        if (abstractC7127ku0.k()) {
            WeakHashMap weakHashMap = Ec4.a;
            int paddingStart = textView.getPaddingStart();
            int paddingEnd = textView.getPaddingEnd();
            int i2 = this.i;
            textView.setPaddingRelative(paddingStart, i2, paddingEnd, i2);
        }
        textView.setEnabled(abstractC7127ku0.h());
        if (abstractC7127ku0.i() || abstractC7127ku0.g()) {
            textView.setTypeface(null, 1);
        } else {
            textView.setTypeface(null, 0);
        }
        textView.setTextColor(context.getColor(abstractC7127ku0.e()));
        textView.setTextSize(0, context.getResources().getDimension(R.dimen.f41720_resource_name_obfuscated_res_0x7f0807c9));
        TextView textView2 = (TextView) view.findViewById(R.id.dropdown_sublabel);
        String f = abstractC7127ku0.f();
        if (TextUtils.isEmpty(f)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(f);
            textView2.setTextSize(0, context.getResources().getDimension(R.dimen.f41760_resource_name_obfuscated_res_0x7f0807cd));
            textView2.setVisibility(0);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.start_dropdown_icon);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.end_dropdown_icon);
        if (abstractC7127ku0.j()) {
            imageView2.setVisibility(8);
        } else {
            imageView.setVisibility(8);
        }
        if (!abstractC7127ku0.j()) {
            imageView = imageView2;
        }
        if (abstractC7127ku0.b() == 0) {
            imageView.setVisibility(8);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.width = -2;
            marginLayoutParams.height = -2;
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.f31330_resource_name_obfuscated_res_0x7f0801de);
            marginLayoutParams.setMarginStart(dimensionPixelSize3);
            marginLayoutParams.setMarginEnd(dimensionPixelSize3);
            imageView.setLayoutParams(marginLayoutParams);
            imageView.setImageDrawable(AbstractC2884Wf.a(context, abstractC7127ku0.b()));
            imageView.setVisibility(0);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.h;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        if (i < 0 || i >= getCount()) {
            return false;
        }
        AbstractC7127ku0 abstractC7127ku0 = (AbstractC7127ku0) getItem(i);
        return abstractC7127ku0.h() && !abstractC7127ku0.i();
    }
}
