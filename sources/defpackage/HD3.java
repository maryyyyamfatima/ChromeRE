package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HD3 extends FrameLayout {
    public final TypedValue a;
    public final TypedValue g;
    public final TypedValue h;
    public final TypedValue i;

    public HD3(Context context) {
        super(context);
        TypedValue typedValue = new TypedValue();
        this.a = typedValue;
        TypedValue typedValue2 = new TypedValue();
        this.g = typedValue2;
        TypedValue typedValue3 = new TypedValue();
        this.h = typedValue3;
        TypedValue typedValue4 = new TypedValue();
        this.i = typedValue4;
        a(R.dimen.f31020_resource_name_obfuscated_res_0x7f0801bc, typedValue2);
        a(R.dimen.f31010_resource_name_obfuscated_res_0x7f0801bb, typedValue);
        a(R.dimen.f31000_resource_name_obfuscated_res_0x7f0801ba, typedValue4);
        a(R.dimen.f30990_resource_name_obfuscated_res_0x7f0801b9, typedValue3);
    }

    public final void a(int i, TypedValue typedValue) {
        try {
            getContext().getResources().getValue(i, typedValue, true);
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        View.MeasureSpec.getMode(i);
        TypedValue typedValue = z ? this.g : this.a;
        int size = View.MeasureSpec.getSize(i);
        if (typedValue.type != 0) {
            int i3 = displayMetrics.widthPixels;
            size = Math.min((int) typedValue.getFraction(i3, i3), size);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        View.MeasureSpec.getMode(i2);
        TypedValue typedValue2 = z ? this.h : this.i;
        int size2 = View.MeasureSpec.getSize(i2);
        if (typedValue2.type != 0) {
            int i4 = displayMetrics.heightPixels;
            size2 = Math.min((int) typedValue2.getFraction(i4, i4), size2);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
