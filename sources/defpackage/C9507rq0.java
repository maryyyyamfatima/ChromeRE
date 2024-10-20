package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9507rq0 extends ArrayAdapter {
    public C9507rq0(Context context, CharSequence[] charSequenceArr) {
        super(context, R.layout.simple_spinner_item, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        a(view2, i);
        return view2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        a(dropDownView, i);
        return dropDownView;
    }

    public static void a(View view, int i) {
        CR0.a(i);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (i == 2) {
                textView.setTypeface(Typeface.MONOSPACE);
            } else if (i == 0) {
                textView.setTypeface(Typeface.SANS_SERIF);
            } else if (i == 1) {
                textView.setTypeface(Typeface.SERIF);
            }
        }
    }
}
