package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
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
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10878vq extends ArrayAdapter {
    public final Context a;
    public final Set g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public C10878vq(Context context, ArrayList arrayList, HashSet hashSet, boolean z) {
        super(context, z ? R.layout.f55920_resource_name_obfuscated_res_0x7f0e004e : R.layout.f55910_resource_name_obfuscated_res_0x7f0e004d);
        this.a = context;
        addAll(arrayList);
        this.g = hashSet;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= getCount()) {
                z2 = true;
                break;
            }
            AbstractC7127ku0 abstractC7127ku0 = (AbstractC7127ku0) getItem(i);
            if (abstractC7127ku0.h() && !abstractC7127ku0.i()) {
                break;
            } else {
                i++;
            }
        }
        this.h = z2;
        this.i = context.getResources().getDimensionPixelSize(R.dimen.f28260_resource_name_obfuscated_res_0x7f080076);
        this.j = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        int color;
        View findViewById;
        boolean z = this.j;
        Context context = this.a;
        if (view == null) {
            view2 = LayoutInflater.from(context).inflate(z ? R.layout.f55920_resource_name_obfuscated_res_0x7f0e004e : R.layout.f55910_resource_name_obfuscated_res_0x7f0e004d, (ViewGroup) null);
            view2.setBackground(new C6439iu0());
        } else {
            view2 = view;
        }
        AbstractC7127ku0 abstractC7127ku0 = (AbstractC7127ku0) getItem(i);
        if (!z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f28250_resource_name_obfuscated_res_0x7f080075);
            C6439iu0 c6439iu0 = (C6439iu0) view2.getBackground();
            if (i == 0) {
                c6439iu0.a.setColor(0);
            } else {
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f28240_resource_name_obfuscated_res_0x7f080074);
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
            TextView b = b(abstractC7127ku0, view2);
            if (b != null) {
                b.setTextSize(0, context.getResources().getDimension(R.dimen.f41760_resource_name_obfuscated_res_0x7f0807cd));
                dimensionPixelSize += context.getResources().getDimensionPixelSize(R.dimen.f28270_resource_name_obfuscated_res_0x7f080077);
            }
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.dropdown_label_wrapper);
            if (abstractC7127ku0.k()) {
                dimensionPixelSize = -2;
            }
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, dimensionPixelSize, 1.0f));
            TextView textView = (TextView) view2.findViewById(R.id.dropdown_label);
            textView.setEnabled(abstractC7127ku0.h());
            textView.setText(abstractC7127ku0.d());
            textView.setSingleLine(!abstractC7127ku0.k());
            if (abstractC7127ku0.k()) {
                WeakHashMap weakHashMap = Ec4.a;
                int paddingStart = textView.getPaddingStart();
                int paddingEnd = textView.getPaddingEnd();
                int i2 = this.i;
                textView.setPaddingRelative(paddingStart, i2, paddingEnd, i2);
            }
            if (abstractC7127ku0.i() || abstractC7127ku0.g()) {
                textView.setTypeface(null, 1);
            } else {
                textView.setTypeface(null, 0);
            }
            textView.setTextColor(context.getColor(abstractC7127ku0.e()));
            textView.setTextSize(0, context.getResources().getDimension(R.dimen.f41720_resource_name_obfuscated_res_0x7f0807c9));
            TextView c = c(abstractC7127ku0, view2);
            if (c != null) {
                c.setTextSize(0, context.getResources().getDimension(R.dimen.f41760_resource_name_obfuscated_res_0x7f0807cd));
            }
            ImageView imageView = (ImageView) view2.findViewById(R.id.start_dropdown_icon);
            ImageView imageView2 = (ImageView) view2.findViewById(R.id.end_dropdown_icon);
            if (abstractC7127ku0.j()) {
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
            }
            if (!abstractC7127ku0.j()) {
                imageView = imageView2;
            }
            ImageView a = a(imageView, abstractC7127ku0);
            if (a != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.getLayoutParams();
                marginLayoutParams.width = -2;
                marginLayoutParams.height = -2;
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.f31330_resource_name_obfuscated_res_0x7f0801de);
                marginLayoutParams.setMarginStart(dimensionPixelSize3);
                marginLayoutParams.setMarginEnd(dimensionPixelSize3);
                a.setLayoutParams(marginLayoutParams);
            }
            return view2;
        }
        TextView textView2 = (TextView) view2.findViewById(R.id.dropdown_label);
        textView2.setEnabled(abstractC7127ku0.h());
        textView2.setText(abstractC7127ku0.d());
        c(abstractC7127ku0, view2);
        b(abstractC7127ku0, view2);
        view2.findViewById(R.id.start_dropdown_icon).setVisibility(abstractC7127ku0.j() ? 0 : 8);
        view2.findViewById(R.id.end_dropdown_icon).setVisibility(abstractC7127ku0.j() ? 8 : 0);
        if (abstractC7127ku0.j()) {
            findViewById = view2.findViewById(R.id.start_dropdown_icon);
        } else {
            findViewById = view2.findViewById(R.id.end_dropdown_icon);
        }
        ImageView a2 = a((ImageView) findViewById, abstractC7127ku0);
        if (a2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
            marginLayoutParams2.width = -2;
            marginLayoutParams2.height = -2;
            a2.setLayoutParams(marginLayoutParams2);
        }
        if (abstractC7127ku0.k()) {
            textView2.setSingleLine(false);
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.dropdown_label_wrapper);
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.f28350_resource_name_obfuscated_res_0x7f08007f);
            linearLayout2.setPadding(0, dimensionPixelSize4, 0, dimensionPixelSize4);
        }
        return view2;
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

    public static TextView c(AbstractC7127ku0 abstractC7127ku0, View view) {
        TextView textView = (TextView) view.findViewById(R.id.dropdown_sublabel);
        String f = abstractC7127ku0.f();
        if (TextUtils.isEmpty(f)) {
            textView.setVisibility(8);
            return null;
        }
        textView.setText(f);
        textView.setVisibility(0);
        return textView;
    }

    public static TextView b(AbstractC7127ku0 abstractC7127ku0, View view) {
        TextView textView = (TextView) view.findViewById(R.id.dropdown_item_tag);
        String c = abstractC7127ku0.c();
        if (TextUtils.isEmpty(c)) {
            textView.setVisibility(8);
            return null;
        }
        textView.setText(c);
        textView.setVisibility(0);
        return textView;
    }

    public final ImageView a(ImageView imageView, AbstractC7127ku0 abstractC7127ku0) {
        if (abstractC7127ku0.b() == 0 && abstractC7127ku0.a() == null) {
            imageView.setVisibility(8);
            return null;
        }
        Bitmap a = abstractC7127ku0.a();
        Context context = this.a;
        if (a != null) {
            imageView.setImageBitmap(Bitmap.createScaledBitmap(abstractC7127ku0.a(), context.getResources().getDimensionPixelSize(R.dimen.f28230_resource_name_obfuscated_res_0x7f080073), context.getResources().getDimensionPixelSize(R.dimen.f28210_resource_name_obfuscated_res_0x7f080071), true));
        } else {
            imageView.setImageDrawable(AbstractC2884Wf.a(context, abstractC7127ku0.b()));
        }
        imageView.setVisibility(0);
        return imageView;
    }
}
