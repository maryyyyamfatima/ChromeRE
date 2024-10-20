package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lM1 */
/* loaded from: classes.dex */
public final class C7282lM1 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList g;
    public final /* synthetic */ C7626mM1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7282lM1(C7626mM1 c7626mM1, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        ColorStateList colorStateList;
        this.h = c7626mM1;
        ColorStateList colorStateList2 = c7626mM1.o;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.g = colorStateList;
        if (c7626mM1.n != 0) {
            ColorStateList colorStateList4 = c7626mM1.o;
            if (colorStateList4 != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                int colorForState = colorStateList4.getColorForState(iArr3, 0);
                int colorForState2 = c7626mM1.o.getColorForState(iArr2, 0);
                int i2 = c7626mM1.n;
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC4242cX.f(colorForState, i2), AbstractC4242cX.f(colorForState2, i2), i2});
            }
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C7626mM1 c7626mM1 = this.h;
            Drawable drawable = null;
            if (c7626mM1.getText().toString().contentEquals(textView.getText())) {
                if (c7626mM1.n != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(c7626mM1.n);
                    if (this.g != null) {
                        colorDrawable.setTintList(this.a);
                        drawable = new RippleDrawable(this.g, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
            }
            WeakHashMap weakHashMap = Ec4.a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
