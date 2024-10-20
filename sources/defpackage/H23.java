package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class H23 extends ArrayAdapter {
    public final ArrayList a;
    public final boolean g;

    public H23(int i, Context context, ArrayList arrayList) {
        super(context, i, arrayList);
        this.a = new ArrayList(arrayList);
        this.g = true;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (((R23) this.a.get(i2)).b != 2) {
                this.g = false;
                return;
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        View view2 = super.getView(i, view, viewGroup);
        ArrayList arrayList = this.a;
        ((TextView) view2).setText(((R23) arrayList.get(i)).a);
        if (view2 instanceof CheckedTextView) {
            CheckedTextView checkedTextView = (CheckedTextView) view2;
            if (((R23) arrayList.get(i)).b == 0) {
                if (checkedTextView.getCheckMarkDrawable() != null) {
                    checkedTextView.setTag(checkedTextView.getCheckMarkDrawable());
                    checkedTextView.setCheckMarkDrawable((Drawable) null);
                }
            } else if (checkedTextView.getCheckMarkDrawable() == null) {
                checkedTextView.setCheckMarkDrawable((Drawable) checkedTextView.getTag());
            }
        }
        view2.setEnabled(((R23) arrayList.get(i)).b != 1);
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.g;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return i >= 0 && i < getCount() && ((R23) this.a.get(i)).b == 2;
    }
}
