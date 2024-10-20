package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.components.embedder_support.delegate.ColorPickerSimple;
import org.chromium.components.embedder_support.delegate.ColorSuggestion;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC3555aX extends BaseAdapter implements View.OnClickListener {
    public final Context a;
    public final ColorSuggestion[] g;
    public ZW h;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public ViewOnClickListenerC3555aX(Context context, ColorSuggestion[] colorSuggestionArr) {
        this.a = context;
        this.g = colorSuggestionArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ColorSuggestion colorSuggestion;
        if (this.h == null || (colorSuggestion = (ColorSuggestion) view.getTag()) == null) {
            return;
        }
        ((ColorPickerSimple) this.h).a.a(colorSuggestion.a);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        if (view instanceof LinearLayout) {
            linearLayout = (LinearLayout) view;
        } else {
            Context context = this.a;
            linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(-1);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f29480_resource_name_obfuscated_res_0x7f080110);
            for (int i2 = 0; i2 < 4; i2++) {
                View view2 = new View(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, dimensionPixelOffset, 1.0f);
                layoutParams.setMarginStart(-1);
                if (i2 == 3) {
                    layoutParams.setMarginEnd(-1);
                }
                view2.setLayoutParams(layoutParams);
                view2.setBackgroundResource(R.drawable.f45810_resource_name_obfuscated_res_0x7f090132);
                linearLayout.addView(view2);
            }
        }
        for (int i3 = 0; i3 < 4; i3++) {
            View childAt = linearLayout.getChildAt(i3);
            int i4 = (i * 4) + i3;
            ColorSuggestion[] colorSuggestionArr = this.g;
            if (i4 >= colorSuggestionArr.length) {
                childAt.setTag(null);
                childAt.setContentDescription(null);
                childAt.setVisibility(4);
            } else {
                childAt.setTag(colorSuggestionArr[i4]);
                childAt.setVisibility(0);
                ColorSuggestion colorSuggestion = colorSuggestionArr[i4];
                ((GradientDrawable) ((LayerDrawable) childAt.getBackground()).findDrawableByLayerId(R.id.color_button_swatch)).setColor(colorSuggestion.a);
                String str = colorSuggestion.b;
                if (TextUtils.isEmpty(str)) {
                    str = String.format("#%06X", Integer.valueOf(colorSuggestion.a & 16777215));
                }
                childAt.setContentDescription(str);
                childAt.setOnClickListener(this);
                childAt.setAccessibilityDelegate(new YW(i4));
            }
        }
        return linearLayout;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((this.g.length + 4) - 1) / 4;
    }
}
