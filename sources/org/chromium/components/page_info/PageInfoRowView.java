package org.chromium.components.page_info;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C12199zh2;
import defpackage.Ge4;
import defpackage.Y50;
import org.chromium.components.page_info.PageInfoRowView;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PageInfoRowView extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final ChromeImageView a;
    public final TextView g;
    public final TextView h;

    public PageInfoRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f59290_resource_name_obfuscated_res_0x7f0e01d5, (ViewGroup) this, true);
        this.a = (ChromeImageView) findViewById(R.id.page_info_row_icon);
        this.g = (TextView) findViewById(R.id.page_info_row_title);
        this.h = (TextView) findViewById(R.id.page_info_row_subtitle);
        setVisibility(8);
    }

    public final void a(final C12199zh2 c12199zh2) {
        ColorStateList b;
        setVisibility(c12199zh2.a ? 0 : 8);
        if (c12199zh2.a) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i2 = c12199zh2.b;
            ChromeImageView chromeImageView = this.a;
            chromeImageView.setImageResource(i2);
            if (c12199zh2.g) {
                int a = Ge4.a(2.0f, displayMetrics);
                chromeImageView.setPadding(a, a, a, a);
            }
            if (c12199zh2.c == 0) {
                b = Y50.b(getContext(), R.color.f17870_resource_name_obfuscated_res_0x7f07012b);
            } else {
                b = ColorStateList.valueOf(getResources().getColor(c12199zh2.c));
            }
            chromeImageView.setImageTintList(b);
            String str = c12199zh2.d;
            TextView textView = this.g;
            textView.setText(str);
            textView.setVisibility(c12199zh2.d != null ? 0 : 8);
            CharSequence charSequence = c12199zh2.e;
            TextView textView2 = this.h;
            textView2.setText(charSequence);
            textView2.setVisibility(charSequence != null ? 0 : 8);
            textView2.setSingleLine(c12199zh2.h);
            textView2.setEllipsize(c12199zh2.h ? TextUtils.TruncateAt.END : null);
            if (c12199zh2.d != null && c12199zh2.e != null) {
                textView.setPadding(0, 0, 0, Ge4.a(4.0f, displayMetrics));
            }
            if (c12199zh2.f != null) {
                setClickable(true);
                setFocusable(true);
                getChildAt(0).setOnClickListener(new View.OnClickListener() { // from class: yh2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = PageInfoRowView.i;
                        C12199zh2.this.f.run();
                    }
                });
            }
            if (c12199zh2.i != 0) {
                setBackgroundColor(Y50.b(getContext(), c12199zh2.i).getDefaultColor());
            }
        }
    }
}
