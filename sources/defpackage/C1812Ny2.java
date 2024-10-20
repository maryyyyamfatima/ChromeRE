package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ny2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812Ny2 extends d {
    public final ColorStateList A;
    public final SparseArray B;
    public boolean C;
    public boolean D;
    public final Drawable z;

    public C1812Ny2(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.B = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.android.chrome.R.id.icon_frame, view.findViewById(com.android.chrome.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.z = view.getBackground();
        if (textView != null) {
            this.A = textView.getTextColors();
        }
    }

    public final View v(int i) {
        SparseArray sparseArray = this.B;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
