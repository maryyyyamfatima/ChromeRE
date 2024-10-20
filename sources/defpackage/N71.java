package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class N71 extends C6783ju0 {
    public final int a;
    public TextView g;

    public N71(Activity activity, ArrayList arrayList, String str) {
        super(activity, arrayList);
        insert(str, 0);
        this.a = R.id.spinner_item;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = view == null ? null : (TextView) view.findViewById(this.a);
        this.g = textView;
        if (textView != null) {
            WeakHashMap weakHashMap = Ec4.a;
            view.setPaddingRelative(view.getPaddingStart(), 0, view.getPaddingEnd(), 0);
            this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            AbstractC9771sd.i(R.style.f102580_resource_name_obfuscated_res_0x7f15043f, this.g);
        }
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        if (i == 0) {
            WeakHashMap weakHashMap2 = Ec4.a;
            dropDownView.setPaddingRelative(dropDownView.getPaddingStart(), getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0801fa), dropDownView.getPaddingEnd(), dropDownView.getPaddingBottom());
        }
        return dropDownView;
    }
}
