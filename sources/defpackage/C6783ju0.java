package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ju0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6783ju0 extends ArrayAdapter {
    public C6783ju0(Activity activity, ArrayList arrayList) {
        super(activity, R.layout.f58990_resource_name_obfuscated_res_0x7f0e01a7, R.id.spinner_item, new ArrayList(arrayList));
    }

    public C6783ju0(Activity activity, ArrayList arrayList, int i) {
        super(activity, R.layout.f58990_resource_name_obfuscated_res_0x7f0e01a7, new ArrayList(arrayList));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        Rect rect = new Rect();
        viewGroup.getBackground().getPadding(rect);
        view2.setPadding(view2.getPaddingLeft() + rect.left, view2.getPaddingTop(), view2.getPaddingRight() + rect.right, view2.getPaddingBottom());
        return view2;
    }
}
