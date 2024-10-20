package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OE3 extends TextView {
    public C6520j8 a;
    public int g;
    public int h;

    public OE3(Context context) {
        super(context, null);
        setGravity(16);
        setMaxLines(1);
        setTextAppearance(getContext(), R.style.f102580_resource_name_obfuscated_res_0x7f15043f);
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        int max;
        C6520j8 c6520j8 = this.a;
        if (c6520j8 != null) {
            int i5 = this.h;
            int i6 = this.g;
            int i7 = i3 - i;
            int i8 = c6520j8.b;
            c6520j8.b = Math.max(i8, i6);
            c6520j8.c = Math.max(c6520j8.c, i5);
            int i9 = c6520j8.b;
            if (i7 >= i9) {
                max = i6 - i5;
            } else {
                if (i9 != i8) {
                    ArrayList arrayList = c6520j8.a;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        View view = (View) arrayList.get(i10);
                        if (view != this) {
                            view.requestLayout();
                        }
                    }
                }
                max = Math.max(i7 - c6520j8.c, 0);
            }
            if (getLayoutDirection() == 1) {
                i3 -= max;
            } else {
                i += max;
            }
        }
        super.layout(i, i2, i3, i4);
    }
}
