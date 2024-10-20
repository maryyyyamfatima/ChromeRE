package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O71 extends N71 {
    public O71(Activity activity, ArrayList arrayList, String str) {
        super(activity, arrayList, str);
    }

    @Override // defpackage.N71, android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        if (i == getCount() - 1) {
            if (this.g == null) {
                this.g = (TextView) dropDownView.findViewById(this.a);
            }
            this.g.setCompoundDrawablesWithIntrinsicBounds(LN3.a(R.drawable.0_resource_name_obfuscated_res_0x7f090409, R.color.0_resource_name_obfuscated_res_0x7f070113, getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            this.g.setCompoundDrawablePadding(getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801f9));
            AbstractC9771sd.i(R.style.f100520_resource_name_obfuscated_res_0x7f150371, this.g);
            TextView textView = this.g;
            HashMap hashMap = AbstractC8540p04.a;
            textView.setTypeface(Typeface.create("sans-serif-medium", 0));
            WeakHashMap weakHashMap = Ec4.a;
            dropDownView.setPaddingRelative(dropDownView.getPaddingStart(), dropDownView.getPaddingTop(), dropDownView.getPaddingEnd(), getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801fa));
        }
        return dropDownView;
    }
}
